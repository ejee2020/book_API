package com.example.demo.repository;
import com.example.demo.entity.returnedItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

public interface returnedItemRepository extends JpaRepository<returnedItem, Long>, QuerydslPredicateExecutor<returnedItem>{
}
