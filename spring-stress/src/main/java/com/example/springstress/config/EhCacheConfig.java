package com.example.springstress.config;


import org.ehcache.config.builders.CacheConfigurationBuilder;
import org.ehcache.config.builders.ExpiryPolicyBuilder;
import org.ehcache.config.builders.ResourcePoolsBuilder;
import org.ehcache.jsr107.Eh107Configuration;
import org.ehcache.jsr107.EhcacheCachingProvider;
import org.springframework.cache.jcache.JCacheCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.cache.CacheManager;
import javax.cache.Caching;
import javax.cache.configuration.MutableConfiguration;
import javax.cache.expiry.CreatedExpiryPolicy;
import javax.cache.expiry.Duration;
import javax.cache.spi.CachingProvider;
import java.time.temporal.ChronoUnit;

@Configuration
public class EhCacheConfig {

    @Bean("ehCacheCacheManager")
    public org.springframework.cache.CacheManager cacheManager() {
        CachingProvider cachingProvider = Caching.getCachingProvider();
        CacheManager jCacheManager = cachingProvider.getCacheManager();
        javax.cache.configuration.Configuration<Object, Object> configuration =
                new MutableConfiguration<>()
                        .setTypes(Object.class, Object.class)
                        .setExpiryPolicyFactory(CreatedExpiryPolicy.factoryOf(Duration.ONE_MINUTE))
                        .setStoreByValue(false)
                        .setStatisticsEnabled(true);
        jCacheManager.createCache("ehCache", configuration);

        return new JCacheCacheManager(jCacheManager);
    }

    @Bean("noticeCacheManager")
    public org.springframework.cache.CacheManager noticeCacheManager() {
        CachingProvider cachingProvider = Caching.getCachingProvider(EhcacheCachingProvider.class.getName());
        javax.cache.CacheManager jcacheManager = cachingProvider.getCacheManager();

        // 기본 캐시 구성 예시
        javax.cache.configuration.Configuration<Object, Object> defaultCacheConfig =
                Eh107Configuration.fromEhcacheCacheConfiguration(
                        CacheConfigurationBuilder.newCacheConfigurationBuilder(
                                        Object.class,
                                        Object.class,
                                        ResourcePoolsBuilder.heap(1000))
                                .withExpiry(ExpiryPolicyBuilder.timeToLiveExpiration(java.time.Duration.of(10, ChronoUnit.SECONDS)))
                                .build()
                );


        // 캐시 생성(예: defaultCache)
        jcacheManager.createCache("defaultCache", defaultCacheConfig);

        // NoticeReadMapper.findAll 캐시
        javax.cache.configuration.Configuration<Object, Object> findAllCacheConfig =
                Eh107Configuration.fromEhcacheCacheConfiguration(
                        CacheConfigurationBuilder.newCacheConfigurationBuilder(
                                        Object.class,
                                        Object.class,
                                        ResourcePoolsBuilder.heap(10000))
                                .withExpiry(ExpiryPolicyBuilder.timeToLiveExpiration(java.time.Duration.of(10, ChronoUnit.SECONDS)))
                                .build()
                );

        jcacheManager.createCache("NoticeReadMapper.findAll", findAllCacheConfig);

        // NoticeReadMapper.findByPage 캐시
        javax.cache.configuration.Configuration<Object, Object> findByPageCacheConfig =
                Eh107Configuration.fromEhcacheCacheConfiguration(
                        CacheConfigurationBuilder.newCacheConfigurationBuilder(
                                        Object.class,
                                        Object.class,
                                        ResourcePoolsBuilder.heap(10000))
                                .withExpiry(ExpiryPolicyBuilder.timeToLiveExpiration(java.time.Duration.of(10, ChronoUnit.SECONDS)))
                                .build()
                );

        jcacheManager.createCache("NoticeReadMapper.findByPage", findByPageCacheConfig);

        // Spring의 CacheManager로 감싸서 반환
        return new JCacheCacheManager(jcacheManager);
    }
}