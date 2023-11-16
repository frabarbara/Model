package it.gammainnovation.librarymodel;

public class WaiterShift {
    int id;
    RestaurantShift restaurantShift;
    Waiter waiter;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public RestaurantShift getRestaurantShift() {
        return restaurantShift;
    }

    public void setRestaurantShift(RestaurantShift restaurantShift) {
        this.restaurantShift = restaurantShift;
    }

    public Waiter getWaiter() {
        return waiter;
    }

    public void setWaiter(Waiter waiter) {
        this.waiter = waiter;
    }
}
