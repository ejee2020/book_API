package com.example.demo.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDate;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class returnedItemDTO implements Serializable {
    private Long id;
    private Long bookNumber;
    private String title;
    private String author;
    private String description;
    private LocalDate returnedDate;
}
