package com.example.springstress.service;

import com.example.springstress.entity.Notice;
import com.example.springstress.repository.NoticeRepository;
import org.springframework.cache.annotation.Cacheable;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class NoticeService {
    private final NoticeRepository noticeRepository;

    @Cacheable(cacheNames = "NoticeReadMapper.findAll", cacheManager = "noticeEhCacheManager")
    @Transactional
    public List<Notice> getAllNotices() {
        return noticeRepository.findAll();
    }
}
