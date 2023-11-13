package it.gammainnovation.librarymodel;

public class Book {

    String id;
    String isbn;
    String title;
    int edition;
    String authorId;
    int pubYear;
    Theme.Id theme;
    boolean borrowable;
    BookStatus.Id status;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setEdition(int edition) {
        this.edition = edition;
    }

    public String getAuthorId() {
        return authorId;
    }

    public void setAuthorId(String authorId) {
        this.authorId = authorId;
    }

    public int getPubYear() {
        return pubYear;
    }

    public void setPubYear(int pubYear) {
        this.pubYear = pubYear;
    }

    public Theme.Id getTheme() {
        return theme;
    }

    public void setTheme(Theme.Id theme) {
        this.theme = theme;
    }

    public boolean isBorrowable() {
        return borrowable;
    }

    public void setBorrowable(boolean borrowable) {
        this.borrowable = borrowable;
    }

    public BookStatus.Id getStatus() {
        return status;
    }

    public void setStatus(BookStatus.Id status) {
        this.status = status;
    }

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
