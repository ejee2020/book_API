package com.example.demo.service;
import com.example.demo.repository.categoryRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import com.example.demo.dto.categoryDTO;
import com.example.demo.entity.category;
import org.springframework.stereotype.Service;

@Service
@Log4j2
@RequiredArgsConstructor
public class categoryServiceImpl implements categoryService{
    private final categoryRepository repository;
    @Override
    public Long register(categoryDTO dto){
        category entity = dtoToEntity(dto);
        repository.save(entity);
        return null;
    }
}
