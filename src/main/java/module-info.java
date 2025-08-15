module com.example.bus_terminal {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.bus_terminal.Passenger to javafx.fxml, javafx.base;
    opens com.example.bus_terminal.BusDriver to javafx.fxml,  javafx.base;
    opens com.example.bus_terminal.TicketOfficer to javafx.fxml,  javafx.base;
    opens com.example.bus_terminal.TerminalManager to javafx.fxml,  javafx.base;
    opens com.example.bus_terminal.PaymentSystemAdministrator to javafx.fxml,  javafx.base;
    opens com.example.bus_terminal.CustomerSupportAgent to javafx.fxml,  javafx.base;
    opens com.example.bus_terminal.model to javafx.fxml, javafx.base;
    exports com.example.bus_terminal;
    opens com.example.bus_terminal to javafx.base, javafx.fxml;
}