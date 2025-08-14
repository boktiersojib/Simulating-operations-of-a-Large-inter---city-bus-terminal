package com.example.bus_terminal.TicketOfficer;


import java.util.List;

public class SalesReport {
    private String date;
    private List<TicketBooking> bookings;
    private double totalSales;

    public SalesReport(String date, List<TicketBooking> bookings) {
        this.date = date;
        this.bookings = bookings;
        this.totalSales = bookings.stream().mapToDouble(TicketBooking::getFareAmount).sum();
    }

    public String getDate() {
        return date;
    }

    public List<TicketBooking> getBookings() {
        return bookings;
    }

    public double getTotalSales() {
        return totalSales;
    }
}

