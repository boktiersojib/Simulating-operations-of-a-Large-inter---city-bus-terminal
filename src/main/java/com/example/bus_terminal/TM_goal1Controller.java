package com.example.bus_terminal;

import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;

public class TM_goal1Controller
{
    @javafx.fxml.FXML
    private TableColumn departureTimeCol;
    @javafx.fxml.FXML
    private TextArea showUpdatesTA;
    @javafx.fxml.FXML
    private TableColumn arrivalTimeCol;
    @javafx.fxml.FXML
    private TableColumn routeCol;
    @javafx.fxml.FXML
    private TableView pendingSchedulesTV;
    @javafx.fxml.FXML
    private TextArea conflictsCheckTA;
    @javafx.fxml.FXML
    private TableColumn scheduleIDCol;
    @javafx.fxml.FXML
    private TableColumn requestStatusCol;
    @javafx.fxml.FXML
    private TableColumn busTypeCol;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void editOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void approveOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void rejectOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void backToDashboardOA(ActionEvent actionEvent) {
    }
}