package com.example.bus_terminal.model;

public class TripEnd {
    private String destination; // e.g. "Dhaka"
    private String time;        // e.g. "18:30"

    public TripEnd(String destination, String time) {
        this.destination = destination;
        this.time = time;
    }

    // Getters
    public String getDestination() {
        return destination;
    }

    public String getTime() {
        return time;
    }

    // Setters
    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setTime(String time) {
        this.time = time;
    }
}

