package com.example;

import javafx.application.Application;
import javafx.scene.Cursor;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application{
    public static void main(String[] args) {
        Application.launch(args);

    }

    @Override
    public void start(Stage stage) throws Exception {

            
            Group group = new Group(groupall);
            Text text = new Text(10,50,"Core2Web");
            text.setFont(new Font(40));
            Text 1 = new Text("Avhoot");
            Group groupall;
            groupall.getChildren().addAll(text,1);

            Scene scene = new Scene(group,50,50);
            scene.setFill(Color.AQUAMARINE);
            scene.setCursor(Cursor.HAND);
           
            
            //stage
            stage.setTitle("Stage practical");
            stage.getIcons().add(new Image("file:/D:/Superx2/demo/src/main/resources/images/images.jpeg"));
            stage.setResizable(false);
            stage.setX(100);
            stage.setY(10);
            stage.setWidth(1000);
            stage.setHeight(1000);
            stage.setScene(scene);
            stage.show();
    }
}