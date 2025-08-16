package com.example.bus_terminal;

import com.example.bus_terminal.model.PaymentMethod;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.time.LocalDate;

public class PSAGoal6Controller {

    @FXML
    private ComboBox<String> methodNameCB;

    @FXML
    private CheckBox toggloeSwitchOnCheckBOx; // "on"

    @FXML
    private CheckBox toggleSWitchOfCheckBox; // "off"

    @FXML
    private TableView<PaymentMethod> paymentMethodTV;

    @FXML
    private TableColumn<PaymentMethod, String> methodNameTC;

    @FXML
    private TableColumn<PaymentMethod, String> toggleSwitchTC;

    @FXML
    private TableColumn<PaymentMethod, Double> transactionLimitTC;

    @FXML
    private TableColumn<PaymentMethod, Double> feesLimitTC;

    @FXML
    private TableColumn<PaymentMethod, LocalDate> dateTC;

    @FXML
    private Label notifiesstackeholdersL;

    private ObservableList<PaymentMethod> paymentMethodList = FXCollections.observableArrayList();

    @FXML
    public void initialize() {
        // ComboBox sample values
        methodNameCB.setItems(FXCollections.observableArrayList(
                "Bkash", "Nagad", "Rocket", "Credit Card", "Debit Card", "Cash"
        ));

        // Make checkboxes mutually exclusive
        toggloeSwitchOnCheckBOx.setOnAction(e -> {
            if (toggloeSwitchOnCheckBOx.isSelected()) {
                toggleSWitchOfCheckBox.setSelected(false);
            }
        });

        toggleSWitchOfCheckBox.setOnAction(e -> {
            if (toggleSWitchOfCheckBox.isSelected()) {
                toggloeSwitchOnCheckBOx.setSelected(false);
            }
        });

        // Table column bindings
        methodNameTC.setCellValueFactory(new PropertyValueFactory<>("methodName"));
        toggleSwitchTC.setCellValueFactory(new PropertyValueFactory<>("toggleSwitch"));
        transactionLimitTC.setCellValueFactory(new PropertyValueFactory<>("transactionLimit"));
        feesLimitTC.setCellValueFactory(new PropertyValueFactory<>("feesLimit"));
        dateTC.setCellValueFactory(new PropertyValueFactory<>("date"));

        paymentMethodTV.setItems(paymentMethodList);
    }

    @FXML
    private void saveOA() {
        String methodName = methodNameCB.getValue();
        String toggleSwitch = toggloeSwitchOnCheckBOx.isSelected() ? "ON" :
                toggleSWitchOfCheckBox.isSelected() ? "OFF" : null;

        if (methodName == null || toggleSwitch == null) {
            showAlert("Validation Error", "Please select both a method name and toggle switch.");
            return;
        }

        // For this example, limits are hardcoded or can be generated randomly
        double transactionLimit = Math.round(Math.random() * 10000) / 1.0;
        double feesLimit = Math.round(Math.random() * 500) / 1.0;
        LocalDate date = LocalDate.now();

        PaymentMethod pm = new PaymentMethod(methodName, toggleSwitch, transactionLimit, feesLimit, date);
        paymentMethodList.add(pm);

        notifiesstackeholdersL.setText("Notifies stakeholders: Added " + methodName + " (" + toggleSwitch + ")");

        // Reset selections
        methodNameCB.getSelectionModel().clearSelection();
        toggloeSwitchOnCheckBOx.setSelected(false);
        toggleSWitchOfCheckBox.setSelected(false);
    }

    @FXML
    private void backToDashboardOA() {
        // This could be navigation logic — placeholder for now
        System.out.println("Navigating back to dashboard...");
    }

    private void showAlert(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}
