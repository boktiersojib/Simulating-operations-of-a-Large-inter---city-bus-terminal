package com.example.bus_terminal;

import com.example.bus_terminal.model.Booking;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;

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

    public void searchOA(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader= new FXMLLoader(getClass().getResource("ticket.officer.Dashboard"));
        Scene scene= new Scene(fxmlLoader.load());
        Stage stage= new Stage();
        stage.setScene(scene);
        stage.show();
    }

    public void reprintTicketOA(ActionEvent actionEvent) {
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
