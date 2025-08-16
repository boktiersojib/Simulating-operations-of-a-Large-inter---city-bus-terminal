package com.example.bus_terminal.model;

public class Booking {
    private String passengerName;
    private String bus;
    private String route;
    private String seatNumber;
    private String date;

    public Booking(String passengerName, String bus, String route, String seatNumber, String date) {
        this.passengerName = passengerName;
        this.bus = bus;
        this.route = route;
        this.seatNumber = seatNumber;
        this.date = date;
    }

    public String getPassengerName() { return passengerName; }
    public void setPassengerName(String passengerName) { this.passengerName = passengerName; }

    public String getBus() { return bus; }
    public void setBus(String bus) { this.bus = bus; }

    public String getRoute() { return route; }
    public void setRoute(String route) { this.route = route; }

    public String getSeatNumber() { return seatNumber; }
    public void setSeatNumber(String seatNumber) { this.seatNumber = seatNumber; }

    public String getDate() { return date; }
    public void setDate(String date) { this.date = date; }
}



