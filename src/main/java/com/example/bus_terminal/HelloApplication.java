package com.example.bus_terminal;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
<<<<<<< HEAD
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("TO_goal1.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Bus Terminal");
        stage.setScene(scene);
        stage.show();
=======

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("login.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
        
>>>>>>> 8048ffea2334e2bcfd339907e208c5b2a3f2abf1
    }

    public static void main(String[] args) {
        launch();
    }
}