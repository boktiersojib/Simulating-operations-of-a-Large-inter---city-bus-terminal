package com.example.bus_terminal;

import javafx.event.ActionEvent;
import javafx.scene.layout.BorderPane;

import java.awt.*;

public class paymentsystemadministratorController
{
    @javafx.fxml.FXML
    private TextArea infoTA;
    @javafx.fxml.FXML
    private BorderPane paymentSystemAdministratorBP;

    @javafx.fxml.FXML
    public void initialize() {
            // Set a welcome message
            infoTA.setText(
                    "Welcome to the Payment System Administrator Dashboard.\n\n" +
                            "Available Actions:\n" +
                            "1. Manage Payment Methods\n" +
                            "2. Process Refund Requests\n" +
                            "3. Review Payment Logs\n" +
                            "4. Manage Payment Gateways\n" +
                            "5. Monitor Transactions\n" +
                            "6. Resolve Failed Transactions\n" +
                            "7. Fraud Detection\n" +
                            "8. Generate Reports\n\n" +
                            "Please select an action from the menu."
            );

            infoTA.setEditable(false);




    }

    @javafx.fxml.FXML
    public void signOutOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void managePaymentMethodsOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void processRefundRequsetOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void reviewPaymentLogsOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void managePaymentGatewayOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void monitorTransactionsOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void resolveFailedTransactinOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void fraudDetectionOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void generateReportsOA(ActionEvent actionEvent) {
    }
}