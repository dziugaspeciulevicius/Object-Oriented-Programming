package FrontEnd;

import BackEnd.Student;
import BackEnd.Subject;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class SeeGrades {

    @FXML
    private ChoiceBox<Group> groupDropDown;
    @FXML
    private ChoiceBox<Group> semesterDropDown;
    @FXML
    private TableView<Student> studentTableView;
    @FXML
    private TableColumn<String, Student> studentNameColumn;
    @FXML
    private TableColumn<String, Student> studentSurnameColumn;
    @FXML
    private TableView<Subject> subjectTableView;
    @FXML
    private TableColumn<String, Subject> subjectsColumn;
    @FXML
    private TableColumn<Integer, Subject> creditsColumn;
    @FXML
    private Label studentGradesOutput;
    @FXML
    private ChoiceBox<Subject> gradeSelect;
    @FXML
    private Button deleteGradeButton;
    @FXML
    private TextField gradeInput;
    @FXML
    private Button addGradeButton;
    @FXML
    private Label studentAverageOutput;
    @FXML
    private Label groupAverageOutput;
    @FXML
    private ListView<Group> top3List;
    @FXML
    private Button exitButton;

    @FXML
    public void initialize(){

    }

    

    @FXML
    void addGradeAction(ActionEvent event) {

    }

    @FXML
    void deleteGradeAction(ActionEvent event) {

    }

    @FXML
    void exitButtonAction(ActionEvent event) {
        Stage stage = (Stage) exitButton.getScene().getWindow();
        stage.close();
    }

}
