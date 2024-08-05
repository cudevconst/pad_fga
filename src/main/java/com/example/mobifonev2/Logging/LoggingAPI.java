package com.example.mobifonev2.Logging;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class LoggingAPI {
    @Autowired
    private LoggingService loggingService;
    @Autowired
    private LoggingRepository loggingRepository;
<<<<<<< HEAD

=======
>>>>>>> 728a992269e842f1ed34f6c652135a78285d16c1
    @GetMapping("")
    public List<Logging> test(){
        return loggingRepository.findAll();
    }
}
