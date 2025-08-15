
package com.example.bus_terminal;

import com.example.bus_terminal.model.RefundRequest;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.time.LocalDate;

public class PSAGoal5Controller {

    @FXML
    private TextField bookingIdTF;

    @FXML
    private ComboBox<String> ststusCB;

    @FXML
    private TableView<RefundRequest> paymentTV;

    @FXML
    private TableColumn<RefundRequest, String> statusTC;

    @FXML
    private TableColumn<RefundRequest, String> bookingIdTC;

    @FXML
    private TableColumn<RefundRequest, String> passengerNameTC;

    @FXML
    private TableColumn<RefundRequest, LocalDate> dateTC;

    @FXML
    private Label notifyPassengerL;

    private ObservableList<RefundRequest> refundRequests;

    @FXML
    public void initialize() {

        ststusCB.setItems(FXCollections.observableArrayList("Pending", "Approved", "Rejected"));

        refundRequests = FXCollections.observableArrayList(
                new RefundRequest("Pending", "B001", "Alice", LocalDate.of(2025, 8, 1)),
                new RefundRequest("Pending", "B002", "Bob", LocalDate.of(2025, 8, 2)),
                new RefundRequest("Approved", "B003", "Charlie", LocalDate.of(2025, 8, 3))
        );

        statusTC.setCellValueFactory(new PropertyValueFactory<>("status"));
        bookingIdTC.setCellValueFactory(new PropertyValueFactory<>("bookingId"));
        passengerNameTC.setCellValueFactory(new PropertyValueFactory<>("passengerName"));
        dateTC.setCellValueFactory(new PropertyValueFactory<>("date"));

        paymentTV.setItems(refundRequests);
    }

    @FXML
    public void searchOA() {
        String bookingId = bookingIdTF.getText();
        String selectedStatus = ststusCB.getValue();

        ObservableList<RefundRequest> filtered = FXCollections.observableArrayList();

        for (RefundRequest r : refundRequests) {
            boolean matches = true;
            if (bookingId != null && !bookingId.isEmpty() && !r.getBookingId().equals(bookingId)) {
                matches = false;
            }
            if (selectedStatus != null && !selectedStatus.isEmpty() && !r.getStatus().equals(selectedStatus)) {
                matches = false;
            }
            if (matches) {
                filtered.add(r);
            }
        }

        paymentTV.setItems(filtered);
    }

    @FXML
    public void approveOA() {
        RefundRequest selected = paymentTV.getSelectionModel().getSelectedItem();
        if (selected != null) {
            selected.setStatus("Approved");
            paymentTV.refresh();
            showAlert("Approved", "Refund request approved for Booking ID: " + selected.getBookingId());
        } else {
            showAlert("Error", "Select a refund request to approve.");
        }
    }

    @FXML
    public void rejectOA() {
        RefundRequest selected = paymentTV.getSelectionModel().getSelectedItem();
        if (selected != null) {
            selected.setStatus("Rejected");
            paymentTV.refresh();
            showAlert("Rejected", "Refund request rejected for Booking ID: " + selected.getBookingId());
        } else {
            showAlert("Error", "Select a refund request to reject.");
        }
    }

    @FXML
    public void backToDashboardOA() {
        System.out.println("Back to Dashboard clicked");
    }

    private void showAlert(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}
