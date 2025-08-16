package com.example.bus_terminal;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class TO_goal8Conroller
{
    @javafx.fxml.FXML
    private TextField enterReferenceTF;
    @javafx.fxml.FXML
    private TextArea updatesTA;
    @javafx.fxml.FXML
    private CheckBox confirmationCheckBox;
    @javafx.fxml.FXML
    private TextArea paymentIssueTA;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void issueRefundOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void backToDashboardOA(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader= new FXMLLoader(getClass().getResource("ticket_officer_Dashboard.fxml"));
        Scene scene= new Scene(fxmlLoader.load());
        Stage stage= new Stage();
        stage.setScene(scene);
        stage.show();
    }

    @javafx.fxml.FXML
    public void retryPaymentOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void searchOA(ActionEvent actionEvent) {
    }
}