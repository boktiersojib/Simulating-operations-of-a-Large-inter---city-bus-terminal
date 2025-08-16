package com.example.bus_terminal.model;

import java.io.Serializable;

public class Bus implements Serializable {
    private String busNumber;
    private String departure;
    private String arrival;
    private double fare;
    private int seats;

    public Bus(String busNumber, String departure, String arrival, double fare, int seats) {
        this.busNumber = busNumber;
        this.departure = departure;
        this.arrival = arrival;
        this.fare = fare;
        this.seats = seats;
    }

    // Getters and setters
    public String getBusNumber() { return busNumber; }
    public void setBusNumber(String busNumber) { this.busNumber = busNumber; }

    public String getDeparture() { return departure; }
    public void setDeparture(String departure) { this.departure = departure; }

    public String getArrival() { return arrival; }
    public void setArrival(String arrival) { this.arrival = arrival; }

    public double getFare() { return fare; }
    public void setFare(double fare) { this.fare = fare; }

    public int getSeats() { return seats; }
    public void setSeats(int seats) { this.seats = seats; }
}



