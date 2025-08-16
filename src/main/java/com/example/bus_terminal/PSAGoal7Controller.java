package com.example.bus_terminal;

import com.example.bus_terminal.model.PaymentLogs;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class PSAGoal7Controller {

    @FXML
    private TableView<PaymentLogs> paymentLogsTV;

    @FXML
    private TableColumn<PaymentLogs, LocalDate> dateTC;

    @FXML
    private TableColumn<PaymentLogs, String> userNameTC;

    @FXML
    private TableColumn<PaymentLogs, String> gatewayTC;

    @FXML
    private DatePicker dateDP;

    @FXML
    private ComboBox<String> gatewayCB;

    @FXML
    private TextField userNmaeTF;

    @FXML
    private Label paymentlogsL;

    // Main list of all payment logs
    private ObservableList<PaymentLogs> paymentLogsList = FXCollections.observableArrayList();

    @FXML
    public void initialize() {
        // Gateway options
        gatewayCB.setItems(FXCollections.observableArrayList(
                "Bkash", "Nagad", "Rocket", "Credit Card", "Debit Card", "Cash"
        ));

        // Table column bindings
        dateTC.setCellValueFactory(new PropertyValueFactory<>("date"));
        userNameTC.setCellValueFactory(new PropertyValueFactory<>("userName"));
        gatewayTC.setCellValueFactory(new PropertyValueFactory<>("gateway"));

        // Example dummy data
        paymentLogsList.addAll(
                new PaymentLogs(LocalDate.now().minusDays(1), "Alice", "Bkash"),
                new PaymentLogs(LocalDate.now(), "Bob", "Credit Card"),
                new PaymentLogs(LocalDate.now().minusDays(2), "Charlie", "Nagad")
        );

        paymentLogsTV.setItems(paymentLogsList);
    }

    @FXML
    private void searchOA() {
        LocalDate selectedDate = dateDP.getValue();
        String selectedGateway = gatewayCB.getValue();
        String userNameFilter = userNmaeTF.getText() != null ? userNmaeTF.getText().trim() : "";

        List<PaymentLogs> filtered = paymentLogsList.stream()
                .filter(log -> (selectedDate == null || log.getDate().equals(selectedDate)))
                .filter(log -> (selectedGateway == null || log.getGateway().equalsIgnoreCase(selectedGateway)))
                .filter(log -> (userNameFilter.isEmpty() || log.getUserName().toLowerCase().contains(userNameFilter.toLowerCase())))
                .collect(Collectors.toList());

        paymentLogsTV.setItems(FXCollections.observableArrayList(filtered));
    }

    @FXML
    private void markReviewOA() {
        PaymentLogs selectedLog = paymentLogsTV.getSelectionModel().getSelectedItem();
        if (selectedLog == null) {
            showAlert("No Selection", "Please select a log to mark as reviewed.");
            return;
        }

        paymentlogsL.setText("Marked log as reviewed: " +
                selectedLog.getUserName() + " (" + selectedLog.getGateway() + ")");
    }

    @FXML
    private void exportLogsOA() {
        try (FileWriter writer = new FileWriter("payment_logs_export.csv")) {
            writer.write("Date,User Name,Gateway\n");
            for (PaymentLogs log : paymentLogsTV.getItems()) {
                writer.write(log.getDate() + "," + log.getUserName() + "," + log.getGateway() + "\n");
            }
            showAlert("Export Successful", "Logs exported to payment_logs_export.csv");
        } catch (IOException e) {
            showAlert("Export Error", "Failed to export logs: " + e.getMessage());
        }
    }

    @FXML
    private void backToDashboardOA() {
        System.out.println("Navigating back to dashboard...");
    }

    private void showAlert(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}
