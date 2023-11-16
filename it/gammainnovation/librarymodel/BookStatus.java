package it.gammainnovation.librarymodel;

public class BookStatus{

    /* #################### PROPERTIES #################### */

    public static final String
            RDO = "RDO",
            AVA = "AVA",
            BKD = "BKD",
            LNT = "LNT",
            DUE = "DUE";

    private String id, description;

    /* #################### CONSTRUCTORS #################### */

    public BookStatus(String id) {
        if (id.compareTo(BookStatus.RDO) == 0) this.description = "READONLY";
        else if (id.compareTo(BookStatus.AVA) == 0) this.description = "AVAILABLE";
        else if (id.compareTo(BookStatus.BKD) == 0) this.description = "BOOKED";
        else if (id.compareTo(BookStatus.LNT) == 0) this.description = "LENT";
        else if (id.compareTo(BookStatus.DUE) == 0) this.description = "DUE";
        else {
            throw new IllegalArgumentException("[BookStatus:CONSTRUCTOR] ERROR: status must be one of the following:\n"
                    + BookStatus.RDO + " (BookStatus.RDO)\n"
                    + BookStatus.AVA + " (BookStatus.AVA)\n"
                    + BookStatus.BKD + " (BookStatus.BKD)\n"
                    + BookStatus.LNT + " (BookStatus.LNT)\n"
                    + BookStatus.DUE + " (BookStatus.DUE)\n"
            );
        }

        this.id = id;
    }

    /* #################### PRIVATE METHODS #################### */
    /* #################### GETTERS / SETTERS #################### */

    public String getId() {
        return id;
    }

    public void setId(String id) {
        if (id.compareTo(BookStatus.RDO) == 0) this.description = "READONLY";
        else if (id.compareTo(BookStatus.AVA) == 0) this.description = "AVAILABLE";
        else if (id.compareTo(BookStatus.BKD) == 0) this.description = "BOOKED";
        else if (id.compareTo(BookStatus.LNT) == 0) this.description = "LENT";
        else if (id.compareTo(BookStatus.DUE) == 0) this.description = "DUE";
        else {
            throw new IllegalArgumentException("[BookStatus:setStatus] ERROR: status must be one of the following:\n"
                    + BookStatus.RDO + " (BookStatus.RDO)\n"
                    + BookStatus.AVA + " (BookStatus.AVA)\n"
                    + BookStatus.BKD + " (BookStatus.BKD)\n"
                    + BookStatus.LNT + " (BookStatus.LNT)\n"
                    + BookStatus.DUE + " (BookStatus.DUE)\n"
            );
        }

        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
