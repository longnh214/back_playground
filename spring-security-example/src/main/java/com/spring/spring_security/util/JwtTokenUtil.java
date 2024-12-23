package com.spring.spring_security.util;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.function.Function;

@Component
@RequiredArgsConstructor
public class JwtTokenUtil {
    @Value("${jwt.secret_key}")
    private String SECRET_KEY;
    @Value("${jwt.expiration_time}")
    private long EXPIRATION_TIME;
    private final UserDetailsService userDetailsService;

    /**
     * JWT에서 사용자 이름을 추출한다.
     *
     * @param token JWT 토큰
     * @return 추출된 사용자 이름 (토큰의 subject 값)
     */
    public String extractUsername(String token) {
        return extractClaim(token, Claims::getSubject);
    }

    /**
     * JWT에서 특정 클레임을 추출한다.
     *
     * @param token          JWT 토큰
     * @param claimsResolver 클레임을 처리하는 함수
     * @param <T>            클레임의 반환 타입
     * @return 추출된 클레임 값
     */
    public <T> T extractClaim(String token, Function<Claims, T> claimsResolver) {
        final Claims claims = extractAllClaims(token);
        return claimsResolver.apply(claims);
    }

    /**
     * JWT에서 모든 클레임을 추출한다.
     *
     * @param token JWT 토큰
     * @return 토큰에 포함된 모든 클레임
     */
    private Claims extractAllClaims(String token) {
        return Jwts.parserBuilder()
                .setSigningKey(SECRET_KEY) // 비밀 키를 설정
                .build()
                .parseClaimsJws(token) // 토큰 파싱
                .getBody(); // 클레임 반환
    }

    /**
     * 사용자 정보를 기반으로 JWT를 생성한다.
     *
     * @param userDetails 인증된 사용자 정보
     * @return 생성된 JWT 토큰
     */
    public String generateToken(UserDetails userDetails) {
        return Jwts.builder()
                .setSubject(userDetails.getUsername()) // subject에 사용자 이름 설정
                .setIssuedAt(new Date(System.currentTimeMillis())) // 발급 시간 설정
                .setExpiration(new Date(System.currentTimeMillis() + EXPIRATION_TIME)) // 만료 시간 설정
                .signWith(SignatureAlgorithm.HS256, SECRET_KEY) // 서명 알고리즘 및 비밀 키 설정
                .compact(); // 최종적으로 토큰 생성
    }

    /**
     * JWT의 유효성을 검사한다.
     *
     * @param token       JWT 토큰
     * @param userDetails 인증된 사용자 정보
     * @return 토큰이 유효한 경우 true, 그렇지 않으면 false
     */
    public boolean isTokenValid(String token, UserDetails userDetails) {
        final String username = extractUsername(token); // 토큰에서 사용자 이름 추출
        return username.equals(userDetails.getUsername()) // 사용자 이름이 일치하는지 확인
                && !isTokenExpired(token); // 토큰이 만료되지 않았는지 확인
    }

    /**
     * JWT가 만료되었는지 확인한다.
     *
     * @param token JWT 토큰
     * @return 만료된 경우 true, 그렇지 않으면 false
     */
    private boolean isTokenExpired(String token) {
        return extractClaim(token, Claims::getExpiration).before(new Date());
    }

    /**
     * JWT 토큰을 기반으로 Authentication 객체를 생성합니다.
     *
     * @param token JWT 토큰
     * @return 생성된 Authentication 객체
     */
    public Authentication getAuthentication(String token, UserDetails userDetails) {
        // 토큰에서 사용자 이름 추출
        String username = extractUsername(token);

        // 사용자 이름이 UserDetails의 username과 일치하는지 확인
        if (!username.equals(userDetails.getUsername())) {
            throw new IllegalArgumentException("JWT 토큰의 사용자 정보가 일치하지 않습니다.");
        }

        // UserDetails를 기반으로 Authentication 객체 생성 및 반환
        return new UsernamePasswordAuthenticationToken(
                userDetails,
                null,
                userDetails.getAuthorities() // 권한 정보 포함
        );
    }
}