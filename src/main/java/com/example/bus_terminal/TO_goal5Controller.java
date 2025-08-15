package com.example.bus_terminal;

import com.example.bus_terminal.BookingData;
import com.example.bus_terminal.model.Booking;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

public class TO_goal5Controller {
    @FXML private TableView<Booking> resultTV;
    @FXML private TableColumn<Booking, String> passengerNameCol;
    @FXML private TableColumn<Booking, String> busCol;
    @FXML private TableColumn<Booking, String> routeCol;
    @FXML private TableColumn<Booking, String> seatNumberCol;
    @FXML private TableColumn<Booking, String> dateCol;
    @FXML private TextArea statusAndUpdatesTA;

    @FXML
    public void initialize() {
        passengerNameCol.setCellValueFactory(new PropertyValueFactory<>("passengerName"));
        busCol.setCellValueFactory(new PropertyValueFactory<>("bus"));
        routeCol.setCellValueFactory(new PropertyValueFactory<>("route"));
        seatNumberCol.setCellValueFactory(new PropertyValueFactory<>("seatNumber"));
        dateCol.setCellValueFactory(new PropertyValueFactory<>("date"));

        resultTV.setItems(BookingData.getInstance().getBookingList());
    }

    @FXML
    private void cancelSelectedBookingOA() {
        Booking selected = resultTV.getSelectionModel().getSelectedItem();
        if (selected != null) {
            BookingData.getInstance().removeBooking(selected);
            statusAndUpdatesTA.setText("Booking cancelled successfully for " + selected.getPassengerName());
        } else {
            statusAndUpdatesTA.setText("Please select a booking to cancel.");
        }
    }
}
