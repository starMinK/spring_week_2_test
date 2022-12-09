package com.example.spring_week_2_test.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String author;

    @Column(nullable = false)
    private int price;

    @Column(nullable = false)
    private Long quantity;

    @Column(nullable = true)
    private Long bookStoreId;

    //bookstore 양방향
    @ManyToOne
    @JoinColumn(name = "bookstore_id")
    private BookStore bookStore;

    //purchases 양방향
    @OneToMany(mappedBy = "puschases")
    private List<Purchase> purchases = new ArrayList<>();
}