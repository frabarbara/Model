package it.gammainnovation.librarymodel;

public class BooksRoom {
    String id;
    Floor floor;
    Theme theme;

    public Floor getFloor() {
        return floor;
    }

    public void setFloor(Floor floor) {
        this.floor = floor;
    }

    public Theme getTheme() {
        return theme;
    }

    public void setTheme(Theme theme) {
        this.theme = theme;
    }
}