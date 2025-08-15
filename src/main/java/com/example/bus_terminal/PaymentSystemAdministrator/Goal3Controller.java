package com.example.bus_terminal.PaymentSystemAdministrator;

import com.example.bus_terminal.model.Transaction;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.time.LocalDate;

public class Goal3Controller {

    @FXML
    private TableView<Transaction> gatewayTV;

    @FXML
    private TableColumn<Transaction, String> transactionIdTC;

    @FXML
    private TableColumn<Transaction, LocalDate> dateTC;

    @FXML
    private TableColumn<Transaction, Double> amounTC;

    @FXML
    private TableColumn<Transaction, String> statusTC;

    @FXML
    private TableColumn<Transaction, String> methodTC;

    @FXML
    private ComboBox<String> transactionCB;

    @FXML
    private TextField transactionIdTF;

    @FXML
    private TextField amountTF;

    @FXML
    private DatePicker dateDP;

    @FXML
    private ComboBox<String> statusCB;

    @FXML
    private ComboBox<String> methodCB;

    private ObservableList<Transaction> transactions;

    @FXML
    public void initialize() {
        transactions = FXCollections.observableArrayList(

                new Transaction("TXN001", LocalDate.of(2025, 8, 1), 100.0, "Failed", "Credit Card"),
                new Transaction("TXN002", LocalDate.of(2025, 8, 2), 200.0, "Failed", "PayPal"),
                new Transaction("TXN003", LocalDate.of(2025, 8, 3), 150.0, "Failed", "Bkash")
        );


        transactionIdTC.setCellValueFactory(new PropertyValueFactory<>("transactionId"));
        dateTC.setCellValueFactory(new PropertyValueFactory<>("date"));
        amounTC.setCellValueFactory(new PropertyValueFactory<>("amount"));
        statusTC.setCellValueFactory(new PropertyValueFactory<>("status"));
        methodTC.setCellValueFactory(new PropertyValueFactory<>("method"));

        gatewayTV.setItems(transactions);

        // Sample ComboBoxes
        statusCB.setItems(FXCollections.observableArrayList("Failed", "Pending", "Completed"));
        methodCB.setItems(FXCollections.observableArrayList("Credit Card", "PayPal", "Bkash"));

        transactionCB.setItems(FXCollections.observableArrayList("TXN001", "TXN002", "TXN003"));
    }

    @FXML
    public void retryPaymentOA() {
        String txnId = transactionIdTF.getText();
        for (Transaction t : transactions) {
            if (t.getTransactionId().equals(txnId)) {
                t.setStatus("Pending");
                gatewayTV.refresh();
                showAlert("Retry Payment", "Payment retried for Transaction " + txnId);
                return;
            }
        }
        showAlert("Error", "Transaction Id not found!");
    }

    @FXML
    public void viewGatewayResponseOA() {
        Transaction selected = gatewayTV.getSelectionModel().getSelectedItem();
        if (selected != null) {
            showAlert("Gateway Response", "Transaction " + selected.getTransactionId() +
                    " status: " + selected.getStatus() + "\nMethod: " + selected.getMethod() +
                    "\nAmount: " + selected.getAmount());
        } else {
            showAlert("Error", "Select a transaction to view response.");
        }
    }

    @FXML
    public void notiffyPassengerOA() {
        Transaction selected = gatewayTV.getSelectionModel().getSelectedItem();
        if (selected != null) {
            showAlert("Notify Passenger", "Passenger notified for Transaction " + selected.getTransactionId());
        } else {
            showAlert("Error", "Select a transaction to notify.");
        }
    }

    @FXML
    public void backToDashboardOA() {
        System.out.println("Back to Dashboard clicked");
        // TODO: Implement scene switch
    }

    private void showAlert(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}
