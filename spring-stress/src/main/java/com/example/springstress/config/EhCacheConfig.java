package com.example.springstress.config;

import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.jcache.JCacheCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.cache.CacheManager;
import javax.cache.Caching;
import javax.cache.configuration.MutableConfiguration;
import javax.cache.expiry.CreatedExpiryPolicy;
import javax.cache.expiry.Duration;
import javax.cache.spi.CachingProvider;

@EnableCaching
@Configuration
public class EhCacheConfig {

    @Bean
    public org.springframework.cache.CacheManager cacheManager() {
        CachingProvider cachingProvider = Caching.getCachingProvider();
        CacheManager jCacheManager = cachingProvider.getCacheManager();
        javax.cache.configuration.Configuration<Object, Object> configuration = new MutableConfiguration<>()
                .setTypes(Object.class, Object.class)
                .setExpiryPolicyFactory(CreatedExpiryPolicy.factoryOf(Duration.ONE_MINUTE))
                .setStoreByValue(false)
                .setStatisticsEnabled(true);
        jCacheManager.createCache("productCache",configuration);

        return new JCacheCacheManager(jCacheManager);
    }
}