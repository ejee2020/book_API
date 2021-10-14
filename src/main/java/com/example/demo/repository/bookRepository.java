package com.example.demo.repository;
import com.example.demo.entity.book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

public interface bookRepository extends JpaRepository<book, Long>, QuerydslPredicateExecutor<book>{
}
