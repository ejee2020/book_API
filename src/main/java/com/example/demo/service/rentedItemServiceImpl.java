package com.example.demo.service;
import com.example.demo.repository.bookRepository;
import com.example.demo.repository.rentedItemRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import com.example.demo.dto.rentedItemDTO;
import com.example.demo.entity.rentedItem;
import org.springframework.stereotype.Service;

@Service
@Log4j2
@RequiredArgsConstructor
public class rentedItemServiceImpl implements rentedItemService{
    private final rentedItemRepository repository;
    @Override
    public Long register(rentedItemDTO dto){
        rentedItem entity = dtoToEntity(dto);
        repository.save(entity);
        return null;
    }
}
