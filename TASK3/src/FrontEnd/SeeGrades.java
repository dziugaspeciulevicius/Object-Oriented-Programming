package FrontEnd;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class SeeGrades {

    @FXML
    private TextField studentAverageOutput;
    @FXML
    private TableColumn<?, ?> creditsColumn;
    @FXML
    private ChoiceBox<?> semesterDropDown;
    @FXML
    private TableColumn<?, ?> studentSurnameColumn;
    @FXML
    private TextField newGradeInput;
    @FXML
    private Button deleteGradeButton;
    @FXML
    private TextField groupAverageOutput;
    @FXML
    private ListView<?> top3List;
    @FXML
    private Button addGradeButton;
    @FXML
    private ChoiceBox<?> groupDropDown;
    @FXML
    private ListView<?> studentGradesOutput;
    @FXML
    private TableColumn<?, ?> studentNameColumn;
    @FXML
    private TableColumn<?, ?> subjectsColumn;
    @FXML
    private Button exitButton;

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
