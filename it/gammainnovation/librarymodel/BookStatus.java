package it.gammainnovation.librarymodel;
//qui da capire perchè è enum, non classe

public class BookStatus{
    enum id{
        "Rdo",
        "Ava",
        "Bkd",
        "Lnt",
        "Due"
    }

    enum BookStatus {
        READONLY,
        AVAILABLE,
        BOOKED,
        LENT,
        DUE
    }

}
