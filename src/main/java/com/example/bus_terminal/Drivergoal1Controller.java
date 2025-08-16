package com.example.bus_terminal;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

public class Drivergoal1Controller {

    @FXML
    private ComboBox<String> ScheduleComboBox;

    @FXML
    private ComboBox<String> RouteComboBox;

    @FXML
    private TableView<com.example.bus_terminal.Schedule> ScheduleTableView;

    @FXML
    private TableColumn<com.example.bus_terminal.Schedule, String> ArrivalTimeC1;

    @FXML
    private TableColumn<com.example.bus_terminal.Schedule, String> BusNumberC2;

    @FXML
    private TableColumn<com.example.bus_terminal.Schedule, String> DateofTripC3;

    @FXML
    private TableColumn<com.example.bus_terminal.Schedule, Integer> NumberofStopsC4;

    @FXML
    private TableColumn<com.example.bus_terminal.Schedule, String> AssignedPlatformC5;

    @FXML
    private TableColumn<com.example.bus_terminal.Schedule, String> ScheduleC6;

    @FXML
    private TableColumn<com.example.bus_terminal.Schedule, String> RouteC7;

    private ObservableList<com.example.bus_terminal.Schedule> scheduleList = FXCollections.observableArrayList();

    @FXML
    public void initialize() {
        // Link table columns to model fields
        ArrivalTimeC1.setCellValueFactory(new PropertyValueFactory<>("arrivalTime"));
        BusNumberC2.setCellValueFactory(new PropertyValueFactory<>("busNumber"));
        DateofTripC3.setCellValueFactory(new PropertyValueFactory<>("dateOfTrip"));
        NumberofStopsC4.setCellValueFactory(new PropertyValueFactory<>("numberOfStops"));
        AssignedPlatformC5.setCellValueFactory(new PropertyValueFactory<>("assignedPlatform"));
        ScheduleC6.setCellValueFactory(new PropertyValueFactory<>("schedule"));
        RouteC7.setCellValueFactory(new PropertyValueFactory<>("route"));

        // Add sample data
        scheduleList.addAll(
                new com.example.bus_terminal.Schedule("08:30 AM", "B101", "2025-08-18", 5, "Platform 1", "Morning", "Route A"),
                new com.example.bus_terminal.Schedule("02:15 PM", "B102", "2025-08-18", 3, "Platform 2", "Afternoon", "Route B"),
                new com.example.bus_terminal.Schedule("06:45 PM", "B103", "2025-08-19", 4, "Platform 3", "Evening", "Route C")
        );

        ScheduleTableView.setItems(scheduleList);

        // Fill combo boxes
        ScheduleComboBox.getItems().addAll("Morning", "Afternoon", "Evening");
        RouteComboBox.getItems().addAll("Route A", "Route B", "Route C");
    }

    @FXML
    private void SearchOnAction() {
        String selectedSchedule = ScheduleComboBox.getValue();
        String selectedRoute = RouteComboBox.getValue();

        if (selectedSchedule == null && selectedRoute == null) {
            ScheduleTableView.setItems(scheduleList);
            return;
        }

        ObservableList<com.example.bus_terminal.Schedule> filteredList = FXCollections.observableArrayList();
        for (com.example.bus_terminal.Schedule s : scheduleList) {
            boolean matchSchedule = (selectedSchedule == null || s.getSchedule().equals(selectedSchedule));
            boolean matchRoute = (selectedRoute == null || s.getRoute().equals(selectedRoute));
            if (matchSchedule && matchRoute) {
                filteredList.add(s);
            }
        }
        ScheduleTableView.setItems(filteredList);
    }

    @FXML
    private void BacktoDashBoardOnAction() {
        Stage stage = (Stage) ScheduleTableView.getScene().getWindow();
        stage.close();
    }
}


