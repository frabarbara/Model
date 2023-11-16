package it.gammainnovation.librarymodel;

public class Role{

    /* #################### PROPERTIES #################### */

    public static final String
            ADM = "ADM",
            WTR = "WTR",
            RCP = "RCP";

    private String id;
    private String description;

    /* #################### CONSTRUCTORS #################### */

    public Role(String id) {
        if (id.compareTo(Role.ADM) == 0) this.description = "ADMIN";
        else if (id.compareTo(Role.WTR) == 0) this.description = "WAITER";
        else if (id.compareTo(Role.RCP) == 0) this.description = "RECEPTIONIST";
        else {
            throw new IllegalArgumentException("[Role:CONSTRUCTOR] ERROR: role must be one of the following:\n"
                    + Role.ADM + " (Role.ADM)\n"
                    + Role.WTR + " (Role.WTR)\n"
                    + Role.RCP + " (Role.RCP)\n"
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
        if (id.compareTo(Role.ADM) == 0) this.description = "ADMIN";
        else if(id.compareTo(Role.WTR) == 0) this.description = "WAITER";
        else if(id.compareTo(Role.RCP) == 0) this.description = "RECEPTIONIST";
        else {
            throw new IllegalArgumentException("[Role.setRole] ERROR: role must be one of the following:\n"
                    + Role.ADM + " (Role.ADM)\n"
                    + Role.WTR + " (Role.WTR)\n"
                    + Role.RCP + " (Role.RCP)\n"
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