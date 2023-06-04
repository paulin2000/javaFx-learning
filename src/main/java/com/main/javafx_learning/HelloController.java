package com.main.javafx_learning;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;

public class HelloController {

    @FXML
    private ImageView image;

    @FXML
    private AnchorPane img;

    @FXML
    private TextField inputfield;

    @FXML
    private Text textfield;

    @FXML
    private ToggleGroup Animals;

    @FXML
    private Text radiovalue;

    @FXML
    private RadioButton cat;

    @FXML
    private RadioButton dog;

    @FXML
    private Slider sliderHorizontal;

    @FXML
    private Text slidervalue;

    @FXML
    void printHelloWord(MouseEvent event) {

    }

    @FXML
    void showImage(MouseEvent event) {
        image.setVisible(true);
    }

    @FXML
    void nameChanged(MouseEvent event) {
        textfield.setText(inputfield.getText());
    }

    @FXML
    void getRadioValue(MouseEvent event) {
        if (Animals.getSelectedToggle().equals(cat)){
            radiovalue.setText("Cat");
        }else {
            radiovalue.setText("Dog");
        }
//      radiovalue.setText(  Animals.getSelectedToggle());
    }

    @FXML
    void updateText(MouseEvent event) {
        slidervalue.setText(String.valueOf(sliderHorizontal.getValue()));
    }
}