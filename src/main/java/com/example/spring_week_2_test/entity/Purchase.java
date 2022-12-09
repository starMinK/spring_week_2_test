package com.example.spring_week_2_test.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Purchase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "puschases")
    private Book book;

    @ManyToOne
    @JoinColumn(name = "member")
    private Member member;
}
