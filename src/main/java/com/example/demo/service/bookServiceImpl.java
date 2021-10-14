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
@RequiredArgsConstructor
@Log4j2
public class bookServiceImpl implements bookService{
    private final bookRepository repository;
    private final bookApiClient bookApiClient;
    @Override
    public Long register(bookDTO dto){
        book entity = dtoToEntity(dto);
        repository.save(entity);
        return null;
    }

    public bookDTO findByKeyword(String keyword){
        return bookApiClient.requestBook(keyword);
    }



}
