package sample;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class AddGroupController {

    @FXML
    private TextField groupNameInput;
    @FXML
    private TextField semesterInput;
    @FXML
    private TextField subjectName1;
    @FXML
    private TextField subjectName2;
    @FXML
    private TextField subjectName3;
    @FXML
    private TextField subjectName4;
    @FXML
    private TextField subjectName5;
    @FXML
    private TextField subjectName6;
    @FXML
    private TextField subjectCredits1;
    @FXML
    private TextField subjectCredits2;
    @FXML
    private TextField subjectCredits3;
    @FXML
    private TextField subjectCredits4;
    @FXML
    private TextField subjectCredits5;
    @FXML
    private TextField subjectCredits6;
    @FXML
    private Button addGroupButton;
    @FXML
    private Button closeButton;
    @FXML
    private ResourceBundle resources;
    @FXML
    private URL location;

    @FXML
    void closeButtonAction(ActionEvent event) {
        Stage stage = (Stage) closeButton.getScene().getWindow();
        stage.close();
    }

    @FXML
    void addGroupAction(ActionEvent event) {

    }

}
