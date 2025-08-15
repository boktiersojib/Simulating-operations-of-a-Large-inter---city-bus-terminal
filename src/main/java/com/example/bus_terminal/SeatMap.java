package com.example.bus_terminal;

import java.util.HashMap;
import java.util.Map;

public class SeatMap {
    private String busNumber;
    private Map<String, Boolean> seats; // seatNumber -> available(true)/booked(false)

    public SeatMap(String busNumber) {
        this.busNumber = busNumber;
        this.seats = new HashMap<>();
    }

    public boolean isSeatAvailable(String seatNumber) {
        return seats.getOrDefault(seatNumber, true);
    }

    public void setSeatStatus(String seatNumber, boolean available) {
        seats.put(seatNumber, available);
    }
}
