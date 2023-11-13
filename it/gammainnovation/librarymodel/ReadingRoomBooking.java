package it.gammainnovation.librarymodel;

public class ReadingRoomBooking {

    int id;
    String userId, readingRoomId, turnId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getReadingRoomId() {
        return readingRoomId;
    }

    public void setReadingRoomId(String readingRoomId) {
        this.readingRoomId = readingRoomId;
    }

    public String getTurnId() {
        return turnId;
    }

    public void setTurnId(String turnId) {
        this.turnId = turnId;
    }
}
