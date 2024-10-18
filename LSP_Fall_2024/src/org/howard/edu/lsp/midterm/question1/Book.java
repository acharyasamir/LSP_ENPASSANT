package org.howard.edu.lsp.midterm.question1;

/**
 * Represents a book in a library with attributes: title, author, ISBN, and yearPublished.
 */
public class Book {
    private String title;
    private String author;
    private String ISBN;
    private int yearPublished;

    // Constructor to initialize the Book object with given values
    public Book(String title, String author, String ISBN, int yearPublished) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.yearPublished = yearPublished;
    }

    // Getters and setters for encapsulation
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

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }

    // Overriding the equals method to compare books by ISBN and author
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Book other = (Book) obj;
        // Check if the ISBN and author are the same
        return this.ISBN.equals(other.ISBN) && this.author.equals(other.author);
    }

    // Overriding the toString method to print the book details in a readable way
    @Override
    public String toString() {
        return "Title: " + title + ", Author: " + author + ", ISBN: " + ISBN + ", Year Published: " + yearPublished;
    }
}

