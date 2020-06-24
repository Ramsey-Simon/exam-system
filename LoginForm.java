/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onlineexamsystem;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author Hassan
 */
public class LoginForm extends Application {
    
     @Override
    public void start(Stage primaryStage) {
        Text text1 = new Text ("Student ID.NO: ");
        Text text2 = new Text ("Password: ");
        TextField textField1 = new TextField();
        ComboBox comboBox1 = new ComboBox();
        TextField textField2 = new TextField();
        ComboBox comboBox2 = new ComboBox();
        
        
        Button button3 = new Button ("LOGIN");
        
        GridPane gridPane = new GridPane ();
        gridPane.setMinSize (600,400);
        gridPane.setPadding (new Insets (10, 10, 10, 10));
        gridPane.setVgap(10);
        gridPane.setHgap(10);
        gridPane.setAlignment (Pos.CENTER);
        
        gridPane.add(text1, 0, 0);
        gridPane.add(textField1, 1, 0);
        gridPane.add(comboBox1, 1, 1);
        gridPane.add(text2, 0, 1);
        gridPane.add(textField2, 1, 1);
        gridPane.add(button3, 1, 2);
        
        button3.setStyle("-fx-background-color: darkslateblue; -fx-text-fill: white; -fx-font-size:13pt;");
        
        
        text1.setStyle("-fx-font: normal bold 20px 'serif' ");
        text2.setStyle("-fx-font: normal bold 20px 'serif' ");  
        gridPane.setStyle("-fx-background-color: BEIGE; ");
        
        Scene scene = new Scene(gridPane);
        
        primaryStage.setTitle("Movie Library System");
        primaryStage.setScene(scene);
        primaryStage.show();      
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
