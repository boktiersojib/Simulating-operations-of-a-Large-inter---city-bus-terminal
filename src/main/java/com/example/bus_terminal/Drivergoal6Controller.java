package com.example.bus_terminal;

import com.example.bus_terminal.model.OvertimeRequest;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.stage.Stage;
import java.time.LocalDate;

public class Drivergoal6Controller {

    @FXML
    private DatePicker DateDatePicker;

    @FXML
    private TextField TimeTextField;

    @FXML
    private TextField ReasonTextField;

    @FXML
    private Label notifiaction;

    @FXML
    public void initialize() {
        notifiaction.setText(""); // Clear any notification text on start
    }

    @FXML
    private void ConfirmovertimeOnAction() {
        LocalDate date = DateDatePicker.getValue();
        String time = TimeTextField.getText();
        String reason = ReasonTextField.getText();

        if (date == null || time.isEmpty() || reason.isEmpty()) {
            notifiaction.setText("⚠ Please fill in all fields before confirming.");
            return;
        }

        // Create an OvertimeRequest object
        OvertimeRequest request = new OvertimeRequest(date, time, reason);

        // Here you could send the request to a database or API
        notifiaction.setText("✅ Overtime request submitted:\n" +
                "Date: " + request.getDate() +
                " | Time: " + request.getTime() +
                "\nReason: " + request.getReason());

        // Clear fields after submission
        DateDatePicker.setValue(null);
        TimeTextField.clear();
        ReasonTextField.clear();
    }

    @FXML
    private void BackToDashBoardOnAction() {
        Stage stage = (Stage) ReasonTextField.getScene().getWindow();
        stage.close();
    }
}
