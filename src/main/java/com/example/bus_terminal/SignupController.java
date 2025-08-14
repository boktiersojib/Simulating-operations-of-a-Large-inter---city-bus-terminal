package com.example.bus_terminal;

import com.example.bus_terminal.PaymentSystemAdministrator.PaymentSystemAdministrator;
import com.example.bus_terminal.TicketOfficer.TicketOfficer;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.event.ActionEvent;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.time.LocalDate;

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
    private ComboBox<String> selectAccountTypeCB;
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
        selectAccountTypeCB.getItems().addAll("Passenger", "Bus Driver", "Ticket Officer", "Terminal Manager", "Payment System Administrator",
                "Customer Support Agent"
        );
    }

    @javafx.fxml.FXML
    public void signuUpBOA(ActionEvent actionEvent) {
<<<<<<< HEAD
        String name, email, phoneNo, gender = "", password, address;
        LocalDate dob;

        boolean flag = true;

        name = nameTF.getText();
        email = emailTF.getText();
        phoneNo = phoneNoTF.getText();
        address = addressTA.getText();
        password = passwordF.getText();
        dob = dobDP.getValue();


        if (maleRB.isSelected()) {
            gender = "Male";
        }

        else if (femaleRB.isSelected()) {
             gender= "Female";
        }
        else if (othersRB.isSelected()) {
            gender = "Others";
        }
        PaymentSystemAdministrator PaymentSystemAdministrator = new PaymentSystemAdministrator();

        String accountType = selectAccountTypeCB.getValue();

        if (name.isEmpty() || email.isEmpty() || phoneNo.isEmpty() || gender.isEmpty() || accountType == null) {
            outputTA.setText("Please fill in all required fields.");
            return;
        }

        


        outputTA.clear();
        outputTA.setText(
                "Name: " + name + "\n" + "Phone: " + phoneNo + "\n" + "DOB: " + dob + "\n" + "Gender: " + gender + "\n" +
                        "Address: " + address + "\n" +
                        "Account Type: " + accountType + "\n" +
                        "Password: " + password
        );









=======
>>>>>>> c48b60e14a933d9fdf034bb3fd71905559d06516



    }
}