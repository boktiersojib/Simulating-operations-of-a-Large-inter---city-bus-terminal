package com.example.bus_terminal;

import com.example.bus_terminal.model.PaymentGateway;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.stage.Stage;

import java.io.IOException;

public class PSAGoal1Controller {

    @FXML
    private ComboBox<PaymentGateway> editCB;

    @FXML
    private TextField merchantIdTF;

    @FXML
    private TextField urlTF;

    @FXML
    private TextField credentialsTF;

    @FXML
    private Label outputL;


    private ObservableList<PaymentGateway> gateways;

    @FXML
    public void initialize() {

        gateways = FXCollections.observableArrayList(
                new PaymentGateway("Stripe", "MID123", "https://stripe.com", "secret123"),
                new PaymentGateway("PayPal", "MID456", "https://paypal.com", "cred456"),
                new PaymentGateway("Bkash", "MID789", "https://bkash.com", "key789")
        );

        editCB.setItems(gateways);

        editCB.setOnAction(e -> {
            PaymentGateway g = editCB.getValue();
            if (g != null) {
                merchantIdTF.setText(g.getMerchantId());
                urlTF.setText(g.getUrl());
                credentialsTF.setText(g.getCredentials());
            }
        });
    }

    @FXML
    public void saveOA() {
        PaymentGateway g = editCB.getValue();
        if (g == null) {
            outputL.setText("Please select a gateway first!");
            return;
        }

        g.setMerchantId(merchantIdTF.getText());
        g.setUrl(urlTF.getText());
        g.setCredentials(credentialsTF.getText());

        outputL.setText(g.getApiKey() + " updated successfully!");
    }

    @FXML
    public void backToDashboardOA() throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Login.fxml"));
        Parent root = fxmlLoader.load();
        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.setTitle("Login");
        stage.show();
    }
}
