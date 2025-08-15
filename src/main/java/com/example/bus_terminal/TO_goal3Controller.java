package com.example.bus_terminal;

import com.example.bus_terminal.model.Booking;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

public class TO_goal3Controller {
    @FXML private TableView<Booking> bookingDetailsTV;
    @FXML private TableColumn<Booking, String> passengerNameCol;
    @FXML private TableColumn<Booking, String> busCol;
    @FXML private TableColumn<Booking, String> routeCol;
    @FXML private TableColumn<Booking, String> seatNumberCol;
    @FXML private TableColumn<Booking, String> dateCol;
    @FXML private TextArea ticketOutputTA;

    @FXML
    public void initialize() {
        passengerNameCol.setCellValueFactory(new PropertyValueFactory<>("passengerName"));
        busCol.setCellValueFactory(new PropertyValueFactory<>("bus"));
        routeCol.setCellValueFactory(new PropertyValueFactory<>("route"));
        seatNumberCol.setCellValueFactory(new PropertyValueFactory<>("seatNumber"));
        dateCol.setCellValueFactory(new PropertyValueFactory<>("date"));

        bookingDetailsTV.setItems(BookingData.getInstance().getBookingList());
    }

    @FXML
    private void reprintSelectedTicketOA() {
        Booking selected = bookingDetailsTV.getSelectionModel().getSelectedItem();
        if (selected != null) {
            ticketOutputTA.setText(
                    "=== Ticket Reprint ===\n" +
                            "Passenger: " + selected.getPassengerName() + "\n" +
                            "Bus: " + selected.getBus() + "\n" +
                            "Route: " + selected.getRoute() + "\n" +
                            "Seat: " + selected.getSeatNumber() + "\n" +
                            "Date: " + selected.getDate()
            );
        } else {
            ticketOutputTA.setText("Please select a booking to reprint.");
        }
    }
}
