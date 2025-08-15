package com.example.bus_terminal;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.awt.*;
import java.time.LocalDate;

public class PSAGoal8Controller
{
    @javafx.fxml.FXML
    private TableColumn amountTC;
    @javafx.fxml.FXML
    private ComboBox escalationCB;
    @javafx.fxml.FXML
    private Label fraudAlertsL;
    @javafx.fxml.FXML
    private TableView fraudeTV;
    @javafx.fxml.FXML
    private TableColumn reasonTC;
    @javafx.fxml.FXML
    private TableColumn transactionIdTC;
    @javafx.fxml.FXML
    private TableColumn dateTC;
    @javafx.fxml.FXML
    private TextArea transactionDetailsL;

    @javafx.fxml.FXML
    public void initialize() {
        
        transactionIdTC.setCellValueFactory(cellData -> new javafx.beans.property.SimpleStringProperty(cellData.getValue().getTransactionId()));
        reasonTC.setCellValueFactory(cellData -> new javafx.beans.property.SimpleStringProperty(cellData.getValue().getReason()));
        dateTC.setCellValueFactory(cellData -> new javafx.beans.property.SimpleObjectProperty<>(cellData.getValue().getDate()));
        amountTC.setCellValueFactory(cellData -> new javafx.beans.property.SimpleObjectProperty<>(cellData.getValue().getAmount()));


        ObservableList<Object> FraudAlerts = FXCollections.observableArrayList(
                new FraudAlert("TXN001", "Unusual Location", LocalDate.of(2025, 8, 1), 1200.50),
                new FraudAlert("TXN002", "Multiple Rapid Payments", LocalDate.of(2025, 8, 2), 800.00),
                new FraudAlert("TXN003", "High Amount", LocalDate.of(2025, 8, 3), 5000.00)
        );

               




        escalationCB.getItems().addAll(
                 "Select Action", "Mark as Valid", "Mark as Suspicious", "Block Transaction", "Refund Transaction",
                "Escalate to Manager", "Escalate to Fraud Department", "Notify Customer");



    }

    @javafx.fxml.FXML
    public void alertOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void validOA(ActionEvent actionEvent) {
        showMessage("Marked as Valid");
    }

    private void showMessage(String markedAsValid) {
    }

    @javafx.fxml.FXML
    public void suspiciousOA(ActionEvent actionEvent) {

        showMessage("Marked as Suspicious");
    }

    @javafx.fxml.FXML
    public void selectedOA(ActionEvent actionEvent) {
        String selected = escalationCB.getValue();
        if (selected != null) {
            showMessage("Selected Escalation: " + selected);
        } else {
            showMessage("Please select an escalation option.");
        }
    }

    @javafx.fxml.FXML
    public void backToDashboardOA(ActionEvent actionEvent) {
    }
}