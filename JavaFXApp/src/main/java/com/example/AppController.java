package com.example;

import javafx.fxml.FXML;
import com.jfoenix.controls.JFXButton;

public class AppController {
    @FXML
    private JFXButton Button;

    @FXML
    private void handleButtonClick() {
        System.out.println("Button clicked");
    }
}
