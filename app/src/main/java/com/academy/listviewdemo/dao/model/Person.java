package com.academy.listviewdemo.dao.model;

public class Person extends Object {

    private String name;
    private String surname;
    private Gender gender;
    private String nationality;

    public Person() {
        super();
    }

    public Person(String name, String surname, Gender gender, String nationality){
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.nationality = nationality;
    }

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

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
}
