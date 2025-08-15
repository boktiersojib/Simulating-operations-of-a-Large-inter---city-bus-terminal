package com.example.bus_terminal.TicketOfficer;

import com.example.bus_terminal.Passenger;

import java.time.LocalDateTime;

public class TicketBooking {
    private String bookingId;
    private Passenger passenger;
    private String route;
    private String busNumber;
    private String seatNumber;
    private LocalDateTime travelDateTime;
    private double fareAmount;
    private boolean paymentStatus;

    public TicketBooking(String bookingId, Passenger passenger, String route,
                         String busNumber, String seatNumber, LocalDateTime travelDateTime,
                         double fareAmount, boolean paymentStatus) {
        this.bookingId = bookingId;
        this.passenger = passenger;
        this.route = route;
        this.busNumber = busNumber;
        this.seatNumber = seatNumber;
        this.travelDateTime = travelDateTime;
        this.fareAmount = fareAmount;
        this.paymentStatus = paymentStatus;
    }

    public String getBookingId() {
        return bookingId;
    }

    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    public String getBusNumber() {
        return busNumber;
    }

    public void setBusNumber(String busNumber) {
        this.busNumber = busNumber;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    public LocalDateTime getTravelDateTime() {
        return travelDateTime;
    }

    public void setTravelDateTime(LocalDateTime travelDateTime) {
        this.travelDateTime = travelDateTime;
    }

    public double getFareAmount() {
        return fareAmount;
    }

    public void setFareAmount(double fareAmount) {
        this.fareAmount = fareAmount;
    }

    public boolean isPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(boolean paymentStatus) {
        this.paymentStatus = paymentStatus;
    }
}
