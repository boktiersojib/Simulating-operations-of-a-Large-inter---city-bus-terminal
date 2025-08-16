package com.example.bus_terminal;

import com.example.bus_terminal.model.TripEnd;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

public class Drivergoal7Controller {

    @FXML
    private TableView<TripEnd> EndTripTableView;

    @FXML
    private TableColumn<TripEnd, String> DestinationC1;

    @FXML
    private TableColumn<TripEnd, String> TimeC2;

    private ObservableList<TripEnd> tripEndList = FXCollections.observableArrayList();

    @FXML
    public void initialize() {
        // Set up table column bindings
        DestinationC1.setCellValueFactory(new PropertyValueFactory<>("destination"));
        TimeC2.setCellValueFactory(new PropertyValueFactory<>("time"));

        // Sample data
        tripEndList.addAll(
                new TripEnd("Dhaka", "18:30"),
                new TripEnd("Chittagong", "21:00"),
                new TripEnd("Khulna", "19:15")
        );

        EndTripTableView.setItems(tripEndList);
    }

    @FXML
    private void EndTripOnAction() {
        TripEnd selectedTrip = EndTripTableView.getSelectionModel().getSelectedItem();

        if (selectedTrip == null) {
            showAlert("No Trip Selected", "Please select a trip to end.");
            return;
        }

        // Simulate ending the trip
        showAlert("Trip Ended", "The trip to " + selectedTrip.getDestination() +
                " at " + selectedTrip.getTime() + " has been marked as ended.");

        // Optionally remove from list after ending
        tripEndList.remove(selectedTrip);
    }

    @FXML
    private void BackToDashBoardOnAction() {
        Stage stage = (Stage) EndTripTableView.getScene().getWindow();
        stage.close();
    }

    // Helper method to show alerts
    private void showAlert(String title, String content) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(content);
        alert.showAndWait();
    }
}
