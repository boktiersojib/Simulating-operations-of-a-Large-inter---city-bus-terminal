package com.example.bus_terminal.model;

import java.time.LocalDate;

public class RefundRequest {

    private String status;
    private String bookingId;
    private String passengerName;
    private LocalDate date;

    public RefundRequest(String status, String bookingId, String passengerName, LocalDate date) {
        this.status = status;
        this.bookingId = bookingId;
        this.passengerName = passengerName;
        this.date = date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getBookingId() {
        return bookingId;
    }

    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }

    public String getPassengerName() {
        return passengerName;
    }

    public void setPassengerName(String passengerName) {
        this.passengerName = passengerName;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "RefundRequest{" +
                "status='" + status + '\'' +
                ", bookingId='" + bookingId + '\'' +
                ", passengerName='" + passengerName + '\'' +
                ", date=" + date +
                '}';
    }
}
