package com.example.mobifonev2.Logging;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Service
public class LoggingService {
    @Autowired
    private LoggingRepository loggingRepository;
    public Page<Logging> findByTitleContainingIgnoreCase(String keyword, Pageable pageable){
        return loggingRepository.findByUsernameContainingIgnoreCase(keyword, pageable);
    }
    public Page<Logging> findAll(Pageable pageable){
        return loggingRepository.findAll(pageable);
    }
    public List<LoggingReport> getCountOfUsersByUsername() {
        List<Object[]> results = loggingRepository.countAllByUsername();

        return results.stream()
                .map(result -> new LoggingReport((String) result[0], ((Number) result[1]).intValue()))
                .collect(Collectors.toList());
    }
}
