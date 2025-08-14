package com.example.bus_terminal.TicketOfficer;

import com.example.bus_terminal.model.Bus;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.time.LocalDate;

public class goal1Controller {

    @FXML
    private ComboBox<String> selectDepartureCityCB;

    @FXML
    private ComboBox<String> selectDestinationCityCB;

    @FXML
    private DatePicker chooseTravelDateDP;

    @FXML
    private TableView<Bus> busTV;

    @FXML
    private TableColumn<Bus, String> busNumberCol;

    @FXML
    private TableColumn<Bus, String> departureCol;

    @FXML
    private TableColumn<Bus, String> arrivalCol;

    @FXML
    private TableColumn<Bus, Double> fareCOL;

    @FXML
    private TableColumn<Bus, Integer> seatsCol;

    @FXML
    private TextField passengerNameTF;

    @FXML
    private TextField phoneNumberTF;

    @FXML
    private TextField emailTF;

    @FXML
    private TextField ageTF;

    @FXML
    private ComboBox<String> genderCB;

    private ObservableList<Bus> busList = FXCollections.observableArrayList();

    @FXML
    public void initialize() {
        // Initialize combo boxes
        selectDepartureCityCB.setItems(FXCollections.observableArrayList("Dhaka", "Chittagong", "Khulna", "Sylhet"));
        selectDestinationCityCB.setItems(FXCollections.observableArrayList("Dhaka", "Chittagong", "Khulna", "Sylhet"));
        genderCB.setItems(FXCollections.observableArrayList("Male", "Female", "Other"));

        // Initialize TableView columns
        busNumberCol.setCellValueFactory(new PropertyValueFactory<>("busNumber"));
        departureCol.setCellValueFactory(new PropertyValueFactory<>("departure"));
        arrivalCol.setCellValueFactory(new PropertyValueFactory<>("arrival"));
        fareCOL.setCellValueFactory(new PropertyValueFactory<>("fare"));
        seatsCol.setCellValueFactory(new PropertyValueFactory<>("seats"));

        busTV.setItems(busList);
    }

    @FXML
    void searchOA(ActionEvent event) {
        String departureCity = selectDepartureCityCB.getValue();
        String destinationCity = selectDestinationCityCB.getValue();
        LocalDate travelDate = chooseTravelDateDP.getValue();

        if (departureCity == null || destinationCity == null || travelDate == null) {
            showAlert(Alert.AlertType.ERROR, "Error", "Please select departure, destination and travel date.");
            return;
        }

        // Sample Data
        busList.clear();
        busList.add(new Bus("Bus101", departureCity, destinationCity, 500.0, 30));
        busList.add(new Bus("Bus102", departureCity, destinationCity, 450.0, 25));
        busList.add(new Bus("Bus103", departureCity, destinationCity, 600.0, 20));
    }

    @FXML
    void confirmBookingAndSendTicketOA(ActionEvent event) {
        Bus selectedBus = busTV.getSelectionModel().getSelectedItem();
        String name = passengerNameTF.getText();
        String phone = phoneNumberTF.getText();
        String email = emailTF.getText();
        int age = 0;
        try {
            age = Integer.parseInt(ageTF.getText());
        } catch (NumberFormatException e) {
            showAlert(Alert.AlertType.ERROR, "Error", "Please enter a valid age.");
            return;
        }
        String gender = genderCB.getValue();

        if (selectedBus == null || name.isEmpty() || phone.isEmpty() || email.isEmpty() || gender == null) {
            showAlert(Alert.AlertType.ERROR, "Error", "Please fill all fields and select a bus.");
            return;
        }

        // Process booking (can be linked to DB later)
        showAlert(Alert.AlertType.INFORMATION, "Success",
                "Booking confirmed for " + name + "\nBus: " + selectedBus.getBusNumber() +
                        "\nDeparture: " + selectedBus.getDeparture() +
                        "\nArrival: " + selectedBus.getArrival() +
                        "\nDate: " + chooseTravelDateDP.getValue() +
                        "\nAge: " + age +
                        "\nGender: " + gender);

        clearFields();
    }

    @FXML
    void backToTicketingDashboardOA(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader= new FXMLLoader(getClass().getResource("login.fxml"));
        Scene scene= new Scene(fxmlLoader.load());
        Stage stage= new Stage();
        stage.setScene(scene);
        stage.show();
    }

    private void clearFields() {
        passengerNameTF.clear();
        phoneNumberTF.clear();
        emailTF.clear();
        ageTF.clear();
        genderCB.getSelectionModel().clearSelection();
        busTV.getSelectionModel().clearSelection();
    }

    private void showAlert(Alert.AlertType type, String title, String message) {
        Alert alert = new Alert(type);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}
