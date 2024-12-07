package com.spring.spring_security.common;

public interface OAuth2UserInfo {
    String getProvider();
    String getProviderId();
    String getUserName();
}
