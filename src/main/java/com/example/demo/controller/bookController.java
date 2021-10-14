package com.example.demo.controller;
import com.example.demo.dto.bookDTO;
import com.example.demo.service.bookServiceImpl;
import com.example.demo.service.searchServiceImpl;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.service.bookService;

@RequestMapping("/sample")
@Log4j2
@RequiredArgsConstructor
@Controller
public class bookController{
    @GetMapping("/ex1")
    public void ex1(){
        log.info("ex1.....");
    }

    @GetMapping("/search")
    public void search(){

        log.info("search.....");
    }

}