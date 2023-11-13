package it.gammainnovation.librarymodel;

import java.util.Date;

public class Recipe {

    /* #################### PROPERTIES #################### */

    int id;
    private String name, description;
    private int amtOrdered, monthsProposed;
    private double curPrice;
    private boolean inMonthlyRotation;
    private Date lastUsed;

    /* #################### CONSTRUCTORS #################### */
    /* #################### PRIVATE METHODS #################### */
    /* #################### GETTERS / SETTERS #################### */

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getAmtOrdered() {
        return amtOrdered;
    }

    public void setAmtOrdered(int amtOrdered) {
        this.amtOrdered = amtOrdered;
    }

    public int getMonthsProposed() {
        return monthsProposed;
    }

    public void setMonthsProposed(int monthsProposed) {
        this.monthsProposed = monthsProposed;
    }

    public double getCurPrice() {
        return curPrice;
    }

    public void setCurPrice(double curPrice) {
        this.curPrice = curPrice;
    }

    public boolean isInMonthlyRotation() {
        return inMonthlyRotation;
    }

    public void setInMonthlyRotation(boolean inMonthlyRotation) {
        this.inMonthlyRotation = inMonthlyRotation;
    }

    public Date getLastUsed() {
        return lastUsed;
    }

    public void setLastUsed(Date last_used) {
        this.lastUsed = last_used;
    }

    /* #################### PUBLIC METHODS #################### */

    public double getAppreciationIndex() {
        return this.amtOrdered / (double)this.monthsProposed;
    }

}