package it.gammainnovation.librarymodel;

public class Theme {

    /* #################### PROPERTIES #################### */

    public static final String
            STO = "Storia",
            GEO = "Geografia",
            SCI = "Scienza",
            ROM = "Romanzi",
            SOC = "Sociologia";

    private String theme;

    /* #################### CONSTRUCTORS #################### */

    public Theme(String theme) {
        if (
                theme.compareTo(Theme.STO) != 0
                        && theme.compareTo("STO") != 0
                        && theme.compareTo(Theme.GEO) != 0
                        && theme.compareTo("GEO") != 0
                        && theme.compareTo(Theme.SCI) != 0
                        && theme.compareTo("SCI") != 0
                        && theme.compareTo(Theme.ROM) != 0
                        && theme.compareTo("ROM") != 0
                        && theme.compareTo(Theme.SOC) != 0
                        && theme.compareTo("SOC") != 0
        ) {
            throw new IllegalArgumentException("[Theme:CONSTRUCTOR] ERROR: theme must be one of the following:\n"
                    + Theme.STO + " (Theme.STO)\n"
                    + "STO\n"
                    + Theme.GEO + " (Theme.GEO)\n"
                    + "GEO\n"
                    + Theme.SCI + " (Theme.SCI)\n"
                    + "SCI\n"
                    + Theme.ROM + " (Theme.ROM)\n"
                    + "ROM\n"
                    + Theme.SOC + " (Theme.SOC)\n"
                    + "SOC\n"
            );
        }

        this.theme = theme;
    }

    /* #################### PRIVATE METHODS #################### */
    /* #################### GETTERS / SETTERS #################### */

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        if (
                theme.compareTo(Theme.GEO) != 0
                && theme.compareTo(Theme.STO) != 0
                && theme.compareTo(Theme.SCI) != 0
                && theme.compareTo(Theme.ROM) != 0
                && theme.compareTo(Theme.SOC) != 0
        ) {
            throw new IllegalArgumentException("[Theme:setTheme] ERROR: theme must be one of the following:\n"
                    + Theme.GEO + " (Theme.GEO)\n"
                    + Theme.STO + " (Theme.STO)\n"
                    + Theme.SCI + " (Theme.SCI)\n"
                    + Theme.ROM + " (Theme.ROM)\n"
                    + Theme.SOC + " (Theme.SOC)\n"
            );
        }

        this.theme = theme;
    }
}

