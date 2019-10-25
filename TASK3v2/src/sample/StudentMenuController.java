package sample;

import java.io.StringReader;
import java.net.URL;
import java.util.ResourceBundle;

import Classes.Grades;
import Classes.Group;
import Classes.Student;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class StudentMenuController {

    @FXML
    private TableView<Student> studentTable;
    @FXML
    private TableColumn<Student, String> nameColumn;
    @FXML
    private TableColumn<Student, String> surnameColumn;
    @FXML
    private Button showStudentInformationButton;
    @FXML
    private TextField studentNameInput;
    @FXML
    private TextField studentSurnameInput;
    @FXML
    private Button addStudentButton;
    @FXML
    private Button deleteStudentButton;
    @FXML
    private Button addStudentGradesButton;
    @FXML
    private Label subjectNameOut1;
    @FXML
    private Label subjectNameOut2;
    @FXML
    private Label subjectNameOut3;
    @FXML
    private Label subjectNameOut4;
    @FXML
    private Label subjectNameOut5;
    @FXML
    private Label subjectNameOut6;
    @FXML
    private Label subjectGradeOut1;
    @FXML
    private Label subjectGradeOut2;
    @FXML
    private Label subjectGradeOut3;
    @FXML
    private Label subjectGradeOut4;
    @FXML
    private Label subjectGradeOut5;
    @FXML
    private Label subjectGradeOut6;
    @FXML
    private Label studentAverageOutput;
    @FXML
    private Label groupAverageOutput;
    @FXML
    private Button closeButton;

    //reference to selected group from main window
    private Group selectedGroup;

    public void initData(Group group) {
        //set selected group reference
        selectedGroup = group;

        //add group info to the table
        //set group average info
        if(selectedGroup.studentList != null) {
            studentTable.setItems(selectedGroup.studentList);
            selectedGroup.groupAverageCalculation();
            groupAverageOutput.setText(String.valueOf(selectedGroup.getGroupAverage()));
        }

        setSubjectLabel(subjectNameOut1, 0);
        setSubjectLabel(subjectNameOut2, 1);
        setSubjectLabel(subjectNameOut3, 2);
        setSubjectLabel(subjectNameOut4, 3);
        setSubjectLabel(subjectNameOut5, 4);
        setSubjectLabel(subjectNameOut6, 5);

        //setGradeLabel(subjectGradeOut1, 0);
        //setGradeLabel(subjectGradeOut2, 1);
        //setGradeLabel(subjectGradeOut3, 2);
        //setGradeLabel(subjectGradeOut4, 3);
        //setGradeLabel(subjectGradeOut5, 4);
        //setGradeLabel(subjectGradeOut6, 5);
    }

    private void setSubjectLabel(Label subjectLabel, int subjectArrNumber){
        subjectLabel.setText(selectedGroup.subjectList.get(subjectArrNumber).getSubjectName());
    }

    private void setGradeLabel(Label gradeLabel, int subjectArrNumber){
        gradeLabel.setText(selectedGroup.subjectList.get(subjectArrNumber).getSubjectName());
    }

    @FXML
    void addStudentAction(ActionEvent event) {
        if (studentNameInput.getText().isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Warning");
            alert.setHeaderText("EMPTY STUDENT NAME FIELD");
            alert.setContentText("CHECK and FILL student name field!");
            alert.showAndWait();
        } if (studentSurnameInput.getText().isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Warning");
            alert.setHeaderText("EMPTY STUDENT SURNAME FIELD");
            alert.setContentText("CHECK and FILL student surname field!");
            alert.showAndWait();
        } else{
            if (selectedGroup.studentList.size() < 30) {
                Student student = new Student();
                student.setStudentName(studentNameInput.getText());
                student.setStudentSurname(studentSurnameInput.getText());


                Grades grades = new Grades();
                //student.gradeList.add(grades);


                studentTable.setItems(selectedGroup.studentList);
                selectedGroup.studentList.add(student);

                nameColumn.setCellValueFactory(new PropertyValueFactory<Student, String>("studentName"));
                surnameColumn.setCellValueFactory(new PropertyValueFactory<Student, String>("studentSurname"));

                studentNameInput.clear();
                studentSurnameInput.clear();

                System.out.println(selectedGroup.studentList);
            } else {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Error");
                alert.setHeaderText("LIST IS FULL");
                alert.setContentText("You can only have maximum of 30 students per group!");
                alert.showAndWait();
            }
        }
    }

    @FXML
    void deleteStudentAction(ActionEvent event) {
        try {
            Student student = studentTable.getSelectionModel().getSelectedItem();
            if (student!=null) {
                selectedGroup.studentList.remove(student);
            } else {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Error");
                alert.setHeaderText("LIST EMPTY");
                alert.setContentText("Your list is empty. There is nothing to remove!");
                alert.showAndWait();
            }
        } catch (Exception e) {
            System.out.println("Error/List is empty");
        }
    }

    @FXML
    void addStudentGradesAction(ActionEvent event) {

    }

    @FXML
    void showStudentInformationAction(ActionEvent event) {

    }

    @FXML
    void closeButtonAction(ActionEvent event) {
        Stage stage = (Stage) closeButton.getScene().getWindow();
        stage.close();
    }
}
