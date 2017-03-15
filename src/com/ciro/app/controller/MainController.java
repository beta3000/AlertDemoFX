package com.ciro.app.controller;

import com.ciro.app.Main;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextInputDialog;

import java.util.Optional;

public class MainController {

    private Main main;

    public void setMain(Main main) {
        this.main = main;
    }

    public void showAlert1(){
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Information");
        alert.setHeaderText("Information header text");
        alert.setContentText("This is the information text that is displayed to the user");
        alert.showAndWait();
    }
    public void showAlert2(){
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Error");
        alert.setHeaderText("Error header");
        alert.setContentText("This is a very fatal error!!");
        alert.showAndWait();
    }
    public void showAlert3(){
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle("Warning");
        alert.setHeaderText("Warning header");
        alert.setContentText("Warning Content");
        alert.showAndWait();
    }
    public void showAlert4(){
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Confirmation");
        alert.setHeaderText("Confirmation header");
        alert.setContentText("I confirm this notice");
        Optional<ButtonType> result = alert.showAndWait();
        if(result.get() == ButtonType.OK){
            System.out.println("OK Clicked");
        }else {
            System.out.println("Cancel Clicked");
        }
    }

    public void showAlert5(){
        TextInputDialog textInputDialog = new TextInputDialog();
        textInputDialog.setTitle("Input");
        textInputDialog.setContentText("Please enter your age: ");
        Optional<String> result = textInputDialog.showAndWait();
        if(result.isPresent()){
            System.out.println("Age: "+result.get());
        }else {
            System.out.println("No input");
        }
    }

}
