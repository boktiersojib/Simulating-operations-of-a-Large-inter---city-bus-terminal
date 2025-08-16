package com.example.bus_terminal;

public class Schedule {
    private String arrivalTime;       // e.g. "08:30 AM"
    private String busNumber;         // e.g. "B101"
    private String dateOfTrip;        // e.g. "2025-08-18"
    private int numberOfStops;        // e.g. 5
    private String assignedPlatform;  // e.g. "Platform 1"
    private String schedule;          // e.g. "Morning"
    private String route;             // e.g. "Route A"

    public Schedule(String arrivalTime, String busNumber, String dateOfTrip,
                    int numberOfStops, String assignedPlatform, String schedule, String route) {
        this.arrivalTime = arrivalTime;
        this.busNumber = busNumber;
        this.dateOfTrip = dateOfTrip;
        this.numberOfStops = numberOfStops;
        this.assignedPlatform = assignedPlatform;
        this.schedule = schedule;
        this.route = route;
    }

    // Getters
    public String getArrivalTime() {
        return arrivalTime;
    }

    public String getBusNumber() {
        return busNumber;
    }

    public String getDateOfTrip() {
        return dateOfTrip;
    }

    public int getNumberOfStops() {
        return numberOfStops;
    }

    public String getAssignedPlatform() {
        return assignedPlatform;
    }

    public String getSchedule() {
        return schedule;
    }

    public String getRoute() {
        return route;
    }

    // Setters
    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public void setBusNumber(String busNumber) {
        this.busNumber = busNumber;
    }

    public void setDateOfTrip(String dateOfTrip) {
        this.dateOfTrip = dateOfTrip;
    }

    public void setNumberOfStops(int numberOfStops) {
        this.numberOfStops = numberOfStops;
    }

    public void setAssignedPlatform(String assignedPlatform) {
        this.assignedPlatform = assignedPlatform;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    public void setRoute(String route) {
        this.route = route;
    }
}

