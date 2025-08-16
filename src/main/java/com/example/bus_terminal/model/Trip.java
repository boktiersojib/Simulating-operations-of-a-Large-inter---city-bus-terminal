package com.example.bus_terminal.model;

public class Trip {
    private String tripName;     // Example: "Trip 101"
    private String markArrival;  // Example: "Yes" or "No"

    public Trip(String tripName, String markArrival) {
        this.tripName = tripName;
        this.markArrival = markArrival;
    }

    // Getters
    public String getTripName() {
        return tripName;
    }

    public String getMarkArrival() {
        return markArrival;
    }

    // Setters
    public void setTripName(String tripName) {
        this.tripName = tripName;
    }

    public void setMarkArrival(String markArrival) {
        this.markArrival = markArrival;
    }
}


