package it.gammainnovation.librarymodel;

import java.util.Date;

public class Maintenance {
    ReadingRoom room;
    Date startMaintenance;
    int duration, id;

    public ReadingRoom getRoom() {
        return room;
    }

    public void setRoom(ReadingRoom room) {
        this.room = room;
    }

    public Date getStartMaintenance() {
        return startMaintenance;
    }

    public void setStartMaintenance(Date startMaintenance) {
        this.startMaintenance = startMaintenance;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
