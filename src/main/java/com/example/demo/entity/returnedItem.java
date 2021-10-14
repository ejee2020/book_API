package com.example.demo.entity;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString
@Setter
public class returnedItem extends entity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "book_number")
    private Long bookNumber;

    @Column(name = "title")
    private String title;

    @Column(name = "author")
    private String author;

    @Column(name = "description")
    private String description;

    @Column(name = "returned_date")
    private LocalDate returnedDate;


    public static returnedItem createReturnedItem(Long bookNumber, String title, String author, LocalDate returnedDate){
        returnedItem ReturnedItem = new returnedItem();
        ReturnedItem.setBookNumber(bookNumber);
        ReturnedItem.setTitle(title);
        ReturnedItem.setAuthor(author);
        ReturnedItem.setReturnedDate(returnedDate);
        return ReturnedItem;
    }
}
