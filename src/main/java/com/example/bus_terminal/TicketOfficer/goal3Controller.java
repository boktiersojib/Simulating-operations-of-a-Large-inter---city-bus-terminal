package com.example.bus_terminal.TicketOfficer;

import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class goal3Controller
{
    @javafx.fxml.FXML
    private TableColumn<TicketOfficer, String> busCol;
    @javafx.fxml.FXML
    private TableColumn<TicketOfficer, String> passengerNameCol;
    @javafx.fxml.FXML
    private TextField enterBookingReferenceTF;
    @javafx.fxml.FXML
    private TableColumn<TicketOfficer, String> dateCol;
    @javafx.fxml.FXML
    private TableColumn routeCol;
    @javafx.fxml.FXML
    private TableView bookingDetailsTV;
    @javafx.fxml.FXML
    private TableColumn seatNumberCol;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void searchOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void reprintTicketOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void backToDashboardOA(ActionEvent actionEvent) {
    }
}