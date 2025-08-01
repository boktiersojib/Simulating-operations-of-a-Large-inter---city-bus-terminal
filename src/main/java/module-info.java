module com.example.bus_terminal {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.bus_terminal to javafx.fxml;
    opens mainpkg.bus_terminal.Passenger to javafx.fxml;
    opens mainpkg.bus_terminal.BusDriver to javafx.fxml;
    opens mainpkg.bus_terminal.TicketOfficer to javafx.fxml;
    opens mainpkg.bus_terminal.TerminalManager to javafx.fxml;
    opens mainpkg.bus_terminal.PaymentSystemAdministrator to javafx.fxml;
    opens mainpkg.bus_terminal.CustomerSupportAgent to javafx.fxml;

    exports com.example.bus_terminal;
}