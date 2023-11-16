package it.gammainnovation.librarymodel;

import java.util.Date;

public class ReadingRoomBooking {

    int id;
    User user;
    ReadingRoom readingRoom;
    ReadingRoomTurn turn;
    Date day;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public ReadingRoom getReadingRoom() {
        return readingRoom;
    }

    public void setReadingRoom(ReadingRoom readingRoom) {
        this.readingRoom = readingRoom;
    }

    public ReadingRoomTurn getTurn() {
        return turn;
    }

    public void setTurn(ReadingRoomTurn turn) {
        this.turn = turn;
    }

    public Date getDay() {
        return day;
    }

    public void setDay(Date day) {
        this.day = day;
    }
}
