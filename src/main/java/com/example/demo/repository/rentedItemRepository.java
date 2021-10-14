package com.example.demo.repository;
import com.example.demo.entity.rentedItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

public interface rentedItemRepository extends JpaRepository<rentedItem, Long>, QuerydslPredicateExecutor<rentedItem>{
}
