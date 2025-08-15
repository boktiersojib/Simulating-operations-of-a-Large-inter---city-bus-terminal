package com.example.bus_terminal;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.awt.*;
import java.io.IOException;

public class CSAGoal8Controller
{
    @javafx.fxml.FXML
    private TextField passengerContactTF;
    @javafx.fxml.FXML
    private TextArea caseDetailsTA;
    @javafx.fxml.FXML
    private Label followopAndCollectFeedbackL;
    @javafx.fxml.FXML
    private TextArea feedbackTA;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void sendFollowUpMessageOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void logsFeedbackOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void generateReportOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void closeCaseOA(ActionEvent actionEvent) {
    }

    @Deprecated
    public void openCaseDetailesOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void backToDashboardOA(ActionEvent actionEvent) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("customersupportagent.fxml"));
        Parent root = fxmlLoader.load();
        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.setTitle("Login");
        stage.show();
    }
}