package com.example.bus_terminal.model;

import java.time.LocalDate;

public class SeatAvailability {
    private String bus;
    private LocalDate date;
    private int availableSeats;

    public SeatAvailability() {
    }

    public SeatAvailability(String bus, LocalDate date, int availableSeats) {
        this.bus = bus;
        this.date = date;
        this.availableSeats = availableSeats;
    }

    public String getBus() {
        return bus;
    }

    public void setBus(String bus) {
        this.bus = bus;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public int getAvailableSeats() {
        return availableSeats;
    }

    public void setAvailableSeats(int availableSeats) {
        this.availableSeats = availableSeats;
    }
}

