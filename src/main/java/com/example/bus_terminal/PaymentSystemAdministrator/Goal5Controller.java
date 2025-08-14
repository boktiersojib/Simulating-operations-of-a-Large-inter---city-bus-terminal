package com.example.bus_terminal.PaymentSystemAdministrator;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.awt.*;

public class Goal5Controller
{
    @javafx.fxml.FXML
    private Label notifyPassengerL;
    @javafx.fxml.FXML
    private TableColumn passengerNameTC;
    @javafx.fxml.FXML
    private TableColumn statusTC;
    @javafx.fxml.FXML
    private TextField bookingIdTF;
    @javafx.fxml.FXML
    private TableColumn bookingIdTC;
    @javafx.fxml.FXML
    private TableColumn dateTC;
    @javafx.fxml.FXML
    private ComboBox ststusCB;
    @javafx.fxml.FXML
    private TableView paymentTV;

    @javafx.fxml.FXML
    public void initialize() {
        ststusCB.getItems().addAll(
                "Pending", "Approved", "Rejected", "Processing", "Completed");
    }

    @javafx.fxml.FXML
    public void approveOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void rejectOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void searchOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void backToDashboardOA(ActionEvent actionEvent) {
    }
}