package com.project.library.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.EqualsAndHashCode;

@Embeddable
@EqualsAndHashCode
public class AuthorsBooksId {
    @Column(name = "author_id")
    private Long authorId;
    @Column(name = "book_id")
    private Long bookId;
}
