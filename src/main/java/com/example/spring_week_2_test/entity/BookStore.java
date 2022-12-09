package com.example.spring_week_2_test.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class BookStore {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String location;

    @Column(nullable = false)
    private String name;

    //member 단방향
    @ManyToOne
    @JoinColumn(name = "bookstore")
    Member member;

    //books 양방향
    @OneToMany(mappedBy = "bookstore")
    private List<Book> books = new ArrayList<>();
    }