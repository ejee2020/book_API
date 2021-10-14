package com.example.demo.service;
import com.example.demo.repository.bookRepository;
import com.example.demo.repository.returnedItemRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import com.example.demo.dto.returnedItemDTO;
import com.example.demo.entity.returnedItem;
import org.springframework.stereotype.Service;

@Service
@Log4j2
@RequiredArgsConstructor
public class returnedItemServiceImpl implements returnedItemService{
    private final returnedItemRepository repository;
    @Override
    public Long register(returnedItemDTO dto){
        returnedItem entity = dtoToEntity(dto);
        repository.save(entity);
        return null;
    }
}
