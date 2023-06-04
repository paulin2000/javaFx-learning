package com.main.javafx_learning;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
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
    void printHelloWord(MouseEvent event) {

    }

    @FXML
    void showImage(MouseEvent event) {
        image.setVisible(true);
    }
    @FXML
    private TextField inputfield;

    @FXML
    private Text textfield;

    @FXML
    void nameChanged(MouseEvent event) {
        textfield.setText(inputfield.getText());
    }
}
