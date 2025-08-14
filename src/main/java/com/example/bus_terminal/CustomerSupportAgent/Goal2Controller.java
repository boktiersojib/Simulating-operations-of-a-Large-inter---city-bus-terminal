package com.example.bus_terminal.CustomerSupportAgent;

import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.awt.*;
import java.awt.event.ActionEvent;

public class Goal2Controller
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

    @javafx.fxml.FXML
    public void initialize() {
        System.out.println("Verify button clicked");
        // Add logic for verifying the refund request

    }

    @javafx.fxml.FXML
    public void initiateRefundProcessOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void sendOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void verifyOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void closeOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void sendsPolicyInfoOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void backToDashboardOA(ActionEvent actionEvent) {
    }
}