package com.project.library.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookResponseDTO {
    private Long id;
    private String title;
    private String isbn;
    private int year_publication;
    private int stock;
    private CategoryResponseDTO category;
    private List<AuthorResponseDTO> authors;
}
