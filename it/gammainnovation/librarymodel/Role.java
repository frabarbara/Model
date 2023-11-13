package it.gammainnovation.librarymodel;

class Role{
    public enum Id{
        ADM,
        WTR,
        RCP
    }
    public enum Description{
        ADMIN,
        WAITER,
        RECEPTIONIST
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