package FrontEnd;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class AddGroup {

    @FXML
    private Button addStudentButton;
    @FXML
    private Button deleteStudentButton;
    @FXML
    private TableColumn<?, ?> creditsColumn;
    @FXML
    private TableColumn<?, ?> studentSurnameColumn;
    @FXML
    private Button addSubjectButton;
    @FXML
    private Button cancelButton;
    @FXML
    private TextField studentSurname;
    @FXML
    private TextField subjectCredits;
    @FXML
    private TextField studentName;
    @FXML
    private TextField groupTextField;
    @FXML
    private TextField semester;
    @FXML
    private TableColumn<?, ?> studentNameColumn;
    @FXML
    private TableColumn<?, ?> subjectsColumn;
    @FXML
    private Button addGroup;
    @FXML
    private TextField subjectName;
    @FXML
    private Button deleteSubjectButton;

    @FXML
    void deleteStudentAction(ActionEvent event) {

    }

    @FXML
    void addStudentAction(ActionEvent event) {

    }

    @FXML
    void deleteSubjectAction(ActionEvent event) {

    }

    @FXML
    void addSubjectAction(ActionEvent event) {

    }

    @FXML
    void addSemester(ActionEvent event) {

    }

    @FXML
    void cancelButtonAction(ActionEvent event) {
        Stage stage = (Stage) cancelButton.getScene().getWindow();
        stage.close();
    }

    @FXML
    void addGroupAction(ActionEvent event) {

    }

}