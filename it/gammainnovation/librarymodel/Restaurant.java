package it.gammainnovation.librarymodel;

public class Restaurant {

    /* #################### PROPERTIES #################### */
    private String id;
    private Floor floor;
    int numSeats;
    String name;

    /* #################### CONSTRUCTORS #################### */
    /* #################### PRIVATE METHODS #################### */
    /* #################### GETTERS / SETTERS #################### */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Floor getFloor() {
        return floor;
    }

    public void setFloor(Floor floor) {
        this.floor = floor;
    }

    public int getNumSeats() {
        return numSeats;
    }

    public void setNumSeats(int numSeats) {
        this.numSeats = numSeats;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    /* #################### PUBLIC METHODS #################### */

}
