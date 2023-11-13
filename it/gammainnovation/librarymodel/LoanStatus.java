package it.gammainnovation.librarymodel;

public class LoanStatus {

    public enum Id{
        BKD,
        ACT,
        DUE,
        NTF,
        CMP
    }

    public enum Description{
        BOOKED,
        ACTIVE,
        DUE,
        NOTIFIED,
        COMPLETE
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
