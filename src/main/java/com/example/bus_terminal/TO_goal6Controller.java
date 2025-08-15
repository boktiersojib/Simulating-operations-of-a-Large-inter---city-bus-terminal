package com.example.bus_terminal;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class TO_goal6Controller implements Initializable {

    // UI Components
    @FXML
    private ComboBox<String> selectReportTypeCB;
    @FXML
    private TextArea resultTA;
    @FXML
    private Button printButton;
    @FXML
    private Button backToDashboardButton;

    // Initialize method
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // Populate ComboBox with sample report types
        selectReportTypeCB.getItems().addAll("Daily Report", "Weekly Report", "Monthly Report");
    }

    // Event Handlers
    @FXML
    private void generateReportOA() {
        String selectedType = selectReportTypeCB.getValue();
        if (selectedType != null) {
            // Here we simulate generating a report
            String reportContent = "Generated " + selectedType + "...\nSample report data here.";
            resultTA.setText(reportContent);
        } else {
            resultTA.setText("Please select a report type.");
        }
    }

    @FXML
    private void printOA() {
        String reportContent = resultTA.getText();
        if (!reportContent.isEmpty()) {
            System.out.println("Printing Report:\n" + reportContent);
            // Printing logic would be added here
        } else {
            System.out.println("No report to print.");
        }
    }

    @FXML
    private void backToDashboardOA() throws IOException {
        FXMLLoader fxmlLoader= new FXMLLoader(getClass().getResource("ticket.officer.Dashboard"));
        Scene scene= new Scene(fxmlLoader.load());
        Stage stage= new Stage();
        stage.setScene(scene);
        stage.show();
    }
}
