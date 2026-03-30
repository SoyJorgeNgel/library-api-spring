package com.project.library.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "books")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    private String title;
    @Column(unique = true, length = 50)
    private String isbn;
    @Column(nullable = false)
    @Min(value = 1000, message = "Minimo año 1000")
    @Max(value = 2100, message = "Maximo año 2100")
    private int year_publication;
    @Column(nullable = false)
    private int stock;
    //Foreign key
    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;
    @OneToMany(mappedBy = "book", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<AuthorsBooks> authorsBooks;
}
