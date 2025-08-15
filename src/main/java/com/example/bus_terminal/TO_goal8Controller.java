package com.example.bus_terminal;

import com.example.bus_terminal.model.BookingRecord;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class TO_goal8Controller {

    @FXML private TextField enterReferenceTF;
    @FXML private TextArea paymentIssueTA;
    @FXML private CheckBox confirmationCheckBox;
    @FXML private TextArea updatesTA;

    // Simulated data store (Reference → BookingRecord)
    private Map<String, BookingRecord> bookingData = new HashMap<>();

    @FXML
    private void initialize() {
        bookingData.put("BR001", new BookingRecord("BR001", "PR001", "Alice", "Bus-1", "CityA-CityB", "A1", "2025-08-15", false, "Payment failed"));
        bookingData.put("BR002", new BookingRecord("BR002", "PR002", "Bob", "Bus-2", "CityC-CityD", "B2", "2025-08-16", true, ""));
    }

    // Search booking/payment reference
    @FXML
    private void searchOA() {
        String ref = enterReferenceTF.getText();
        BookingRecord record = bookingData.get(ref);
        if (record != null) {
            paymentIssueTA.setText(record.getPaymentIssue());
            confirmationCheckBox.setSelected(record.isPaymentConfirmed());
            updatesTA.setText("Record found for reference: " + ref);
        } else {
            paymentIssueTA.setText("");
            confirmationCheckBox.setSelected(false);
            updatesTA.setText("No record found for reference: " + ref);
        }
    }

    // Retry payment
    @FXML
    private void retryPaymentOA() {
        String ref = enterReferenceTF.getText();
        BookingRecord record = bookingData.get(ref);
        if (record != null) {
            record.setPaymentConfirmed(true);
            record.setPaymentIssue("");
            confirmationCheckBox.setSelected(true);
            updatesTA.setText("Payment retried and confirmed for reference: " + ref);
        } else {
            updatesTA.setText("Cannot retry payment. Reference not found.");
        }
    }

    // Issue refund
    @FXML
    private void issueRefundOA() {
        String ref = enterReferenceTF.getText();
        BookingRecord record = bookingData.get(ref);
        if (record != null) {
            record.setPaymentConfirmed(false);
            updatesTA.setText("Refund issued for reference: " + ref);
        } else {
            updatesTA.setText("Cannot issue refund. Reference not found.");
        }
    }

    // Back to dashboard
    @FXML
    private void backToDashboardOA() throws IOException {
        FXMLLoader fxmlLoader= new FXMLLoader(getClass().getResource("ticket.officer.Dashboard"));
        Scene scene= new Scene(fxmlLoader.load());
        Stage stage= new Stage();
        stage.setScene(scene);
        stage.show();
    }
}