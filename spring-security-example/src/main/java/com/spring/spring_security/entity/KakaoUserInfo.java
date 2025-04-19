package com.spring.spring_security.entity;

import com.spring.spring_security.common.OAuth2UserInfo;

import java.util.Map;

public class KakaoUserInfo implements OAuth2UserInfo {

    private Map<String, Object> attributes; // getAttributes()
    public KakaoUserInfo(Map<String, Object> attributes) {
        this.attributes = attributes;
    }

    @Override
    public String getProvider() {
        return "kakao";
    }

    @Override
    public String getProviderId() {
        return String.valueOf(attributes.get("id"));
    }

    @Override
    public String getUserName() {
        return (String) attributes.get("name");
    }
}