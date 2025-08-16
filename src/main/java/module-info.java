module com.example.bus_terminal {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;



    opens com.example.bus_terminal.model to javafx.fxml, javafx.base;
    exports com.example.bus_terminal;
    opens com.example.bus_terminal to javafx.base, javafx.fxml;


    opens data to javafx.base, javafx.fxml;

}