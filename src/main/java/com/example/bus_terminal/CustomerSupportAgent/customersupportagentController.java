package com.example.bus_terminal.CustomerSupportAgent;

import javafx.event.ActionEvent;
import javafx.scene.layout.BorderPane;

import java.awt.*;

public class customersupportagentController
{
    @javafx.fxml.FXML
    private BorderPane customerSupportAgentBP;
    @javafx.fxml.FXML
    private TextArea infoTA;

    @javafx.fxml.FXML
    public void initialize() {
            infoTA.setText(
                    "Welcome to the Customer Support Agent Dashboard!\n\n" +
                            "Available Operations:\n" +
                            "• Handle Queries\n" +
                            "• Handle Ticket Issues\n" +
                            "• Live Chat\n" +
                            "• Support Website Issues\n" +
                            "• Refund Assistance\n" +
                            "• Passenger Complaint Logging\n" +
                            "• Schedule and Route Enquiries\n\n" +
                            "Select an action from the menu or use the buttons to begin."
            );


    }

    @Deprecated
    public void assistRefundRequestOA(ActionEvent actionEvent) {
    }

    @Deprecated
    public void logPassengerComplaintOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void signOutOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void supportWebsiteIssuesOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void followupAndFeedbackOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleQueriesOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleTicketIssuesOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void liveChatOA(ActionEvent actionEvent) {
    }

    @Deprecated
    public void provideScheduleInfoOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void refundAssistancePanalOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void passengerComplainLogtOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void scheduleRoutEnquiryPanelOA(ActionEvent actionEvent) {
    }
}