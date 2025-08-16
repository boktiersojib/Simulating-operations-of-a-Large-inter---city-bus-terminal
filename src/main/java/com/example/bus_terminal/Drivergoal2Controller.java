package com.example.bus_terminal;

import com.example.bus_terminal.model.Trip;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.stage.Stage;
import javafx.scene.control.cell.PropertyValueFactory;

public class Drivergoal2Controller {

    @FXML
    private ComboBox<String> SelectTripComboBox;

    @FXML
    private RadioButton NoRadioButton;

    @FXML
    private RadioButton YesRadioButton;

    @FXML
    private TableView<Trip> TripTableView;

    @FXML
    private TableColumn<Trip, String> TripC1;

    @FXML
    private TableColumn<Trip, String> MarkArrivalC2;

    private ObservableList<Trip> tripList = FXCollections.observableArrayList();

    @FXML
    public void initialize() {
        // Group Yes/No radio buttons
        ToggleGroup arrivalToggleGroup = new ToggleGroup();
        YesRadioButton.setToggleGroup(arrivalToggleGroup);
        NoRadioButton.setToggleGroup(arrivalToggleGroup);

        // Table column bindings (PropertyValueFactory uses getter method names)
        TripC1.setCellValueFactory(new PropertyValueFactory<>("tripName"));
        MarkArrivalC2.setCellValueFactory(new PropertyValueFactory<>("markArrival"));

        // Sample data
        tripList.addAll(
                new Trip("Trip 101", "No"),
                new Trip("Trip 102", "Yes"),
                new Trip("Trip 103", "No")
        );

        TripTableView.setItems(tripList);

        // Fill combo box
        SelectTripComboBox.getItems().addAll("Trip 101", "Trip 102", "Trip 103");

        // Update radio buttons when selecting a trip
        SelectTripComboBox.setOnAction(event -> {
            String selectedTrip = SelectTripComboBox.getValue();
            if (selectedTrip != null) {
                for (Trip t : tripList) {
                    if (t.getTripName().equals(selectedTrip)) {
                        if (t.getMarkArrival().equalsIgnoreCase("Yes")) {
                            YesRadioButton.setSelected(true);
                        } else {
                            NoRadioButton.setSelected(true);
                        }
                        break;
                    }
                }
            }
        });

        // Update table when Yes/No changes
        arrivalToggleGroup.selectedToggleProperty().addListener((obs, oldToggle, newToggle) -> {
            if (newToggle != null && SelectTripComboBox.getValue() != null) {
                String selectedTrip = SelectTripComboBox.getValue();
                String newValue = YesRadioButton.isSelected() ? "Yes" : "No";

                for (Trip t : tripList) {
                    if (t.getTripName().equals(selectedTrip)) {
                        t.setMarkArrival(newValue); // update data
                        TripTableView.refresh(); // refresh table display
                        break;
                    }
                }
            }
        });
    }

    @FXML
    private void BackToDashBoardOnAction() {
        Stage stage = (Stage) TripTableView.getScene().getWindow();
        stage.close();
    }
}
