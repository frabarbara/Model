package it.gammainnovation.librarymodel;

import java.util.Date;

public class DailyMenu {

    int id;
    Date day;
    Recipe fc1, fc2, fc3, sc1, sc2, sc3, fru, des;
    String notes;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDay() {
        return day;
    }

    public void setDay(Date day) {
        this.day = day;
    }

    public Recipe getFc1() {
        return fc1;
    }

    public void setFc1(Recipe fc1) {
        this.fc1 = fc1;
    }

    public Recipe getFc2() {
        return fc2;
    }

    public void setFc2(Recipe fc2) {
        this.fc2 = fc2;
    }

    public Recipe getFc3() {
        return fc3;
    }

    public void setFc3(Recipe fc3) {
        this.fc3 = fc3;
    }

    public Recipe getSc1() {
        return sc1;
    }

    public void setSc1(Recipe sc1) {
        this.sc1 = sc1;
    }

    public Recipe getSc2() {
        return sc2;
    }

    public void setSc2(Recipe sc2) {
        this.sc2 = sc2;
    }

    public Recipe getSc3() {
        return sc3;
    }

    public void setSc3(Recipe sc3) {
        this.sc3 = sc3;
    }

    public Recipe getFru() {
        return fru;
    }

    public void setFru(Recipe fru) {
        this.fru = fru;
    }

    public Recipe getDes() {
        return des;
    }

    public void setDes(Recipe des) {
        this.des = des;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
}
