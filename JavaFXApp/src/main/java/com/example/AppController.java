package com.example;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class AppController {

    @FXML
    private void handleButtonClick() {
        // Виводимо повідомлення після натискання кнопки
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Button Clicked");
        alert.setHeaderText(null);
        alert.setContentText("You clicked the button!");
        alert.showAndWait();
    }
}
