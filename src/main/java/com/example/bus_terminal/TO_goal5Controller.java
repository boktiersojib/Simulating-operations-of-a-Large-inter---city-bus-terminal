package com.example.bus_terminal;

import com.example.bus_terminal.BookingData;
import com.example.bus_terminal.model.Booking;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;

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

    public void searchOA(ActionEvent actionEvent) {

    }

    public void backToDashboardOA(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader= new FXMLLoader(getClass().getResource("ticket_officer_Dashboard.fxml"));
        Scene scene= new Scene(fxmlLoader.load());
        Stage stage= new Stage();
        stage.setScene(scene);
        stage.show();
    }
}
