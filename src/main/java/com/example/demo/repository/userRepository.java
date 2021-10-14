package com.example.demo.repository;
import com.example.demo.entity.user;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

public interface userRepository extends JpaRepository<user, Long>, QuerydslPredicateExecutor<user>{

}