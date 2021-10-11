package com.example.timezone_mgmt;

public class Friend {
    private int id;
    private String name;
    private String timezone;

    public Friend() {
    }

    public Friend(int id, String name, String timezone) {
        this.id = id;
        this.name = name;
        this.timezone = timezone;
    }

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

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    @Override
    public String toString() {
        return this.name + " --> " + this.timezone;
    }
}
