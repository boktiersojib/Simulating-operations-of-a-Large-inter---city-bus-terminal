package com.example.bus_terminal.CustomerSupportAgent;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

import java.awt.*;

public class Goal5Controller
{
    @javafx.fxml.FXML
    private TableView compaintTV;
    @javafx.fxml.FXML
    private TextField passengerNameTF;
    @javafx.fxml.FXML
    private ComboBox complaintTypeCB;
    @javafx.fxml.FXML
    private TextField passengerContactTF;
    @javafx.fxml.FXML
    private TextArea complaintDetailsTA;
    @javafx.fxml.FXML
    private TableColumn typeTC;
    @javafx.fxml.FXML
    private TableColumn statusTC;
    @javafx.fxml.FXML
    private TableColumn idTC;
    @javafx.fxml.FXML
    private TableColumn dateTC;
    @javafx.fxml.FXML
    private Label displayComplaintIdL;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void updateStatusOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void submitComplaintOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void backToDashboardOA(ActionEvent actionEvent) {
    }
}