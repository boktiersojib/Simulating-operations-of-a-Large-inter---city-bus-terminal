package com.example.bus_terminal;

import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;

import java.awt.*;
import java.awt.event.ActionEvent;

public class SignupController
{
    @javafx.fxml.FXML
    private TextArea outputTA;
    @javafx.fxml.FXML
    private TextArea addressTA;
    @javafx.fxml.FXML
    private RadioButton othersRB;
    @javafx.fxml.FXML
    private TextField nameTF;
    @javafx.fxml.FXML
    private ComboBox selectAccountTypeCB;
    @javafx.fxml.FXML
    private TextField emailTF;
    @javafx.fxml.FXML
    private RadioButton maleRB;
    @javafx.fxml.FXML
    private TextField phoneNoTF;
    @javafx.fxml.FXML
    private DatePicker dobDP;
    @javafx.fxml.FXML
    private PasswordField passwordF;
    @javafx.fxml.FXML
    private RadioButton femaleRB;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void signuUpBOA(ActionEvent actionEvent) {
    }
}