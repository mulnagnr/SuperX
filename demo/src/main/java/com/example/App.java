package com.example;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class App extends Application{
    public static void main(String[] args) {
        Application.launch(args);

    }

    @Override
    public void start(Stage stage) throws Exception{
        Label label = new Label("Hello World");
       // label.setFont(Font.font("ROBOTO", FontWeight.BOLD,30));
        //label.setRotate(90);
        
        //label.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        //label.setGraphic(label);
        //label.setGraphicTextGap(50);
        
        Group root = new Group();
        root.getChildren().add(label);
        Scene scene = new Scene(root,500,300);
        stage.setScene(scene);
        stage.setTitle("This is First Stage");
        //stage.setResizable(true);
        // stage.setHeight(800);
        // stage.setWidth(800);
       // stage.setFullScreen(true);
        stage.show();
        
    }
}