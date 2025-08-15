package com.example.bus_terminal;

import com.example.bus_terminal.model.PaymentLogs;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.TextField;

import java.awt.Label;
import java.time.LocalDate;

public class PSAGoal7Controller
{
    @javafx.fxml.FXML
    private TableColumn gatewayTC;
    @javafx.fxml.FXML
    private ComboBox gatewayCB;
    @javafx.fxml.FXML
    private TextField userNmaeTF;
    @javafx.fxml.FXML
    private Label paymentLogsL;
    @javafx.fxml.FXML
    private TableView paymentLogsTV;
    @javafx.fxml.FXML
    private TableColumn userNameTC;
    @javafx.fxml.FXML
    private TableColumn dateTC;
    @javafx.fxml.FXML
    private Label d;
    @javafx.fxml.FXML
    private DatePicker dateDP;

    @FXML
    public void initialize() {

       

        gatewayCB.getItems().addAll("Bkash", "Rocket", "Nagad", "Upay", "Credit Card", "Google Pay");


        dateTC.setCellValueFactory(cellData -> new javafx.beans.property.SimpleObjectProperty<>(cellData.getValue().getDate()));
        userNameTC.setCellValueFactory(cellData -> new javafx.beans.property.SimpleStringProperty(cellData.getValue().getUserName()));
        gatewayTC.setCellValueFactory(cellData -> new javafx.beans.property.SimpleStringProperty(cellData.getValue().getGateway()));


        ObservableList logs;
        paymentLogsTV.setItems(logs)
    }

    @javafx.fxml.FXML
    public void markReviewOA(ActionEvent actionEvent) {
        PaymentLogs  selected = (PaymentLogs) paymentLogsTV.getSelectionModel().getSelectedItem();
        if (selected != null) {
            System.out.println("Marked for review: " + selected.getUserName());
        } else {
            System.out.println("No row selected!");
        }
    }

    @javafx.fxml.FXML
    public void exportLogsOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void searchOA(ActionEvent actionEvent) {
        String selectedGateway = gatewayCB.getValue().toString();
        String enteredName = userNmaeTF.getText().trim();
        LocalDate selectedDate = dateDP.getValue();

        PaymentLogs logs;
        ObservableList<PaymentLogs> filtered = FXCollections.observableArrayList(logs);

        if (selectedGateway != null && !selectedGateway.isEmpty()) {
            filtered.removeIf(log -> !log.getGateway().equalsIgnoreCase(selectedGateway));
        }
        if (!enteredName.isEmpty()) {
            filtered.removeIf(log -> !log.getUserName().toLowerCase().contains(enteredName.toLowerCase()));
        }
        if (selectedDate != null) {
            filtered.removeIf(log -> !log.getDate().equals(selectedDate));
        }

        paymentLogsTV.setItems(filtered);
    }

    @javafx.fxml.FXML
    public void backToDashboardOA(ActionEvent actionEvent) {
    }
}