package com.academy.listviewdemo.dao.model;

public enum Gender {

   MALE("M"), FEMALE("F");


    private String name;

    private Gender(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
