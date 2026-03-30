package com.project.library.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "categories")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    //@NotBlank(message = "El nombre no puede estar vacio") --Mala practica
    @Column(nullable = false, length = 100, unique = true)
    private String name;
    @Column(length = 500)
    private String description;
    /*@OneToMany(mappedBy = "category", cascade = CascadeType.ALL)
    private List<Book> books;*/
}
