package com.example.helloworld;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.shape.*;
public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("This is my first  JavaFX Application!");
    }
}