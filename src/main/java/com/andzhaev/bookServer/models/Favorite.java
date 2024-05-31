package com.andzhaev.bookServer.models;

import jakarta.persistence.*;

@Table(name = "favorite")
@Entity
public class Favorite {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long textBooks;

    private String title;
    private String author;
    private String genre;
    private String description;
    private int count;

    public Long getTextBooks() {
        return textBooks;
    }

    public void setTextBooks(Long textBooks) {
        this.textBooks = textBooks;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }



    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", textBooks=" + textBooks +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", genre='" + genre + '\'' +
                ", description='" + description + '\'' +
                ", count=" + count +
                '}';
    }
}
