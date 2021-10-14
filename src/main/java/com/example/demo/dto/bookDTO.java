package com.example.demo.dto;

import com.example.demo.entity.category;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class bookDTO implements Serializable {
    private Long id;
    private String isbn;
    private String title;
    private String author;
    private String description;
    private category category;
    private int display;
    private int price;
    public Item[] items;
    @Data
    public static class Item {
        public String title;
        public String link;
        public String image;
        public String author;
        public int price;
        public String discount;
        public String publisher;
        public Date pubDate;
        public String isbn;
        public String description; }

}
