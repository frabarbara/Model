package it.gammainnovation.librarymodel;

public class BookStatus{

    /* #################### PROPERTIES #################### */

    public static final String
            RDO = "READONLY",
            AVA = "AVAILABLE",
            BKD = "BOOKED",
            LNT = "LENT",
            DUE = "DUE";

    private String status;

    /* #################### CONSTRUCTORS #################### */

    public BookStatus(String status) {
        if (
                status.compareTo(BookStatus.RDO) != 0
                        && status.compareTo("RDO") != 0
                        && status.compareTo(BookStatus.AVA) != 0
                        && status.compareTo("AVA") != 0
                        && status.compareTo(BookStatus.BKD) != 0
                        && status.compareTo("BKD") != 0
                        && status.compareTo(BookStatus.LNT) != 0
                        && status.compareTo("LNT") != 0
                        && status.compareTo(BookStatus.DUE) != 0
                        && status.compareTo("DUE") != 0
        ) {
            throw new IllegalArgumentException("[BookStatus:CONSTRUCTOR] ERROR: status must be one of the following:\n"
                    + BookStatus.RDO + " (BookStatus.RDO)\n"
                    + "RDO\n"
                    + BookStatus.AVA + " (BookStatus.AVA)\n"
                    + "AVA\n"
                    + BookStatus.BKD + " (BookStatus.BKD)\n"
                    + "BKD\n"
                    + BookStatus.LNT + " (BookStatus.LNT)\n"
                    + "LNT\n"
                    + BookStatus.DUE + " (BookStatus.DUE)\n"
                    + "DUE\n"
            );
        }

        this.status = status;
    }

    /* #################### PRIVATE METHODS #################### */
    /* #################### GETTERS / SETTERS #################### */

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        if (
                status.compareTo(BookStatus.RDO) != 0
                        && status.compareTo(BookStatus.AVA) != 0
                        && status.compareTo(BookStatus.BKD) != 0
                        && status.compareTo(BookStatus.LNT) != 0
                        && status.compareTo(BookStatus.DUE) != 0
        ) {
            throw new IllegalArgumentException("[BookStatus:setStatus] ERROR: status must be one of the following:\n"
                    + BookStatus.RDO + " (BookStatus.RDO)\n"
                    + BookStatus.AVA + " (BookStatus.AVA)\n"
                    + BookStatus.BKD + " (BookStatus.BKD)\n"
                    + BookStatus.LNT + " (BookStatus.LNT)\n"
                    + BookStatus.DUE + " (BookStatus.DUE)\n"
            );
        }

        this.status = status;
    }
}
