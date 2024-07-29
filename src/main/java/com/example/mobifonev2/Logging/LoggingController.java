package com.example.mobifonev2.Logging;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Controller
@RequestMapping("/logging")
public class LoggingController {
    @Autowired
    private LoggingService loggingService;

    @GetMapping("")
    public String findTitlePage(Model model, @RequestParam(required = false) String keyword,
                                       @RequestParam(defaultValue = "1") int page,
                                       @RequestParam(defaultValue = "10") int size,
                                       @RequestParam(defaultValue = "id,asc") String[] sort) {
        try {
            List<Logging> loggings = new ArrayList<Logging>();

            String sortField = sort[0];
            String sortDirection = sort[1];

            Sort.Direction direction = sortDirection.equals("desc") ? Sort.Direction.DESC : Sort.Direction.ASC;
            Sort.Order order = new Sort.Order(direction, sortField);

            Pageable pageable = PageRequest.of(page - 1, size, Sort.by(order));

            Page<Logging> pageTuts;
            if (keyword == null) {
                pageTuts = loggingService.findAll(pageable);
            } else {
                pageTuts = loggingService.findByTitleContainingIgnoreCase(keyword, pageable);
            }
        loggings = pageTuts.getContent();

        model.addAttribute("logging", loggings);
        model.addAttribute("currentPage", pageTuts.getNumber() + 1);
        model.addAttribute("totalItems", pageTuts.getTotalElements());
        model.addAttribute("totalPages", pageTuts.getTotalPages());
        model.addAttribute("pageSize", size);
        model.addAttribute("sortField", sortField);
        model.addAttribute("sortDirection", sortDirection);
        model.addAttribute("reverseSortDirection", sortDirection.equals("asc") ? "desc" : "asc");
    } catch (Exception e) {
        model.addAttribute("message", e.getMessage());
    }
    return "logging";
    }

    @GetMapping("/report")
    public String countAllReport(Model model){
        List<LoggingReport> reports = loggingService.getCountOfUsersByUsername();
        model.addAttribute("reports", reports);
        return "report";
    }
}
