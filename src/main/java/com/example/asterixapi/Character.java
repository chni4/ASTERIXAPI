package com.example.asterixapi;

public record Character(String id, String name, int age, String profession) {

    public void setId(String id) {
    }

    public String getId() {
        return null;
    }
}
