package com.example.bus_terminal.PaymentSystemAdministrator;

import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;

import java.awt.*;
import java.awt.event.ActionEvent;

public class Goal2Controller
{
    @javafx.fxml.FXML
    private ComboBox paymentMethodCB;
    @javafx.fxml.FXML
    private TableColumn paymentMethodTC;
    @javafx.fxml.FXML
    private ComboBox statusCB;
    @javafx.fxml.FXML
    private TableColumn statusTC;
    @javafx.fxml.FXML
    private DatePicker datePicker;
    @javafx.fxml.FXML
    private TableColumn dateTC;
    @javafx.fxml.FXML
    private Label monitorTransactionL;

    @javafx.fxml.FXML
    public void initialize() {

        paymentMethodCB.getItems().addAll(
                " Bkash", " Rocket", "Nagad", " Upay", " Credit Card", "Google pay");

        statusCB.getItems().addAll(
                "Pending", " Confirmed", " Cancelled");
    }

    @javafx.fxml.FXML
    public void searchOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void backToDashboardOA(ActionEvent actionEvent) {
    }
}