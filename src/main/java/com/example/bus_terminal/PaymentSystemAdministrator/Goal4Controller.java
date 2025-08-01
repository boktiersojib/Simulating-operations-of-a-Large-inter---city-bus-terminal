package com.example.bus_terminal.PaymentSystemAdministrator;

import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

import java.awt.*;
import java.awt.event.ActionEvent;

public class Goal4Controller
{
    @javafx.fxml.FXML
    private TableColumn amountTC;
    @javafx.fxml.FXML
    private TextField dateRangeTF;
    @javafx.fxml.FXML
    private TableColumn transactionIdTC;
    @javafx.fxml.FXML
    private ComboBox reportTypeCB;
    @javafx.fxml.FXML
    private TableColumn dateTC;
    @javafx.fxml.FXML
    private TableColumn reportTypeTC;
    @javafx.fxml.FXML
    private TableView reportTV;
    @javafx.fxml.FXML
    private TableColumn paymentMethodType;
    @javafx.fxml.FXML
    private Label paymentReportL;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void downloadReportOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void generateReportOA(ActionEvent actionEvent) {
    }
}