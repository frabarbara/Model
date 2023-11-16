package it.gammainnovation.librarymodel;

public class LoanStatus {

    /* #################### PROPERTIES #################### */

    public static final String
            BKD = "BOOKED",
            ACT = "ACTIVE",
            DUE = "DUE",
            NTF = "NOTIFIED",
            CMP = "COMPLETE";

    private String status;

    /* #################### CONSTRUCTORS #################### */

    public LoanStatus(String status) {
        if (
                status.compareTo(LoanStatus.BKD) != 0
                        && status.compareTo("BKD") != 0
                        && status.compareTo(LoanStatus.ACT) != 0
                        && status.compareTo("ACT") != 0
                        && status.compareTo(LoanStatus.DUE) != 0
                        && status.compareTo("DUE") != 0
                        && status.compareTo(LoanStatus.NTF) != 0
                        && status.compareTo("NTF") != 0
                        && status.compareTo(LoanStatus.CMP) != 0
                        && status.compareTo("CMP") != 0
        ) {
            throw new IllegalArgumentException("[LoanStatus:CONSTRUCTOR] ERROR: status must be one of the following:\n"
                    + LoanStatus.BKD + " (LoanStatus.BKD)\n"
                    + "BKD\n"
                    + LoanStatus.ACT + " (LoanStatus.ACT)\n"
                    + "ACT\n"
                    + LoanStatus.DUE + " (LoanStatus.DUE)\n"
                    + "DUE\n"
                    + LoanStatus.NTF + " (LoanStatus.NTF)\n"
                    + "NTF\n"
                    + LoanStatus.CMP + " (LoanStatus.CMP)\n"
                    + "CMP\n"
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
                status.compareTo(LoanStatus.BKD) != 0
                        && status.compareTo(LoanStatus.ACT) != 0
                        && status.compareTo(LoanStatus.DUE) != 0
                        && status.compareTo(LoanStatus.NTF) != 0
                        && status.compareTo(LoanStatus.CMP) != 0
        ) {
            throw new IllegalArgumentException("[LoanStatus:setStatus] ERROR: status must be one of the following:\n"
                    + LoanStatus.BKD + " (LoanStatus.BKD)\n"
                    + LoanStatus.ACT + " (LoanStatus.ACT)\n"
                    + LoanStatus.DUE + " (LoanStatus.DUE)\n"
                    + LoanStatus.NTF + " (LoanStatus.NTF)\n"
                    + LoanStatus.CMP + " (LoanStatus.CMP)\n"
            );
        }

        this.status = status;
    }
}
