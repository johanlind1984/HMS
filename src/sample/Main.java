package sample;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("HospitalAPP.fxml"));
        primaryStage.setTitle("HMS");
        primaryStage.setScene(new Scene(root, 1280, 768));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }


}

