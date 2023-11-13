package it.gammainnovation.librarymodel;

public class WaiterShift {
    int id;
    String restaurantShift, waiter;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRestaurantShift() {
        return restaurantShift;
    }

    public void setRestaurantShift(String restaurantShift) {
        this.restaurantShift = restaurantShift;
    }

    public String getWaiter() {
        return waiter;
    }

    public void setWaiter(String waiter) {
        this.waiter = waiter;
    }
}
