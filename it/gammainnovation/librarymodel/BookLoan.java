package it.gammainnovation.librarymodel;

import java.util.Date;

public class BookLoan {
    int id;
    User user;
    Book book;
    LoanStatus status;
    Date startLoan, endLoan;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public LoanStatus getStatus() {
        return status;
    }

    public void setStatus(LoanStatus status) {
        this.status = status;
    }

    public Date getStartLoan() {
        return startLoan;
    }

    public void setStartLoan(Date startLoan) {
        this.startLoan = startLoan;
    }

    public Date getEndLoan() {
        return endLoan;
    }

    public void setEndLoan(Date endLoan) {
        this.endLoan = endLoan;
    }
}
