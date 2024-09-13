package com.example.jmetertestapp.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@Entity
@Table(name = "users")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class User {
    @Id
            @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;
}
