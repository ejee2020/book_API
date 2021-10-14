package com.example.demo.entity;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString
@Setter

public class user extends entity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name  = "user_id")
    private Long userId;

    @Column(name = "rental_status")
    private String rentalStatus;

    @Column(name = "late_fee")
    private Long lateFee;

    @Builder.Default
    @OneToMany(fetch = FetchType.LAZY)
    private Set<rentedItem> rentedItems = new HashSet<>();

    @Builder.Default
    @OneToMany(fetch = FetchType.LAZY)
    private Set<returnedItem> returnedItems = new HashSet<>();

    @Builder
    public static user createUser(Long userId){
        user user = new user();
        user.setUserId(userId);
        user.setRentalStatus("RENTAL_AVALIABLE");
        user.setLateFee(0L);
        return user;
    }
    public boolean rentalAvailable(){
        return this.rentalStatus == "RENTAL_AVAILABLE";
    }
    public user rentBook(Long bookNumber, String title, String author, LocalDate rentedDate){
        rentedItem RentedItem = rentedItem.createRentedItem(bookNumber, title, author, rentedDate);
        this.rentedItems.add(RentedItem);
        return this;
    }
}
