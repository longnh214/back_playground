package com.example.springstress.controller;

import com.example.springstress.entity.Notice;
import com.example.springstress.service.NoticeService;
import lombok.RequiredArgsConstructor;
import org.springframework.cache.Cache;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.cache.CacheManager;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class NoticeController {
    private final NoticeService noticeService;
    private final CacheManager cacheManager;

    @GetMapping("/notice")
    public List<Notice> findAll(){
        return noticeService.getAllNotices();
    }

    @GetMapping("/ehcache")
    public Object findEhcache() {
        List<Map<String, List<String>>> result = cacheManager.getCacheNames().stream()
                .map(cacheName -> {
                    Cache cache = cacheManager.getCache(cacheName);
                    javax.cache.Cache<Object, Object> jcache = (javax.cache.Cache<Object, Object>) cache.getNativeCache();

                    Map<String, List<String>> entry = new HashMap<>();

                    for (javax.cache.Cache.Entry<Object, Object> cacheEntry : jcache) {
                        Object value = cacheEntry.getValue();
                        if (value != null) {
                            entry.computeIfAbsent(cacheName, k -> new ArrayList<>()).add(value.toString());
                        }
                    }

                    return entry;
                })
                .collect(Collectors.toList());

        return result;
    }
}