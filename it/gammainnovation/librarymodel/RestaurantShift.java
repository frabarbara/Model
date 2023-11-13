package it.gammainnovation.librarymodel;

import java.util.Date;

public class RestaurantShift {
    String id;
    Date day;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getDay() {
        return day;
    }

    public void setDay(Date day) {
        this.day = day;
    }
}
