package com.example.springstress.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cache.annotation.CachingConfigurer;
import org.springframework.context.annotation.Bean;

import org.springframework.cache.CacheManager;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class CacheConfig implements CachingConfigurer {

    @Autowired
    private CacheManager ehCacheCacheManager;

    @Autowired
    private CacheManager noticeEhCacheManager;

    @Autowired
    private CacheManager redisCacheManager;

    @Override
    public CacheManager cacheManager() {
        // 기본 CacheManager를 Redis로 설정
        return noticeEhCacheManager;
    }

    @Bean(name = "ehCache")
    public CacheManager ehCacheManager() {
        return ehCacheCacheManager;
    }

    @Primary
    @Bean(name = "noticeEhCache")
    public CacheManager noticeEhCacheManager() {
        return noticeEhCacheManager;
    }

    @Bean(name = "redisCache")
    public CacheManager redisManager() {
        return redisCacheManager;
    }
}