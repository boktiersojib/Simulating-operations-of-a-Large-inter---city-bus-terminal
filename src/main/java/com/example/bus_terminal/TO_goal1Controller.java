package com.example.bus_terminal;

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

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class TO_goal1Controller {

    @FXML private ComboBox<String> selectDepartureCityCB;
    @FXML private ComboBox<String> selectDestinationCityCB;
    @FXML private DatePicker chooseTravelDateDP;
    @FXML private TableView<Bus> busTV;
    @FXML private TableColumn<Bus, String> busNumberCol;
    @FXML private TableColumn<Bus, String> departureCol;
    @FXML private TableColumn<Bus, String> arrivalCol;
    @FXML private TableColumn<Bus, Double> fareCOL;
    @FXML private TableColumn<Bus, Integer> seatsCol;

    @FXML private TextField passengerNameTF;
    @FXML private TextField phoneNumberTF;
    @FXML private TextField emailTF;
    @FXML private TextField ageTF;
    @FXML private ComboBox<String> genderCB;

    private ObservableList<Bus> buses = FXCollections.observableArrayList();

    private static final String FILE_NAME_TXT = "Buses.txt";
    private static final String FILE_NAME_BIN = "Buses.bin";

    @FXML
    public void initialize() {
        // Setup TableView columns
        busNumberCol.setCellValueFactory(new PropertyValueFactory<>("busNumber"));
        departureCol.setCellValueFactory(new PropertyValueFactory<>("departure"));
        arrivalCol.setCellValueFactory(new PropertyValueFactory<>("arrival"));
        fareCOL.setCellValueFactory(new PropertyValueFactory<>("fare"));
        seatsCol.setCellValueFactory(new PropertyValueFactory<>("seats"));

        // Populate city ComboBoxes
        selectDepartureCityCB.setItems(FXCollections.observableArrayList("Dhaka", "Chittagong", "Sylhet", "Khulna"));
        selectDestinationCityCB.setItems(FXCollections.observableArrayList("Dhaka", "Chittagong", "Sylhet", "Khulna"));

        // Populate gender ComboBox
        genderCB.setItems(FXCollections.observableArrayList("Male", "Female", "Other"));

        // Load from file if available
        loadFromTextFile();
    }

    @FXML
    public void searchOA(ActionEvent event) {
        // Sample dummy buses (You can later load from DB or API)
        buses.clear();
        buses.addAll(
                new Bus("B101", "Dhaka", "Chittagong", 900.0, 40),
                new Bus("B202", "Sylhet", "Dhaka", 1200.0, 35),
                new Bus("B303", "Khulna", "Dhaka", 800.0, 50)
        );
        busTV.setItems(buses);
    }

    @FXML
    public void confirmBookingAndSendTicketOA(ActionEvent event) {
        String name = passengerNameTF.getText();
        String phone = phoneNumberTF.getText();
        String email = emailTF.getText();
        String age = ageTF.getText();
        String gender = genderCB.getValue();

        Bus selectedBus = busTV.getSelectionModel().getSelectedItem();

        if (selectedBus == null) {
            showAlert("Error", "Please select a bus to book.");
            return;
        }

        if (name.isEmpty() || phone.isEmpty() || email.isEmpty() || age.isEmpty() || gender == null) {
            showAlert("Error", "Please fill all passenger details.");
            return;
        }

        // In real project: save booking to DB or send email
        showAlert("Booking Confirmed",
                "Ticket booked for " + name + "\nBus: " + selectedBus.getBusNumber() +
                        "\nFrom: " + selectedBus.getDeparture() + " To: " + selectedBus.getArrival());
    }

    @FXML
    public void backToTicketingDashboardOA(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader= new FXMLLoader(getClass().getResource("ticket_officer_Dashboard.fxml"));
        Scene scene= new Scene(fxmlLoader.load());
        Stage stage= new Stage();
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void saveToTextFileOA(ActionEvent event) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME_TXT))) {
            for (Bus bus : buses) {
                writer.write(bus.getBusNumber() + "," + bus.getDeparture() + "," +
                        bus.getArrival() + "," + bus.getFare() + "," + bus.getSeats());
                writer.newLine();
            }
            showAlert("Success", "Buses saved to text file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    public void saveToBinaryFileOA(ActionEvent event) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME_BIN))) {
            oos.writeObject(new ArrayList<>(buses));
            showAlert("Success", "Buses saved to binary file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void loadFromTextFile() {
        File file = new File(FILE_NAME_TXT);
        if (!file.exists()) return;

        buses.clear();
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 5) {
                    buses.add(new Bus(parts[0], parts[1], parts[2],
                            Double.parseDouble(parts[3]), Integer.parseInt(parts[4])));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        busTV.setItems(buses);
    }

    private void showAlert(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setHeaderText(null);
        alert.setTitle(title);
        alert.setContentText(message);
        alert.showAndWait();
    }
}

