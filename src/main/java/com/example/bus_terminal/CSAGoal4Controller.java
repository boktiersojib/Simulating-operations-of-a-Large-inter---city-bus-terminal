package com.example.bus_terminal;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.IOException;

public class CSAGoal4Controller
{
    @javafx.fxml.FXML
    private TableColumn passengerTC;
    @javafx.fxml.FXML
    private TextField errorDetailsTF;
    @javafx.fxml.FXML
    private TableColumn statusTC;
    @javafx.fxml.FXML
    private TableColumn idTC;
    @javafx.fxml.FXML
    private Label supportAppIssueL;
    @javafx.fxml.FXML
    private TableView issueTV;
    @javafx.fxml.FXML
    private TableColumn issueTC;

    @javafx.fxml.FXML
    public void initialize() {


        idTC.setCellValueFactory(new PropertyValueFactory<>("id"));
        passengerTC.setCellValueFactory(new PropertyValueFactory<>("passenger"));
        issueTC.setCellValueFactory(new PropertyValueFactory<>("issue"));
        statusTC.setCellValueFactory(new PropertyValueFactory<>("status"));

    }

    @javafx.fxml.FXML
    public void collectErrorDetailsOA(ActionEvent actionEvent) {

        String details = errorDetailsTF.getText();
        if (!details.isEmpty()) {
            System.out.println("Collected error details: " + details);
            errorDetailsTF.clear();
        } else {
            System.out.println("No error details entered.");
        }
    }



    @javafx.fxml.FXML
    public void updatePassengerOA(ActionEvent actionEvent) {


    }

    @javafx.fxml.FXML
    public void backToDashboardOA(ActionEvent actionEvent)throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("login.fxml"));
        Scene scene = new Scene(fxmlLoader.load());

        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }
}