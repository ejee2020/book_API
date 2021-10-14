package com.example.demo.controller;

import com.example.demo.dto.bookDTO;
import com.example.demo.service.searchServiceImpl;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Log4j2
@RequiredArgsConstructor
@RequestMapping("/search")
public class searchController {
    private final searchServiceImpl searchService;

    @GetMapping("/book/{keyword}")
    public bookDTO get(@PathVariable String keyword){
        log.info(keyword);
        return searchService.findByKeyword(keyword);
    }
}
