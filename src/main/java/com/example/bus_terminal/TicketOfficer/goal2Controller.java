package com.example.bus_terminal.TicketOfficer;

import com.example.bus_terminal.model.Ticket;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class goal2Controller {

    @FXML
    private TextField passengerNameTF;

    @FXML
    private TextField phoneNumberTF;

    @FXML
    private TextField emailTF;

    @FXML
    private TextField agrTF;

    @FXML
    private ComboBox<String> genderCB;

    @FXML
    private ComboBox<String> selectRouteCB;

    @FXML
    private ComboBox<String> selectBusCB;

    @FXML
    private ComboBox<String> selectSeatCB;

    @FXML
    private RadioButton cashRB;

    @FXML
    private RadioButton cardRB;

    @FXML
    private TextField amountTF;

    private ObservableList<String> routes = FXCollections.observableArrayList("Dhaka-Chittagong", "Dhaka-Sylhet", "Dhaka-Khulna");
    private ObservableList<String> buses = FXCollections.observableArrayList("Bus101", "Bus102", "Bus103");
    private ObservableList<String> seats = FXCollections.observableArrayList("1A", "1B", "1C", "2A", "2B", "2C");

    private ToggleGroup paymentGroup = new ToggleGroup();

    @FXML
    public void initialize() {
        genderCB.setItems(FXCollections.observableArrayList("Male", "Female", "Other"));
        selectRouteCB.setItems(routes);
        selectBusCB.setItems(buses);
        selectSeatCB.setItems(seats);

        cashRB.setToggleGroup(paymentGroup);
        cardRB.setToggleGroup(paymentGroup);
    }

    @FXML
    void acceptPaymentOA(ActionEvent event) {
        String paymentMethod = getSelectedPaymentMethod();
        String amountStr = amountTF.getText();
        double amount = 0;

        if (paymentMethod == null) {
            showAlert(Alert.AlertType.ERROR, "Error", "Please select a payment method.");
            return;
        }

        try {
            amount = Double.parseDouble(amountStr);
        } catch (NumberFormatException e) {
            showAlert(Alert.AlertType.ERROR, "Error", "Please enter a valid amount.");
            return;
        }

        showAlert(Alert.AlertType.INFORMATION, "Payment Accepted",
                "Payment of " + amount + " via " + paymentMethod + " accepted.");
    }

    @FXML
    void issueTicketOA(ActionEvent event) {
        String name = passengerNameTF.getText();
        String phone = phoneNumberTF.getText();
        String email = emailTF.getText();
        int age = 0;
        try {
            age = Integer.parseInt(agrTF.getText());
        } catch (NumberFormatException e) {
            showAlert(Alert.AlertType.ERROR, "Error", "Please enter a valid age.");
            return;
        }

        String gender = genderCB.getValue();
        String route = selectRouteCB.getValue();
        String bus = selectBusCB.getValue();
        String seat = selectSeatCB.getValue();
        String paymentMethod = getSelectedPaymentMethod();
        double amount = 0;
        try {
            amount = Double.parseDouble(amountTF.getText());
        } catch (NumberFormatException ignored) {}

        if (name.isEmpty() || phone.isEmpty() || email.isEmpty() || gender == null ||
                route == null || bus == null || seat == null || paymentMethod == null) {
            showAlert(Alert.AlertType.ERROR, "Error", "Please fill all fields.");
            return;
        }

        Ticket ticket = new Ticket(name, phone, email, age, gender, route, bus, seat, paymentMethod, amount);

        showAlert(Alert.AlertType.INFORMATION, "Ticket Issued",
                "Ticket issued for " + ticket.getPassengerName() + "\nBus: " + ticket.getBus() +
                        "\nRoute: " + ticket.getRoute() + "\nSeat: " + ticket.getSeat() +
                        "\nPayment: " + ticket.getPaymentMethod() + " " + ticket.getAmount());
    }

    @FXML
    void printTicketOA(ActionEvent event) {
        showAlert(Alert.AlertType.INFORMATION, "Print Ticket", "Ticket printed successfully.");
    }

    @FXML
    void backToDashboardOA(ActionEvent event) {
        showAlert(Alert.AlertType.INFORMATION, "Back", "Returning to Dashboard...");
    }

    private String getSelectedPaymentMethod() {
        RadioButton selected = (RadioButton) paymentGroup.getSelectedToggle();
        if (selected != null) return selected.getText();
        return null;
    }

    private void showAlert(Alert.AlertType type, String title, String message) {
        Alert alert = new Alert(type);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}
