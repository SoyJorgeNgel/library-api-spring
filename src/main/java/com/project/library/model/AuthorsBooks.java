package com.project.library.model;

import jakarta.persistence.*;

@Entity
@Table(name = "authors_books")
public class AuthorsBooks {
    @EmbeddedId
    private AuthorsBooksId id = new AuthorsBooksId();
    @ManyToOne
    @MapsId("authorId")
    @JoinColumn(name = "author_id")
    private Author author;

    @ManyToOne
    @MapsId("bookId")
    @JoinColumn(name = "book_id")
    private Book book;
}
