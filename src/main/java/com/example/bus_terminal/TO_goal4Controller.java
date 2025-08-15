package com.example.bus_terminal;

import com.example.bus_terminal.model.SeatAvailability;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class TO_goal4Controller {

    @FXML
    private ComboBox<String> selectBusCB;

    @FXML
    private DatePicker selectDateDP;

    @FXML
    private TextArea resultTA;

    // Simulated seat data for demonstration
    private Map<String, Integer> busSeats = new HashMap<>();

    @FXML
    public void initialize() {
        // Load buses into ComboBox
        selectBusCB.getItems().addAll("Bus101", "Bus202", "Bus303");

        // Simulate available seats for buses
        busSeats.put("Bus101", 15);
        busSeats.put("Bus202", 8);
        busSeats.put("Bus303", 0);
    }

    @FXML
    void checkAvailabilityOA(ActionEvent event) {
        String selectedBus = selectBusCB.getValue();
        LocalDate selectedDate = selectDateDP.getValue();

        if (selectedBus == null || selectedBus.isEmpty()) {
            showAlert(Alert.AlertType.ERROR, "Error", "Please select a bus.");
            return;
        }

        if (selectedDate == null) {
            showAlert(Alert.AlertType.ERROR, "Error", "Please select a date.");
            return;
        }

        int availableSeats = busSeats.getOrDefault(selectedBus, 0);

        SeatAvailability seatAvailability = new SeatAvailability(selectedBus, selectedDate, availableSeats);

        if (availableSeats > 0) {
            resultTA.setText("Bus: " + seatAvailability.getBus()
                    + "\nDate: " + seatAvailability.getDate()
                    + "\nAvailable Seats: " + seatAvailability.getAvailableSeats());
        } else {
            resultTA.setText("Bus: " + seatAvailability.getBus()
                    + "\nDate: " + seatAvailability.getDate()
                    + "\nNo seats available.");
        }
    }

    @FXML
    void backToDashboardOA(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader= new FXMLLoader(getClass().getResource("ticket.officer.Dashboard"));
        Scene scene= new Scene(fxmlLoader.load());
        Stage stage= new Stage();
        stage.setScene(scene);
        stage.show();
    }
    private void showAlert(Alert.AlertType type, String title, String message) {
        Alert alert = new Alert(type);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}
