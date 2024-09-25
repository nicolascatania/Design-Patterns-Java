package com.learningSpringBoot.ProductsAPI.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data // Generates getters, setters, toString, equals, and hashCode
@NoArgsConstructor // Generates a no-argument constructor
@AllArgsConstructor // Generates an all-argument constructor
@Entity // Marks this class as a JPA entity
@Table(name = "products") // Specifies the table name in the database
public class Product {

    @Id // Marks the field as the primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Automatically generates the primary key
    private int id;

    private String name;
    private String description;
    private double price;
    private int stock;

    @Column(name = "image_url") // Maps the field to the "image_url" column in the table
    private String image_url;

    @Column(name = "category_id") // Maps the field to the "category_id" column in the table
    private int category_id; // Optional, as per your design
}