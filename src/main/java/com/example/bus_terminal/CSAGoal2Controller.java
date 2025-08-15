package com.example.bus_terminal;

import com.example.bus_terminal.model.RefundRequest;
import javafx.beans.property.SimpleStringProperty;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.awt.*;
import java.awt.event.ActionEvent;

public class CSAGoal2Controller
{
    @javafx.fxml.FXML
    private Label refundAssistancePanalL;
    @javafx.fxml.FXML
    private TextArea refundExplanationTA;
    @javafx.fxml.FXML
    private TableColumn passengerTC;
    @javafx.fxml.FXML
    private TableView refundRequestTV;
    @javafx.fxml.FXML
    private TableColumn statusTC;
    @javafx.fxml.FXML
    private TableColumn reasonTC;
    @javafx.fxml.FXML
    private TableColumn idTC;
    @javafx.fxml.FXML
    private TextField updatePassengerTF;

    @FXML
    public void initialize() {
        idTC.setCellValueFactory(data -> new SimpleStringProperty(data.getClass().getId()));
        passengerTC.setCellValueFactory(data -> new SimpleStringProperty(data.getClass().getPassenger()));
        reasonTC.setCellValueFactory(data -> new SimpleStringProperty(data.getClass().getReason()));
        statusTC.setCellValueFactory(data -> new SimpleStringProperty(data.getClass().getStatus()));




    }

    @javafx.fxml.FXML
    public void initiateRefundProcessOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void sendOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void verifyOA(ActionEvent actionEvent) {

        RefundRequest selected = refundRequestTV.getSelectionModel().getSelectedItem();
        if (selected != null) {
            selected.setStatus("Verified");
            refundRequestTV.refresh();
            showInfo("Refund request verified.");
        } else {
            showError("Please select a refund request to verify.");
        }
    }

    private void showError(String s) {
    }

    private void showInfo(String s) {
    }

    @javafx.fxml.FXML
    public void closeOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void sendsPolicyInfoOA(ActionEvent actionEvent) {
        String explanation = refundExplanationTA.getText();
        if (explanation.isEmpty()) {
            showError("Please enter refund policy explanation.");
        } else {
            showInfo("Policy information sent: " + explanation);
        }
    }

    @javafx.fxml.FXML
    public void backToDashboardOA(ActionEvent actionEvent) {
    }
}