package it.gammainnovation.librarymodel;

public class Theme {

    /* #################### PROPERTIES #################### */

    public static final String
            STO = "STO",
            GEO = "GEO",
            SCI = "SCI",
            ROM = "ROM",
            SOC = "SOC";

    private String id, description;

    /* #################### CONSTRUCTORS #################### */

    public Theme(String id) {
        if (id.compareTo(Theme.STO) == 0) this.description = "STORIA";
        else if (id.compareTo(Theme.GEO) == 0) this.description = "GEOGRAFIA";
        else if (id.compareTo(Theme.SCI) == 0) this.description = "SCIENZA";
        else if (id.compareTo(Theme.ROM) == 0) this.description = "ROMANZI";
        else if (id.compareTo(Theme.SOC) == 0) this.description = "SOCIOLOGIA";
        else {
            throw new IllegalArgumentException("[Theme:CONSTRUCTOR] ERROR: theme must be one of the following:\n"
                    + Theme.STO + " (Theme.STO)\n"
                    + Theme.GEO + " (Theme.GEO)\n"
                    + Theme.SCI + " (Theme.SCI)\n"
                    + Theme.ROM + " (Theme.ROM)\n"
                    + Theme.SOC + " (Theme.SOC)\n"
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
        if (id.compareTo(Theme.GEO) == 0) this.description = "GEOGRAFIA";
        else if (id.compareTo(Theme.STO) == 0) this.description = "STORIA";
        else if (id.compareTo(Theme.SCI) == 0) this.description = "SCIENZA";
        else if (id.compareTo(Theme.ROM) == 0) this.description = "ROMANZI";
        else if (id.compareTo(Theme.SOC) == 0) this.description = "SOCIOLOGIA";
        else {
            throw new IllegalArgumentException("[Theme:setTheme] ERROR: theme must be one of the following:\n"
                    + Theme.GEO + " (Theme.GEO)\n"
                    + Theme.STO + " (Theme.STO)\n"
                    + Theme.SCI + " (Theme.SCI)\n"
                    + Theme.ROM + " (Theme.ROM)\n"
                    + Theme.SOC + " (Theme.SOC)\n"
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

