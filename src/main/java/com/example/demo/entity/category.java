package com.example.demo.entity;
import lombok.*;

import javax.persistence.*;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString
@Setter
public class category extends entity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "category_number")
    private Long categoryNumber;

    @Column(name = "category_name")
    private String categoryName;

    @Column(name = "description")
    private String description;


    public static category createCategory(Long categoryNumber, String categoryName, String description){
        category Category = new category();
        Category.setCategoryNumber(categoryNumber);
        Category.setCategoryName(categoryName);
        ///Category.setCategorydescription(description);
        return Category;
    }
}
