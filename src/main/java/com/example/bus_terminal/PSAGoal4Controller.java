package com.example.bus_terminal;

import com.example.bus_terminal.model.PaymentReport;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class PSAGoal4Controller {

    @FXML
    private ComboBox<String> reportTypeCB;

    @FXML
    private TableView<PaymentReport> reportTV;

    @FXML
    private TableColumn<PaymentReport, String> transactionIdTC;

    @FXML
    private TableColumn<PaymentReport, LocalDate> dateTC;

    @FXML
    private TableColumn<PaymentReport, Double> amountTC;

    @FXML
    private TableColumn<PaymentReport, String> reportTypeTC;

    @FXML
    private TableColumn<PaymentReport, String> paymentMethodType;

    @FXML
    private Label paymentReportL;

    private ObservableList<PaymentReport> reports;

    @FXML
    public void initialize() {
        // Sample report types
        reportTypeCB.setItems(FXCollections.observableArrayList("Daily", "Monthly", "Yearly"));

        List<PaymentReport> reports = new ArrayList<>();

        reports.add(new PaymentReport("TXN001", LocalDate.of(2025, 8, 1), 100.0, "Daily", "Credit Card"));
        reports.add(new PaymentReport("TXN002", LocalDate.of(2025, 8, 2), 200.0, "Monthly", "PayPal"));
        reports.add(new PaymentReport("TXN003", LocalDate.of(2025, 8, 3), 150.0, "Yearly", "Bkash"));

        // Set TableView columns
        transactionIdTC.setCellValueFactory(new PropertyValueFactory<>("transactionId"));
        dateTC.setCellValueFactory(new PropertyValueFactory<>("date"));
        amountTC.setCellValueFactory(new PropertyValueFactory<>("amount"));
        reportTypeTC.setCellValueFactory(new PropertyValueFactory<>("reportType"));
        paymentMethodType.setCellValueFactory(new PropertyValueFactory<>("paymentMethod"));

        // Populate TableView
        reportTV.setItems(reports);
    }

    @FXML
    public void generateReportOA() {
        String selectedReportType = reportTypeCB.getValue();
        if (selectedReportType == null) {
            showAlert("Error", "Please select a report type!");
            return;
        }

        ObservableList<PaymentReport> filtered = FXCollections.observableArrayList();

        for (PaymentReport r : reports) {
            if (r.getReportType().equals(selectedReportType)) {
                filtered.add(r);
            }
        }

        reportTV.setItems(filtered);
        showAlert("Report Generated", selectedReportType + " report generated successfully!");
    }

    @FXML
    public void downloadReportOA() {
        PaymentReport selected = reportTV.getSelectionModel().getSelectedItem();
        if (selected != null) {
            showAlert("Download Report", "Report for Transaction " + selected.getTransactionId() + " downloaded!");
        } else {
            showAlert("Error", "Select a report to download.");
        }
    }

    @FXML
    public void backToDashboardOA() {
        System.out.println("Back to Dashboard clicked");
        // TODO: Implement scene switch logic
    }

    private void showAlert(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}
