package Controllers;

import Classes.*;
import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SecondaryScreen {
    @FXML
    private ObservableList<Group> groupList = FXCollections.observableArrayList();
    @FXML
    private ObservableList<Student> studentList = FXCollections.observableArrayList();
    @FXML
    private TableView<Student> studentTableView;
    @FXML
    private TableColumn<String, Student> studentNameColumn;
    @FXML
    private TableColumn<String, Student> studentSurnameColumn;
    @FXML
    private ObservableList<Subject> subjectList = FXCollections.observableArrayList();
    @FXML
    private TableView<Subject> subjectTableView;
    @FXML
    private TableColumn<String, Subject> subjectsColumn;
    @FXML
    private TableColumn<Integer, Subject> creditsColumn;
    @FXML
    private Button addGroupButton;
    @FXML
    private TextField studentSurnameInput;
    @FXML
    private TextField subjectCreditsInput;
    @FXML
    private TextField studentNameInput;
    @FXML
    private TextField groupField;
    @FXML
    private TextField semester;
    @FXML
    private TextField subjectNameInput;
    @FXML
    private Button addStudentButton;
    @FXML
    private ComboBox<Subject> subjectSelect;
    @FXML
    private Button confirmSelectionButton;
    @FXML
    private ListView<Student> top3List;
    @FXML
    private Label studentGradesOutput;
    @FXML
    private Button deleteSubjectButton;
    @FXML
    private ComboBox<Group> groupSelect;
    @FXML
    private ComboBox<Student> studentSelect;
    @FXML
    private ChoiceBox<Student> gradeSelect;
    @FXML
    private Button deleteStudentButton;
    @FXML
    private Label studentAverageOutput;
    @FXML
    private TextField gradeInput;
    @FXML
    private Button addSubjectButton;
    @FXML
    private Button deleteGradeButton;
    @FXML
    private Label groupAverageOutput;
    @FXML
    private Button exitButton;
    @FXML
    private Button addGradeButton;
    @FXML
    private Button clearFieldsButton;

    @FXML
    void deleteStudentAction(ActionEvent event) {
        try {
            Student student = studentTableView.getSelectionModel().getSelectedItem();
            if (student!=null) {
                studentList.remove(student);
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
    void addStudentAction(ActionEvent event) {
        if (studentList.size() < 30) {
            Student student = new Student();
            student.setStudentName(studentNameInput.getText());
            student.setStudentSurname(studentSurnameInput.getText());


            studentTableView.setItems(studentList);
            studentList.add(student);

            studentNameColumn.setCellValueFactory(new PropertyValueFactory<String, Student>("studentName"));
            studentSurnameColumn.setCellValueFactory(new PropertyValueFactory<String, Student>("studentSurname"));

            studentNameInput.clear();
            studentSurnameInput.clear();
        } else {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText("LIST IS FULL");
            alert.setContentText("You can only have maximum of 30 students per group!");
            alert.showAndWait();
        }
    }

    @FXML
    void deleteSubjectAction(ActionEvent event) {
        try {
            Subject subject = subjectTableView.getSelectionModel().getSelectedItem();
            if (subject!=null) {
                subjectList.remove(subject);
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
    void addSubjectAction(ActionEvent event) {

        if (subjectList.size() < 6) {
            Subject subject = new Subject();
            subject.setSubjectName(subjectNameInput.getText());
            subject.setSubjectCredits(Integer.parseInt(subjectCreditsInput.getText()));

            subjectTableView.setItems(subjectList);
            subjectList.add(subject);

            subjectsColumn.setCellValueFactory(new PropertyValueFactory<String, Subject>("subjectName"));
            creditsColumn.setCellValueFactory(new PropertyValueFactory<Integer, Subject>("subjectCredits"));

            subjectNameInput.clear();
            subjectCreditsInput.clear();
        } else {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText("LIST IS FULL");
            alert.setContentText("You can only have maximum of 6 subjects per group!");
            alert.showAndWait();
        }
    }

    @FXML
    void clearFieldsAction(ActionEvent event) {
        groupField.clear();
        semester.clear();
        studentNameInput.clear();
        studentSurnameInput.clear();
        subjectNameInput.clear();
        subjectCreditsInput.clear();
    }

    @FXML
    void addGroupAction(ActionEvent event) throws FileNotFoundException, IOException {
        if (groupField.getText().isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Warning");
            alert.setHeaderText("EMPTY GROUP FIELD");
            alert.setContentText("CHECK and FILL group field!");
            alert.showAndWait();
        } if (semester.getText().isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Warning");
            alert.setHeaderText("EMPTY SEMESTER FIELD");
            alert.setContentText("CHECK and FILL semester field!");
            alert.showAndWait();
        } if (studentList.size() <= 0) {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Warning");
            alert.setHeaderText("EMPTY STUDENT LIST");
            alert.setContentText("CHECK and FILL student list!");
            alert.showAndWait();
        } if (subjectList.size() <= 0) {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Warning");
            alert.setHeaderText("EMPTY SUBJECT LIST");
            alert.setContentText("CHECK and FILL subject list!");
            alert.showAndWait();
        } else {

            Group group = new Group();

            group.setGroupName(groupField.getText());
            group.setSemester(Integer.parseInt(semester.getText()));
            group.setSubjectList(subjectList);
            group.setStudentList(studentList);

            groupList.addAll(group);
            groupSelect.setItems(groupList);

            groupField.clear();
            semester.clear();
            studentList.clear();
            subjectList.clear();

            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("GROUP HAS BEEN ADDED");
            alert.setHeaderText(null);
            alert.setContentText("New group has been successfully added!");
            alert.showAndWait();
        }
    }

    @FXML
    void groupSelectAction(ActionEvent event) {
        System.out.println(subjectList);
    }

    @FXML
    void studentSelectAction(ActionEvent event) {

    }

    @FXML
    void subjectSelectAction(ActionEvent event) {

    }

    @FXML
    void confirmSelectionAction(ActionEvent event) {

    }

    @FXML
    void deleteGradeAction(ActionEvent event) {

    }

    @FXML
    void addGradeAction(ActionEvent event) {

    }

    @FXML
    void exitButtonAction(ActionEvent event) {
        Stage stage = (Stage) exitButton.getScene().getWindow();
        stage.close();
    }
}
