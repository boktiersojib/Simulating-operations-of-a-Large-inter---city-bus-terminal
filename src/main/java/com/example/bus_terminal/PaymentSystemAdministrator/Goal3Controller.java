package com.example.bus_terminal.PaymentSystemAdministrator;

import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;

import java.awt.event.ActionEvent;

public class Goal3Controller
{
    @javafx.fxml.FXML
    private TableColumn amounTC;
    @javafx.fxml.FXML
    private TableColumn methodTC;
    @javafx.fxml.FXML
    private ComboBox methodCB;
    @javafx.fxml.FXML
    private TableColumn statusTC;
    @javafx.fxml.FXML
    private ComboBox statusCB;
    @javafx.fxml.FXML
    private TextField transactionIdTF;
    @javafx.fxml.FXML
    private TableColumn transactionIdTC;
    @javafx.fxml.FXML
    private ComboBox transactionCB;
    @javafx.fxml.FXML
    private DatePicker dateDP;
    @javafx.fxml.FXML
    private TableColumn dateTC;
    @javafx.fxml.FXML
    private TextField amountTF;
    @javafx.fxml.FXML
    private TableView gatewayTV;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void notiffyPassengerOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void retryPaymentOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void viewGatewayResponseOA(ActionEvent actionEvent) {
    }
}