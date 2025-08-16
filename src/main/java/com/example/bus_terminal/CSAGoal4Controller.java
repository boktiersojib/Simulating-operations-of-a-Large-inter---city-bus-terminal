package com.example.bus_terminal;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

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
        FXMLLoader fxmlLoader= new FXMLLoader(getClass().getResource("TO_goal5.fxml"));
        Scene scene= new Scene(fxmlLoader.load());
        Stage stage= new Stage();
        stage.setScene(scene);
        stage.show();
    }

    public void collectErrorDetailsOA(javafx.event.ActionEvent actionEvent) {

    }

    public void updatePassengerOA(javafx.event.ActionEvent actionEvent) {

    }

    public void backToDashboardOA(javafx.event.ActionEvent actionEvent) {

    }
}