package com.main.javafx_learning;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {

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
    private Button addButton;

    @FXML
    private ListView<String> listOfNames;

    @FXML
    private TextField nameField;

    @FXML
    private Button removeButton;

    @FXML
    private Text spinnerText;

    @FXML
    private Spinner<Integer> numberSpinner;

    SpinnerValueFactory<Integer> svf = new SpinnerValueFactory.IntegerSpinnerValueFactory(1,10,1);

    @FXML
    private Button spinnerButton;


    @FXML
    void getNumber(MouseEvent event) {
       int number =  numberSpinner.getValue();
       spinnerText.setText(String.valueOf(number));
    }
    @FXML
    void addName(MouseEvent event) {
        listOfNames.getItems().add(nameField.getText());
    }
    @FXML
    void removeName(MouseEvent event) {
        int selectedID = listOfNames.getSelectionModel().getSelectedIndex();
        listOfNames.getItems().remove(selectedID);

    }
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

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        numberSpinner.setValueFactory(svf);
    }
}