package it.gammainnovation.librarymodel;

import java.util.Date;

public class DailyMenu {

    int id;
    Date day;
    int fc1, fc2, fc3, sc1, sc2, sc3, fru, des;
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

    public int getFc1() {
        return fc1;
    }

    public void setFc1(int fc1) {
        this.fc1 = fc1;
    }

    public int getFc2() {
        return fc2;
    }

    public void setFc2(int fc2) {
        this.fc2 = fc2;
    }

    public int getFc3() {
        return fc3;
    }

    public void setFc3(int fc3) {
        this.fc3 = fc3;
    }

    public int getSc1() {
        return sc1;
    }

    public void setSc1(int sc1) {
        this.sc1 = sc1;
    }

    public int getSc2() {
        return sc2;
    }

    public void setSc2(int sc2) {
        this.sc2 = sc2;
    }

    public int getSc3() {
        return sc3;
    }

    public void setSc3(int sc3) {
        this.sc3 = sc3;
    }

    public int getFru() {
        return fru;
    }

    public void setFru(int fru) {
        this.fru = fru;
    }

    public int getDes() {
        return des;
    }

    public void setDes(int des) {
        this.des = des;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
}
