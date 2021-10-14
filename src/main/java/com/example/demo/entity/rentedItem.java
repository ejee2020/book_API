package com.example.demo.entity;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString(exclude = "user")
@Setter
public class rentedItem extends entity{
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

    @Column(name = "rented_date")
    private LocalDate rentedDate;

    @Column(name = "due_date")
    private LocalDate dueDate;

    @ManyToOne
    private user user;
    public static rentedItem createRentedItem(Long bookNumber, String title, String author, LocalDate rentedDate){
        rentedItem RentedItem = new rentedItem();
        RentedItem.setBookNumber(bookNumber);
        RentedItem.setTitle(title);
        RentedItem.setAuthor(author);
        RentedItem.setRentedDate(rentedDate);
        return RentedItem;
    }
}
