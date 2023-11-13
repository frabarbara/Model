package it.gammainnovation.librarymodel;

public class BookStatus{
    public enum Id{
        RDO,
        AVA,
        BKD,
        LNT,
        DUE
    }

    public enum Description {
        READONLY,
        AVAILABLE,
        BOOKED,
        LENT,
        DUE
    }

    Id id;
    Description description;

    public Id getId() {
        return id;
    }

    public void setId(Id id) {
        this.id = id;
    }

    public Description getDescription() {
        return description;
    }

    public void setDescription(Description description) {
        this.description = description;
    }

}
