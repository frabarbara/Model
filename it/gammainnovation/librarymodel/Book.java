package it.gammainnovation.librarymodel;

public class Book {

    String isbn;
    String title;
    int edition;
    Author author;
    int pub_year;
    Theme theme;
    boolean borrowable;
    BookStatus status;

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getEdition() {
        return edition;
    }

}
