package com.example.bus_terminal;

import com.example.bus_terminal.model.FraudAlerts;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.time.LocalDate;

public class PSAGoal8Controller {

    @FXML
    private TableView<FraudAlerts> fraudeTV;

    @FXML
    private TableColumn<FraudAlerts, String> transactionIdTC;

    @FXML
    private TableColumn<FraudAlerts, String> reasonTC;

    @FXML
    private TableColumn<FraudAlerts, LocalDate> dateTC;

    @FXML
    private TableColumn<FraudAlerts, Double> amountTC;

    @FXML
    private ComboBox<String> escalationCB;

    @FXML
    private TextArea transactiondetailsL;

    @FXML
    private Label fraudalertsL;

    private ObservableList<FraudAlerts> fraudAlertsList = FXCollections.observableArrayList();

    @FXML
    public void initialize() {
        // Escalation options
        escalationCB.setItems(FXCollections.observableArrayList(
                "Low", "Medium", "High", "Critical"
        ));

        // Table column bindings
        transactionIdTC.setCellValueFactory(new PropertyValueFactory<>("transactionId"));
        reasonTC.setCellValueFactory(new PropertyValueFactory<>("reason"));
        dateTC.setCellValueFactory(new PropertyValueFactory<>("date"));
        amountTC.setCellValueFactory(new PropertyValueFactory<>("amount"));

        // Dummy data
        fraudAlertsList.addAll(
                new FraudAlerts("TXN1001", "Multiple failed attempts", LocalDate.now().minusDays(1), 5000.50),
                new FraudAlerts("TXN1002", "Unusual location", LocalDate.now(), 1200.00),
                new FraudAlerts("TXN1003", "High amount transaction", LocalDate.now().minusDays(2), 75000.00)
        );

        fraudeTV.setItems(fraudAlertsList);

        // Show details on row selection
        fraudeTV.getSelectionModel().selectedItemProperty().addListener((obs, oldVal, newVal) -> {
            if (newVal != null) {
                transactiondetailsL.setText(
                        "Transaction ID: " + newVal.getTransactionId() +
                                "\nReason: " + newVal.getReason() +
                                "\nDate: " + newVal.getDate() +
                                "\nAmount: " + newVal.getAmount()
                );
            }
        });
    }

    @FXML
    private void validOA() {
        FraudAlerts selected = fraudeTV.getSelectionModel().getSelectedItem();
        if (selected == null) {
            showAlert("No Selection", "Please select a fraud alert to mark as valid.");
            return;
        }
        showAlert("Marked as Valid", "Transaction " + selected.getTransactionId() + " marked as valid.");
    }

    @FXML
    private void suspiciousOA() {
        FraudAlerts selected = fraudeTV.getSelectionModel().getSelectedItem();
        if (selected == null) {
            showAlert("No Selection", "Please select a fraud alert to mark as suspicious.");
            return;
        }
        showAlert("Marked as Suspicious", "Transaction " + selected.getTransactionId() + " marked as suspicious.");
    }

    @FXML
    private void selectedOA() {
        String escalationLevel = escalationCB.getValue();
        if (escalationLevel == null) {
            showAlert("No Escalation Level", "Please select an escalation level.");
            return;
        }
        showAlert("Escalation Selected", "Escalation level set to: " + escalationLevel);
    }

    @FXML
    private void alertOA() {
        FraudAlerts selected = fraudeTV.getSelectionModel().getSelectedItem();
        if (selected == null) {
            showAlert("No Selection", "Please select a fraud alert to send an alert.");
            return;
        }
        showAlert("Alert Sent", "Alert sent for transaction: " + selected.getTransactionId());
    }

    @FXML
    private void backToDashboardOA() {
        System.out.println("Navigating back to dashboard...");
    }

    private void showAlert(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}
