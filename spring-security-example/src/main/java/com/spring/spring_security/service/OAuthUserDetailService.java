package com.spring.spring_security.service;

import com.spring.spring_security.common.OAuth2UserInfo;
import com.spring.spring_security.entity.KakaoUserInfo;
import com.spring.spring_security.entity.User;
import com.spring.spring_security.entity.UserDetail;
import com.spring.spring_security.repository.UserRepository;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.oauth2.client.userinfo.DefaultOAuth2UserService;
import org.springframework.security.oauth2.client.userinfo.OAuth2UserRequest;
import org.springframework.security.oauth2.core.OAuth2AuthenticationException;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
@Log4j2
public class OAuthUserDetailService extends DefaultOAuth2UserService {
    private final PasswordEncoder passwordEncoder;
    private final UserRepository userRepository;

    @Override
    public OAuth2User loadUser(OAuth2UserRequest userRequest) throws OAuth2AuthenticationException {
        log.debug("getClientRegistration = " + userRequest.getClientRegistration()); // registrationId로 어떤 OAuth로 로그인 했는지 확인 가능
        log.debug("getAccessToken = " + userRequest.getAccessToken().getTokenValue());

        OAuth2User oAuth2User = super.loadUser(userRequest);
        // 카카오 로그인 버튼 클릭 -> 카카오 로그인창 -> 로그인을 완료 -> code를 리턴(OAuth2-Client 라이브러리) -> AccessToken 요청
        // userRequest 정보 -> 회원 프로필 받아야함(loadUser함수 호출) -> 카카오로부터 회원프로필 받아준다.
        log.debug("getAttributes = " + oAuth2User.getAttributes());

        OAuth2UserInfo oAuth2UserInfo = null;
        if (userRequest.getClientRegistration().getRegistrationId().equals("kakao")) {
            log.debug("Request Kakao Login");
            oAuth2UserInfo = new KakaoUserInfo(oAuth2User.getAttributes());
        } else {
            log.debug("We only supported kakao.");
        }

        String provider = oAuth2UserInfo.getProvider(); // kakao
        String providerId = oAuth2UserInfo.getProviderId();
        String username = provider + "_" + providerId; // kakao_10021320120
        String password = passwordEncoder.encode("kakaoProviderPassword");
        String role = "ROLE_USER";

        Optional<User> userEntityOptional = userRepository.findByUsername(username);
        User userEntity;

        if (userEntityOptional.isEmpty()) {
            log.debug("Your first Kakao Login.");
            userEntity = User.builder()
                    .username(username)
                    .password(password)
                    .role(role)
                    .provider(provider)
                    .providerId(providerId)
                    .build();
            userRepository.saveAndFlush(userEntity);
        } else {
            log.debug("You already joined this service via kakao.");
            userEntity = userEntityOptional.get();
        }

        // 회원 가입을 강제로 진행해볼 예정
        return new UserDetail(userEntity, oAuth2User.getAttributes());
    }
}