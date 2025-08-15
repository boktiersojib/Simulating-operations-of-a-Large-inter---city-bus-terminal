package com.example.bus_terminal.model;

public class BookingRecord {
    private String bookingReference;
    private String paymentReference;
    private String passengerName;
    private String bus;
    private String route;
    private String seatNumber;
    private String date;
    private boolean paymentConfirmed;
    private String paymentIssue;

    public BookingRecord(String bookingReference, String paymentReference, String passengerName,
                         String bus, String route, String seatNumber, String date,
                         boolean paymentConfirmed, String paymentIssue) {
        this.bookingReference = bookingReference;
        this.paymentReference = paymentReference;
        this.passengerName = passengerName;
        this.bus = bus;
        this.route = route;
        this.seatNumber = seatNumber;
        this.date = date;
        this.paymentConfirmed = paymentConfirmed;
        this.paymentIssue = paymentIssue;
    }

    // Getters and Setters
    public String getBookingReference() {
        return bookingReference;
    }

    public void setBookingReference(String bookingReference) {
        this.bookingReference = bookingReference;
    }

    public String getPaymentReference() {
        return paymentReference;
    }

    public void setPaymentReference(String paymentReference) {
        this.paymentReference = paymentReference;
    }

    public String getPassengerName() {
        return passengerName;
    }

    public void setPassengerName(String passengerName) {
        this.passengerName = passengerName;
    }

    public String getBus() {
        return bus;
    }

    public void setBus(String bus) {
        this.bus = bus;
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public boolean isPaymentConfirmed() {
        return paymentConfirmed;
    }

    public void setPaymentConfirmed(boolean paymentConfirmed) {
        this.paymentConfirmed = paymentConfirmed;
    }

    public String getPaymentIssue() {
        return paymentIssue;
    }

    public void setPaymentIssue(String paymentIssue) {
        this.paymentIssue = paymentIssue;
    }
}

