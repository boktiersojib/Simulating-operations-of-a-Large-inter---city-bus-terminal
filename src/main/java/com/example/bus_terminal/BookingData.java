package com.example.bus_terminal;

import com.example.bus_terminal.model.Booking;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class BookingData {
    private static final BookingData instance = new BookingData();
    private final ObservableList<Booking> bookingList = FXCollections.observableArrayList();

    private BookingData() {
        // Example test data
        bookingList.add(new Booking("Alice", "Bus A", "City 1 - City 2", "A1", "2025-08-15"));
        bookingList.add(new Booking("Bob", "Bus B", "City 2 - City 3", "B5", "2025-08-16"));
    }

    public static BookingData getInstance() {
        return instance;
    }

    public ObservableList<Booking> getBookingList() {
        return bookingList;
    }

    public void addBooking(Booking booking) {
        bookingList.add(booking);
    }

    public void removeBooking(Booking booking) {
        bookingList.remove(booking);
    }
}

