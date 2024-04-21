package org.example.java_game;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 710, 400);
        stage.initStyle(StageStyle.UNDECORATED);
        stage.setScene(scene);
        stage.show();

        scene.setOnKeyPressed(e -> {
            if(e.getCode() == KeyCode.SPACE && !GameController.jump) {
                GameController.jump = true;
            }
            if(e.getCode() == KeyCode.A)
                GameController.left = true;
            if(e.getCode() == KeyCode.D)
                GameController.right = true;
        });

        scene.setOnKeyReleased(e -> {
            if(e.getCode() == KeyCode.A)
                GameController.left = false;
            if(e.getCode() == KeyCode.D)
                GameController.right = false;
            if(e.getCode() == KeyCode.ESCAPE)
                GameController.isPause = !GameController.isPause;
        });
    }

    public static void main(String[] args) {
        launch();
    }
}