package com.example.demo.dto;


import com.example.demo.entity.rentedItem;
import com.example.demo.entity.returnedItem;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class userDTO implements Serializable {
    private Long id;
    private Long userId;
    private String rentalStatus;
    private Long lateFee;
    private Set<rentedItem> rentedItems = new HashSet<>();
    private Set<returnedItem> returnedItems = new HashSet<>();

}
