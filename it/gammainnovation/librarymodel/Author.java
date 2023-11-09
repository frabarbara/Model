package it.gammainnovation.librarymodel;

import java.util.Date;

public class Author {

    /* #################### PROPERTIES #################### */

    private String name, surname, nationality;
    private Date birthday;

    /* #################### CONSTRUCTORS #################### */
    /* #################### PRIVATE METHODS #################### */
    /* #################### GETTERS / SETTERS #################### */

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    /* #################### PUBLIC METHODS #################### */

}
