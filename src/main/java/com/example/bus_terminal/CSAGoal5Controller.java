package com.example.bus_terminal;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

import java.awt.*;

public class CSAGoal5Controller
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

        complaintTypeCB.getItems().addAll(
                "Late Bus", "Rude Staff", "Lost Luggage", "Payment Issue", "Other");




    }

    @javafx.fxml.FXML
    public void updateStatusOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void submitComplaintOA(ActionEvent actionEvent) {

        String name = passengerNameTF.getText();
        String contact = passengerContactTF.getText();
        String type = complaintTypeCB.getValue().toString();
        String details = complaintDetailsTA.getText();
    }

    @javafx.fxml.FXML
    public void backToDashboardOA(ActionEvent actionEvent) {
    }
}