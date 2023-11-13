package it.gammainnovation.librarymodel;

public class Theme{
    public enum Id{
        STO,
        GEO,
        SCI,
        ROM,
        SOC
    }
    public enum Description {
        STORIA,
        GEOGRAFIA,
        SCIENZA,
        ROMANZI,
        SOCIOLOGIA
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

