package it.gammainnovation.librarymodel;

public class LoanStatus {

    /* #################### PROPERTIES #################### */

    public static final String
            BKD = "BKD",
            ACT = "ACT",
            DUE = "DUE",
            NTF = "NTF",
            CMP = "CMP";

    private String id, description;

    /* #################### CONSTRUCTORS #################### */

    public LoanStatus(String id) {
        if (id.compareTo(LoanStatus.BKD) == 0) this.description = "BOOKED";
        else if (id.compareTo(LoanStatus.ACT) == 0) this.description = "ACTIVE";
        else if (id.compareTo(LoanStatus.DUE) == 0) this.description = "DUE";
        else if (id.compareTo(LoanStatus.NTF) == 0) this.description = "NOTIFIED";
        else if (id.compareTo(LoanStatus.CMP) == 0) this.description = "COMPLETE";
        else {
            throw new IllegalArgumentException("[LoanStatus:CONSTRUCTOR] ERROR: status must be one of the following:\n"
                    + LoanStatus.BKD + " (LoanStatus.BKD)\n"
                    + LoanStatus.ACT + " (LoanStatus.ACT)\n"
                    + LoanStatus.DUE + " (LoanStatus.DUE)\n"
                    + LoanStatus.NTF + " (LoanStatus.NTF)\n"
                    + LoanStatus.CMP + " (LoanStatus.CMP)\n"
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
        if (id.compareTo(LoanStatus.BKD) == 0) this.description = "BOOKED";
        else if (id.compareTo(LoanStatus.ACT) == 0) this.description = "ACTIVE";
        else if (id.compareTo(LoanStatus.DUE) == 0) this.description = "DUE";
        else if (id.compareTo(LoanStatus.NTF) == 0) this.description = "NOTIFIED";
        else if (id.compareTo(LoanStatus.CMP) == 0) this.description = "COMPLETE";
        else {
            throw new IllegalArgumentException("[LoanStatus:setStatus] ERROR: status must be one of the following:\n"
                    + LoanStatus.BKD + " (LoanStatus.BKD)\n"
                    + LoanStatus.ACT + " (LoanStatus.ACT)\n"
                    + LoanStatus.DUE + " (LoanStatus.DUE)\n"
                    + LoanStatus.NTF + " (LoanStatus.NTF)\n"
                    + LoanStatus.CMP + " (LoanStatus.CMP)\n"
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
