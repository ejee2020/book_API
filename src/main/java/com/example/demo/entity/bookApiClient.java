package com.example.demo.entity;

import com.example.demo.dto.bookDTO;
import com.example.demo.repository.bookRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Lazy;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.http.HttpHeaders;

import javax.inject.Inject;
import java.util.List;

@Service
public class bookApiClient {
    @Autowired
    private bookRepository bookRepository;
    public bookApiClient(RestTemplateBuilder builder) {
        this.restTemplate = builder.build();
    }
    private final RestTemplate restTemplate;
    private final String CLIENT_ID = "7meXMpUWQw_MQnVKkHlB";
    private final String CLIENT_SECRET = "jpromLHzfj";
    private final String OpenNaverBookUrl = "https://openapi.naver.com/v1/search/book.json?query={keyword}";
    public bookDTO requestBook(String keyword){
        final HttpHeaders headers = new HttpHeaders();
        headers.set("X-Naver-Client-Id", CLIENT_ID);
        headers.set("X-Naver-Client-Secret", CLIENT_SECRET);
        final HttpEntity<bookDTO> entity = new HttpEntity<>(headers);
        ResponseEntity<bookDTO> responseEntity = restTemplate.exchange(OpenNaverBookUrl, HttpMethod.GET, entity, bookDTO.class, keyword);
        bookDTO body = responseEntity.getBody();
        bookDTO.Item[] items = body.getItems();
        for (bookDTO.Item item : items){
            book created = book.createBook(item.title, item.author, item.description, item.price, item.isbn);
            bookRepository.save(created);
        }
        return responseEntity.getBody();

    }
}
