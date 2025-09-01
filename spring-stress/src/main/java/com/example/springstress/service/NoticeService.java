package com.example.springstress.service;

import com.example.springstress.entity.Notice;
import com.example.springstress.repository.NoticeRepository;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.cache.annotation.Cacheable;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class NoticeService {
    private final NoticeRepository noticeRepository;

    @Cacheable(cacheNames = "NoticeReadMapper.findAll", cacheManager = "noticeEhCacheManager")
    @Transactional
    public List<Notice> getAllNotices() {
        return noticeRepository.findAll();
    }

    @Cacheable(value = "NoticeReadMapper.findByPage", key = "#request.requestURI + '-' + #pageNumber", condition = "#pageNumber <= 5", cacheManager = "noticeEhCacheManager")
    public List<Notice> findByPage(HttpServletRequest request, int pageNumber) {
        int startIdx = (pageNumber - 1) * 10;
        int offset = 10;
        return noticeRepository.findAll(PageRequest.of(startIdx, offset)).stream().toList();
    }
}
