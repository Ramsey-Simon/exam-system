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
public class RegisterForm extends Application {
    
     @Override
    public void start(Stage primaryStage) {
        Text text1 = new Text ("FirstName: ");
        Text text2 = new Text ("LastName: ");
        Text text3 = new Text ("Student ID.NO: ");
        Text text4 = new Text ("EmailAddress: ");
        Text text5 = new Text ("PhoneNumber: ");
        Text text6 = new Text ("Password: ");
        Text text7 = new Text ("Gender: ");
        TextField textField1 = new TextField();
        ComboBox comboBox1 = new ComboBox();
        TextField textField2 = new TextField();
        ComboBox comboBox2 = new ComboBox();
        TextField textField3 = new TextField();
        ComboBox comboBox3 = new ComboBox();
        TextField textField4 = new TextField();
        ComboBox comboBox4 = new ComboBox();
        TextField textField5 = new TextField();
        ComboBox comboBox5 = new ComboBox();
        TextField textField6 = new TextField();
        ComboBox comboBox6 = new ComboBox();
        TextField textField7 = new TextField();
        ComboBox comboBox7 = new ComboBox();
        
        Button button8 = new Button ("REGISTER");
       
        
        GridPane gridPane = new GridPane ();
        gridPane.setMinSize (600,400);
        gridPane.setPadding (new Insets (10, 10, 10, 10));
        gridPane.setVgap(10);
        gridPane.setHgap(10);
        gridPane.setAlignment (Pos.CENTER);
        
        gridPane.add(text1, 0, 0);
        gridPane.add(textField1, 1, 0);
        gridPane.add(text2, 0, 1);
        gridPane.add(textField2, 1, 1);
        gridPane.add(text3, 0, 3);
        gridPane.add(textField3, 1, 3);
        gridPane.add(text4, 0, 4);
        gridPane.add(textField4, 1, 4);
        gridPane.add(text5, 0, 5);
        gridPane.add(textField5, 1, 5);
        gridPane.add(comboBox5, 1, 5);
        gridPane.add(text6, 0, 6);
        gridPane.add(textField6, 1, 6);
        gridPane.add(text7, 0, 7);
        gridPane.add(textField7, 1, 7);
        gridPane.add(comboBox7, 1, 7);
        
        gridPane.add(button8, 2, 8);
        
        
        button8.setStyle("-fx-background-color: darkslateblue; -fx-text-fill: white; -fx-font-size:13pt;");
        
        
        text1.setStyle("-fx-font: normal bold 20px 'serif' ");
        text2.setStyle("-fx-font: normal bold 20px 'serif' ");
        text3.setStyle("-fx-font: normal bold 20px 'serif' ");  
        text4.setStyle("-fx-font: normal bold 20px 'serif' ");
        text5.setStyle("-fx-font: normal bold 20px 'serif' ");
        text6.setStyle("-fx-font: normal bold 20px 'serif' ");
        text7.setStyle("-fx-font: normal bold 20px 'serif' ");
        gridPane.setStyle("-fx-background-color: BEIGE; ");
        
        Scene scene = new Scene(gridPane);
        
        primaryStage.setTitle("Online Exam System");
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