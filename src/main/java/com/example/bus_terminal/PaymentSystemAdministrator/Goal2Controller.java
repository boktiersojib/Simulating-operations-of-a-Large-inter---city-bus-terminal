package com.example.bus_terminal.PaymentSystemAdministrator;

import com.example.bus_terminal.model.Transaction;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.time.LocalDate;

public class Goal2Controller {

    @FXML
    private DatePicker datePicker;

    @FXML
    private ComboBox<String> statusCB;

    @FXML
    private ComboBox<String> paymentMethodCB;

    @FXML
    private TableView<Transaction> tableView;

    @FXML
    private TableColumn<Transaction, LocalDate> dateTC;

    @FXML
    private TableColumn<Transaction, String> statusTC;

    @FXML
    private TableColumn<Transaction, String> paymentMethodTC;

    @FXML
    private Label monitorTransactionL;

    private ObservableList<Transaction> transactions;

    @FXML
    public void initialize() {
        // Sample data
        transactions = FXCollections.observableArrayList(
                new Transaction(LocalDate.of(2025, 8, 1), "Completed", "Credit Card"),
                new Transaction(LocalDate.of(2025, 8, 2), "Pending", "PayPal"),
                new Transaction(LocalDate.of(2025, 8, 3), "Failed", "Bkash"),
                new Transaction(LocalDate.of(2025, 8, 4), "Completed", "Credit Card")
        );


        statusCB.setItems(FXCollections.observableArrayList("Completed", "Pending", "Failed"));
        paymentMethodCB.setItems(FXCollections.observableArrayList("Credit Card", "PayPal", "Bkash"));


        dateTC.setCellValueFactory(new PropertyValueFactory<>("date"));
        statusTC.setCellValueFactory(new PropertyValueFactory<>("status"));
        paymentMethodTC.setCellValueFactory(new PropertyValueFactory<>("paymentMethod"));


        tableView.setItems(transactions);
    }

    @FXML
    public void searchOA() {
        LocalDate selectedDate = datePicker.getValue();
        String selectedStatus = statusCB.getValue();
        String selectedPaymentMethod = paymentMethodCB.getValue();

        ObservableList<Transaction> filtered = FXCollections.observableArrayList();

        for (Transaction t : transactions) {
            boolean matches = true;

            if (selectedDate != null && !t.getDate().equals(selectedDate)) {
                matches = false;
            }
            if (selectedStatus != null && !t.getStatus().equals(selectedStatus)) {
                matches = false;
            }
            if (selectedPaymentMethod != null && !t.getPaymentMethod().equals(selectedPaymentMethod)) {
                matches = false;
            }

            if (matches) {
                filtered.add(t);
            }
        }

        tableView.setItems(filtered);
    }

    @FXML
    public void backToDashboardOA() {

        System.out.println("Back to Dashboard clicked!");

    }
}
