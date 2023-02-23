package com.example.entities;

import jakarta.persistence.*;
import lombok.*;

import org.hibernate.Hibernate;
    @Getter
    @Setter
    @ToString
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    @Entity
    public class Shop {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @Column(unique = true)
        private String dni;

        private String shopTitle;

        private String telephoneNumber;

        private String[] locations;
        
    }

