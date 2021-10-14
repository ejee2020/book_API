package com.example.demo.service;
import com.example.demo.entity.bookApiClient;
import com.example.demo.repository.bookRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import com.example.demo.dto.bookDTO;
import com.example.demo.entity.book;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.transaction.Transactional;

@Service
//@RequiredArgsConstructor
@Log4j2
public class searchServiceImpl{
    private final bookApiClient bookApiClient;
    public searchServiceImpl(@Lazy bookApiClient bookApiClient1){
        this.bookApiClient = bookApiClient1;
    }
    public bookDTO findByKeyword(String keyword){
        return bookApiClient.requestBook(keyword);
    }
}
