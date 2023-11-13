package it.gammainnovation.librarymodel;

public class BooksRoom {
    String id;
    int floorId;
    Theme.Id theme;

    public int getFloor() {
        return floorId;
    }

    public void setFloor(int floor) {
        this.floorId = floor;
    }

    public Theme.Id getTheme() {
        return theme;
    }

    public void setTheme(Theme.Id theme) {
        this.theme = theme;
    }
}