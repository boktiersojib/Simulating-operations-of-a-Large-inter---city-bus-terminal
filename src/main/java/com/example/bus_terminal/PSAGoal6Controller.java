package com.example.bus_terminal;

import com.example.bus_terminal.model.PaymentMethod;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.awt.*;
import java.time.LocalDate;

import

public class PSAGoal6Controller
{
    @FXML
    private Label notifiesStackeholdersL;
    @FXML
    private TableColumn dateTC;
    @FXML
    private CheckBox toggleSWitchOfCheckBox;
    @FXML
    private TableColumn transactionLimitTC;
    @FXML
    private TableColumn toggleSwitchTC;
    @FXML
    private TableColumn feesLimitTC;
    @FXML
    private CheckBox toggloeSwitchOnCheckBOx;
    @FXML
    private ComboBox methodNameCB;
    @FXML
    private TableColumn methodNameTC;
    @FXML
    private TableView paymentMethodTV;

    @FXML
    public void initialize() {
        methodNameCB.getItems().addAll(
                "Bkash", "Rocket", "Nagad", "Upay", "Credit card", "Google pay");

        methodNameTC.setCellValueFactory(cell -> new SimpleStringProperty(cell.getClass().getMethodName()));
        toggleSwitchTC.setCellValueFactory(cell -> new SimpleStringProperty(cell.getClass().getToggleSwitch()));
        transactionLimitTC.setCellValueFactory(cell -> new SimpleObjectProperty<>(cell.getValue().getTransactionLimit()));
        feesLimitTC.setCellValueFactory(cell -> new SimpleObjectProperty<>(cell.getValue().getFeesLimit()));
        dateTC.setCellValueFactory(cell -> new SimpleObjectProperty<>(cell.getValue().getDate()));


        ObservableList paymentMethods = null;
        paymentMethods.addAll(
                new PaymentMethod("Bkash", "ON", 1000, 1.5, LocalDate.now()),
                new PaymentMethod("Credit card", "OFF", 5000, 2.0, LocalDate.now().minusDays(1))
        );

        paymentMethodTV.setItems(paymentMethods);




    }

    @Deprecated
    public void approveOA(ActionEvent actionEvent) {
        System.out.println("Approved");
    }

    @Deprecated
    public void rejectOA(ActionEvent actionEvent) {
        System.out.println("Rejected");
    }

    @Deprecated
    public void searchOA(ActionEvent actionEvent) {
        System.out.println("Search action");
    }

    @FXML
    public void saveOA(ActionEvent actionEvent) {

        String method = methodNameCB.getValue();
        String toggle = toggloeSwitchOnCheckBOx.isSelected() ? "ON" : "OFF";
        double transactionLimit = 2000; // Example value
        double feesLimit = 1.8;         // Example value
        LocalDate date = LocalDate.now();

        if (method != null) {
            PaymentMethod paymentMethods = null;
            paymentMethods.add(new PaymentMethod(method, toggle, transactionLimit, feesLimit, date));
        }

    }

    @FXML
    public void backToDashboardOA(ActionEvent actionEvent) {
    }
}