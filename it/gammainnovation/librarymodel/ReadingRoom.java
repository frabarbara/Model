package it.gammainnovation.librarymodel;

public class ReadingRoom {

    String id;
    int floor;
    int num_seats;
    String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public int getNum_seats() {
        return num_seats;
    }

    public void setNum_seats(int num_seats) {
        this.num_seats = num_seats;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}