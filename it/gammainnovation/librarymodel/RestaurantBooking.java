package it.gammainnovation.librarymodel;

import java.util.Date;

public class RestaurantBooking {

    int id;
    User user;
    Restaurant restaurant;
    RestaurantTurn turn;
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

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    public RestaurantTurn getTurn() {
        return turn;
    }

    public void setTurn(RestaurantTurn turn) {
        this.turn = turn;
    }

    public Date getDay() {
        return day;
    }

    public void setDay(Date day) {
        this.day = day;
    }
}
