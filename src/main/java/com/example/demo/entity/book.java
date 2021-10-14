package com.example.demo.entity;
import lombok.*;

import javax.persistence.*;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString(exclude = "category")
@Setter
public class book extends entity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "isbn")
    private String isbn;

    @Column(name = "title")
    private String title;

    @Column(name = "author")
    private String author;

    @Column(name = "description")
    private String description;

    @Column(name = "price")
    private int price;

    @ManyToOne(fetch = FetchType.LAZY)
    private category category;

    public static book createBook(String title, String author, String description, int price ,String isbn){
        book Book = new book();
        Book.setAuthor(author);
        Book.setTitle(title);
        Book.setDescription(description);
        Book.setPrice(price);
        Book.setIsbn(isbn);
        return Book;
    }
}
