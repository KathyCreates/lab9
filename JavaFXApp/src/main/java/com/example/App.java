package com.example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class App extends Application {
    public static void main( String[] args ) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        TextField textField = new TextField();
        textField.setPromptText("Enter the text here");

        Button displayButton = new Button("Display");
        displayButton.setOnAction(e -> {
            String inputText = textField.getText();
            System.out.println("Entered text: " + inputText);
        });

        VBox root = new VBox(10, textField, displayButton);
        root.setStyle("-fx-padding: 20; -fx-alignment: center;");

        Scene scene = new Scene(root, 300, 200);

        primaryStage.setTitle("JavaFX TextField Demo");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
