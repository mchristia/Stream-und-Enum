package com.example.streamsdemo.model;

public enum Location {
    HAMBURG("Hamburg"), MUNICH("München"), FRANKFURT("Frankfurt"), COLOGNE("Köln");

    private final String location;

    Location(String city){
        this.location = city;
    }
}
