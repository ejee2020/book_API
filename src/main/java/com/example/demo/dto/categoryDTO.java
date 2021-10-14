package com.example.demo.dto;

import com.example.demo.entity.book;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class categoryDTO implements Serializable {
    private Long id;
    private Long categoryNumber;
    private String categoryName;
    private String description;
    private book book;
}
