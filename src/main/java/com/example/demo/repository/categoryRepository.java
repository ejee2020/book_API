package com.example.demo.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import com.example.demo.entity.category;
public interface categoryRepository extends JpaRepository<category, Long>, QuerydslPredicateExecutor<category>{

}