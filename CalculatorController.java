package com.example.javafx_assignment;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.InputMismatchException;

public class CalculatorController {
    @FXML
    private TextField textInput1, textInput2;
    @FXML
    private Label lblname;

    int num1 = 0,num2 = 0;

    private void StringToInt(){
        lblname.setText("");
        String s1=textInput1.getText();
        String s2=textInput2.getText();
        try{
            num1=Integer.parseInt(s1);
            num2=Integer.parseInt(s2);
        }catch(NumberFormatException |InputMismatchException ex){
            lblname.setText("Error: must enter the integer number");
        }finally {
            textInput1.setText("");
            textInput2.setText("");
        }
    }

    @FXML
    private void calculateAddition(){
        StringToInt();
        if(!lblname.getText().equals("")){
            return;
        }
        int sum = num1 + num2;
        lblname.setText(num1 + " + "+ num2+ " = " + sum);
    }

    @FXML
    private void calculateSubtraction(){
        StringToInt();
        if(!lblname.getText().equals("")){
            return;
        }
        int sub = num1 - num2;
        lblname.setText(num1 + " - "+ num2+ " = " + sub);
    }

    @FXML
    private void calculateMultiplication(){
        StringToInt();
        if(!lblname.getText().equals("")){
            return;
        }
        int mul = num1 * num2;
        lblname.setText(num1 + " * "+ num2+ " = " + mul);
    }

    @FXML
    private void calculateDivision(){
        StringToInt();
        if(!lblname.getText().equals("")){
            return;
        }
        try{
            int div = num1 / num2;
            lblname.setText(num1 + " / "+ num2+ " = " + div);
        }catch(ArithmeticException ex){
            lblname.setText("Error: division by zero");
        }
    }
}
