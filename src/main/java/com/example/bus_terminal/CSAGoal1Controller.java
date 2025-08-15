package com.example.bus_terminal;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.awt.*;

import com.example.bus_terminal.model.Ticket;
import javafx.scene.control.cell.PropertyValueFactory;

public class CSAGoal1Controller
{
    @javafx.fxml.FXML
    private TableColumn ticketIdTC;
    @javafx.fxml.FXML
    private Label handleQueriesL;
    @javafx.fxml.FXML
    private TableColumn subjectTC;
    @javafx.fxml.FXML
    private TableView ticketTV;
    @javafx.fxml.FXML
    private TableColumn statusTC;
    @javafx.fxml.FXML
    private Label passengerQueryDetailsL;
    @javafx.fxml.FXML
    private TableColumn referanceTC;

    @javafx.fxml.FXML
    public void initialize() {

        public void initialize() {

            ticketIdTC.setCellValueFactory(new PropertyValueFactory<>("ticketId"));
            subjectTC.setCellValueFactory(new PropertyValueFactory<>("subject"));
            statusTC.setCellValueFactory(new PropertyValueFactory<>("status"));
            referanceTC.setCellValueFactory(new PropertyValueFactory<>("reference"));


            ObservableList ticketList = FXCollections.observableArrayList(
                    new Ticket("T001", "Booking Issue", "Pending", "Ref123"),
                    new Ticket("T002", "Payment Delay", "In Progress", "Ref456"),
                    new Ticket("T003", "Schedule Change", "Resolved", "Ref789")
            );

            ticketTV.setItems(ticketList);



    }

       public void acceptOA(ActionEvent Object actionEvent;
        actionEvent) {
    }

    @javafx.fxml.FXML
    public void backToDashboardOA(ActionEvent actionEvent) {
    }
}