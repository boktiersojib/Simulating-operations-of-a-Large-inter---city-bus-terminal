package com.example.bus_terminal.PaymentSystemAdministrator;

import javafx.collections.FXCollections;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

import java.awt.*;
import java.awt.event.ActionEvent;

public class Goal1Controller
{
    @javafx.fxml.FXML
    private TextField credentialsTF;
    @javafx.fxml.FXML
    private TextField apiKeysTF;
    @javafx.fxml.FXML
    private ComboBox editCB;
    @javafx.fxml.FXML
    private TextField urlTF;
    @javafx.fxml.FXML
    private Label outputL;
    @javafx.fxml.FXML
    private TextField merchantIdTF;
    @javafx.fxml.FXML
    private Label managePaymentGatewayL;

    @javafx.fxml.FXML
    public void initialize() {
        editCB.getItems().addAll(
                        "PayPal", "Stripe", "Square", "bKash", "Nagad", "Rocket");

        editCB.setOnAction(e -> {
            String selected = editCB.getValue().toString();
            if (selected != null) {
                outputL.setText("Editing settings for: " + selected);
                // Optionally, load existing gateway details from a database
                apiKeysTF.clear();
                merchantIdTF.clear();
                urlTF.clear();
                credentialsTF.clear();
            }
        });

    }

    @javafx.fxml.FXML
    public void saveOA(ActionEvent actionEvent) {

        String gateway = editCB.getValue().toString();
        String apiKey = apiKeysTF.getText();
        String merchantId = merchantIdTF.getText();
        String url = urlTF.getText();
        String credentials = credentialsTF.getText();

        if (gateway == null || gateway.isEmpty()) {
            outputL.setText("Please select a payment gateway.");
            return;

        }

        ActionEvent actionEvent1 = actionEvent;
        @javafx.fxml.FXML
        public void backToDashboardOA actionEvent){
            System.out.println("Back to Dashboard clicked");

        }
    }
}