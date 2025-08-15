package com.example.bus_terminal;

<<<<<<< HEAD
<<<<<<< HEAD
import javafx.event.ActionEvent;
=======
import com.example.bus_terminal.PaymentSystemAdministrator.PaymentSystemAdministrator;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
=======
import javafx.fxml.FXML;
import javafx.scene.control.*;
>>>>>>> 8048ffea2334e2bcfd339907e208c5b2a3f2abf1

import java.time.LocalDate;

public class SignupController {

    @FXML
    private TextField nameTF;
    @FXML
    private TextField emailTF;
    @FXML
    private TextField phoneNoTF;


    @FXML
    private DatePicker dobDP;

    @FXML
    private TextArea addressTA;
    @FXML
    private TextArea outputTA;


    @FXML
    private RadioButton maleRB;
    @FXML
    private RadioButton femaleRB;
    @FXML
    private RadioButton othersRB;
    @FXML
    private PasswordField passwordF;


    @FXML
    private ComboBox<String> selectAccountTypeCB;


    private ToggleGroup genderGroup;

    @FXML
    public void initialize() {
        selectAccountTypeCB.getItems().addAll("Passenger", "Bus Driver", "Ticket Officer",
                "Terminal Manager", "Payment System Administrator", "Customer Support Agent");

        genderGroup = new ToggleGroup();
        maleRB.setToggleGroup(genderGroup);
        femaleRB.setToggleGroup(genderGroup);
        othersRB.setToggleGroup(genderGroup);
    }

    @FXML
    public void signUpBOA() {
        outputTA.clear();

        String fullName = nameTF.getText().trim();
        String email = emailTF.getText().trim();
        String phone = phoneNoTF.getText().trim();
        LocalDate dob = dobDP.getValue();
        String address = addressTA.getText().trim();
        String password = passwordF.getText();
        String accountType = selectAccountTypeCB.getValue();

        RadioButton selectedGenderRB = (RadioButton) genderGroup.getSelectedToggle();
        String gender = selectedGenderRB != null ? selectedGenderRB.getText() : "";

        if (fullName.isEmpty() || email.isEmpty() || phone.isEmpty() ||
                dob == null || address.isEmpty() || password.isEmpty() ||
                accountType == null || gender.isEmpty()) {
            outputTA.setText("Please fill in all fields and select gender/account type.");
            return;
        }

        if (!email.contains("@") || !email.contains(".")) {
            outputTA.setText("Please enter a valid email.");
            return;
        }

        if (!phone.matches("\\d{10,15}")) {
            outputTA.setText("Please enter a valid phone number (10-15 digits).");
            return;
        }

        StringBuilder sb = new StringBuilder();
        sb.append("Sign Up Successful!\n");
        sb.append("Name: ").append(fullName).append("\n");
        sb.append("Email: ").append(email).append("\n");
        sb.append("Phone: ").append(phone).append("\n");
        sb.append("DOB: ").append(dob).append("\n");
        sb.append("Address: ").append(address).append("\n");
        sb.append("Gender: ").append(gender).append("\n");
        sb.append("Account Type: ").append(accountType).append("\n");

        outputTA.setText(sb.toString());

        clearFields();
    }

    private void clearFields() {
        nameTF.clear();
        emailTF.clear();
        phoneNoTF.clear();
        dobDP.setValue(null);
        addressTA.clear();
        passwordF.clear();
        selectAccountTypeCB.getSelectionModel().clearSelection();
        genderGroup.selectToggle(null);
    }
}
