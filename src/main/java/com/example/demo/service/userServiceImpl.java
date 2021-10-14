package com.example.demo.service;
import com.example.demo.repository.bookRepository;
import com.example.demo.repository.userRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import com.example.demo.dto.userDTO;
import com.example.demo.entity.user;
import org.springframework.stereotype.Service;

@Service
@Log4j2
@RequiredArgsConstructor
public class userServiceImpl implements userService{
    private final userRepository repository;
    @Override
    public Long register(userDTO dto){
        user entity = dtoToEntity(dto);
        repository.save(entity);
        return null;
    }
}
