package it.gammainnovation.librarymodel;

import java.util.Date;

public class Maintenance {
    int id;
    String room_id;
    Date start_maintenance;
    int duration;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRoom_id() {
        return room_id;
    }

    public void setRoom_id(String room_id) {
        this.room_id = room_id;
    }

    public Date getStart_maintenance() {
        return start_maintenance;
    }

    public void setStart_maintenance(Date start_maintenance) {
        this.start_maintenance = start_maintenance;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
