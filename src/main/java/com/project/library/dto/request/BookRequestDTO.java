package com.project.library.dto.request;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class BookRequestDTO {
    @NotBlank
    @Size(max = 255)
    private String title;
    @NotBlank
    @Size(min = 10, max = 13)
    private String isbn;
    @NotNull
    @Min(1000)
    @Max(2026)
    private int year_publication;
    @PositiveOrZero
    private int stock;
    @NotNull
    private Long categoryId;
    @NotEmpty
    private List<Long> authorsIds;
}
