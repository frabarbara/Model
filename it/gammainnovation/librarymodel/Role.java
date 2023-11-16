package it.gammainnovation.librarymodel;

public class Role{

    /* #################### PROPERTIES #################### */

    public static final String
            ADM = "ADMIN",
            WTR = "WAITER",
            RCP = "RECEPTIONIST";

    private String role;

    /* #################### CONSTRUCTORS #################### */

    public Role(String role) {
        if (
                role.compareTo(Role.ADM) != 0
                        && role.compareTo("ADM") != 0
                        && role.compareTo(Role.WTR) != 0
                        && role.compareTo("WTR") != 0
                        && role.compareTo(Role.RCP) != 0
                        && role.compareTo("RCP") != 0
        ) {
            throw new IllegalArgumentException("[Role:CONSTRUCTOR] ERROR: role must be one of the following:\n"
                    + Role.ADM + " (Role.ADM)\n"
                    + "ADM\n"
                    + Role.WTR + " (Role.WTR)\n"
                    + "WTR\n"
                    + Role.RCP + " (Role.RCP)\n"
                    + "RCP\n"
            );
        }

        this.role = role;
    }

    /* #################### PRIVATE METHODS #################### */
    /* #################### GETTERS / SETTERS #################### */

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        if (
                role.compareTo(Role.ADM) != 0
                        && role.compareTo(Role.WTR) != 0
                        && role.compareTo(Role.RCP) != 0
        ) {
            throw new IllegalArgumentException("[Role.setRole] ERROR: role must be one of the following:\n"
                    + Role.ADM + " (Role.ADM)\n"
                    + Role.WTR + " (Role.WTR)\n"
                    + Role.RCP + " (Role.RCP)\n"
            );
        }

        this.role = role;
    }
}