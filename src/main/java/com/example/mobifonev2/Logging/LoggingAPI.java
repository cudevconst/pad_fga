package com.example.mobifonev2.Logging;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping("/api")
public class LoggingAPI {
    @Autowired
    private LoggingService loggingService;
    @GetMapping("")
    public List<LoggingReport> test(){
        return loggingService.getCountOfUsersByUsername();
    }
}
