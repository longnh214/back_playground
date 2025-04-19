package com.example.springstress.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CachingConfigurer;
import org.springframework.context.annotation.Bean;

import org.springframework.cache.CacheManager;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CacheConfig implements CachingConfigurer {

    @Autowired
    private CacheManager ehCacheCacheManager;

    @Autowired
    private CacheManager redisCacheManager;

    @Override
    public CacheManager cacheManager() {
        // 기본 CacheManager를 Redis로 설정
        return redisCacheManager;
    }

    @Bean(name = "ehCache")
    public CacheManager ehCacheManager() {
        return ehCacheCacheManager;
    }

    @Bean(name = "redisCache")
    public CacheManager redisManager() {
        return redisCacheManager;
    }
}