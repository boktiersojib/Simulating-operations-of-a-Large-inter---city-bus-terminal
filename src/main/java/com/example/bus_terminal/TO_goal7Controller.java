package com.example.bus_terminal;

import com.example.bus_terminal.model.PassengerDetails;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class TO_goal7Controller {

    @FXML private TextField enterBookingReferenceTF;
    @FXML private TextField resultPassengerNameTF;
    @FXML private TextField resultPhoneNumberTF;
    @FXML private TextField resultEmailTF;
    @FXML private TextField resultAgeTF;
    @FXML private TextField resultGenderTF;
    @FXML private TextArea confirmationTA;

    // Simulated data store (Booking Reference → PassengerDetails)
    private Map<String, PassengerDetails> passengerData = new HashMap<>();

    @FXML
    private void initialize() {
        passengerData.put("BR001", new PassengerDetails("Alice", "0123456789", "alice@example.com", 25, "Female"));
        passengerData.put("BR002", new PassengerDetails("Bob", "0987654321", "bob@example.com", 30, "Male"));
    }

    @FXML
    private void searchOA() {
        String bookingRef = enterBookingReferenceTF.getText();
        PassengerDetails passenger = passengerData.get(bookingRef);
        if (passenger != null) {
            resultPassengerNameTF.setText(passenger.getName());
            resultPhoneNumberTF.setText(passenger.getPhoneNumber());
            resultEmailTF.setText(passenger.getEmail());
            resultAgeTF.setText(String.valueOf(passenger.getAge()));
            resultGenderTF.setText(passenger.getGender());
            confirmationTA.setText("Passenger data loaded. You can edit and save changes.");
        } else {
            confirmationTA.setText("Booking reference not found.");
            resultPassengerNameTF.clear();
            resultPhoneNumberTF.clear();
            resultEmailTF.clear();
            resultAgeTF.clear();
            resultGenderTF.clear();
        }
    }

    @FXML
    private void saveChangesOA() {
        String bookingRef = enterBookingReferenceTF.getText();
        PassengerDetails passenger = passengerData.get(bookingRef);
        if (passenger != null) {
            passenger.setName(resultPassengerNameTF.getText());
            passenger.setPhoneNumber(resultPhoneNumberTF.getText());
            passenger.setEmail(resultEmailTF.getText());
            try {
                passenger.setAge(Integer.parseInt(resultAgeTF.getText()));
            } catch (NumberFormatException e) {
                confirmationTA.setText("Invalid age. Please enter a number.");
                return;
            }
            passenger.setGender(resultGenderTF.getText());
            confirmationTA.setText("Passenger details updated successfully for booking: " + bookingRef);
        } else {
            confirmationTA.setText("Booking reference not found. Cannot save changes.");
        }
    }

    @FXML
    private void backToDashboardOA() throws IOException {
        FXMLLoader fxmlLoader= new FXMLLoader(getClass().getResource("ticket_officer_Dashboard.fxml"));
        Scene scene= new Scene(fxmlLoader.load());
        Stage stage= new Stage();
        stage.setScene(scene);
        stage.show();
    }
}
