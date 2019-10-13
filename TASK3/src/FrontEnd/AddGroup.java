package FrontEnd;

import BackEnd.Group;
import BackEnd.Student;
import BackEnd.Subject;
import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

public class AddGroup {

    @FXML
    private Button addStudentButton;
    @FXML
    private TableView<Subject> subjectTable;
    @FXML
    private TableView<Student> studentTable;
    @FXML
    private Button deleteStudentButton;
    @FXML
    private TableColumn<Integer, Subject> creditsColumn;
    @FXML
    private TableColumn<String, Student> studentSurnameColumn;
    @FXML
    private Button addSubjectButton;
    @FXML
    private Button cancelButton;
    @FXML
    private TextField studentSurnameInput;
    @FXML
    private TextField subjectCreditsInput;
    @FXML
    private TextField studentNameInput;
    @FXML
    private TextField groupTextField;
    @FXML
    private TextField semester;
    @FXML
    private TableColumn<String, Student> studentNameColumn;
    @FXML
    private TableColumn<String, Subject> subjectsColumn;
    @FXML
    private Button addGroup;
    @FXML
    private TextField subjectNameInput;
    @FXML
    private Button deleteSubjectButton;

    @FXML
    void deleteStudentAction(ActionEvent event) {
        try {
            ObservableList<Student> studentSelected, allStudents;
            allStudents = studentTable.getItems();
            studentSelected = studentTable.getSelectionModel().getSelectedItems();

            studentSelected.forEach(allStudents::remove);
        } catch (Exception e){
            System.out.println("Your list is now empty");
            studentTable.setPlaceholder(new Label("Your student list is now empty"));
        }
    }

    /*@FXML
    void addStudentAction(ActionEvent event) {
        //addStudentButton.setOnAction(e -> addStudentButtonClicked());
        Student student = new Student();
        student.setStudentName(studentNameInput.getText());
        student.setStudentSurname(studentSurnameInput.getText());
        studentTable.getItems().add(student);
        studentNameInput.clear();
        studentSurnameInput.clear();

        //THIS PROVES THAT VALUES ARE ON THE OBJECT, BUT I CANNOT SEE THEM IN A TABLE
        System.out.println(student.getStudentName());
        System.out.println(student.getStudentSurname());
    }*/
    @FXML
    void addStudentAction(ActionEvent event) {
        addStudentButton.setOnAction(e -> initialize());
    }

        @FXML
    public void initialize(){
        //addStudentButton.setOnAction(e -> addStudentButtonClicked());
        Student student = new Student();
        student.setStudentName(studentNameInput.getText());
        student.setStudentSurname(studentSurnameInput.getText());
        studentTable.getItems().add(student);
        studentNameInput.clear();
        studentSurnameInput.clear();

        //THIS PROVES THAT VALUES ARE ON THE OBJECT, BUT I CANNOT SEE THEM IN A TABLE
        System.out.println(student.getStudentName());
        System.out.println(student.getStudentSurname());

    }

    @FXML
    void deleteSubjectAction(ActionEvent event) {
        try {
            ObservableList<Subject> subjectSelected, allSubjects;
            allSubjects = subjectTable.getItems();
            subjectSelected = subjectTable.getSelectionModel().getSelectedItems();

            subjectSelected.forEach(allSubjects::remove);
        } catch (Exception e){
            System.out.println("Your subject list is now empty");
            subjectTable.setPlaceholder(new Label("Your subject list is now empty"));
        }
    }

    @FXML
    void addSubjectAction(ActionEvent event) {
        Subject subject = new Subject();
        subject.setSubjectName(subjectNameInput.getText());
        subject.setSubjectCredits(Integer.parseInt(subjectCreditsInput.getText()));
        subjectTable.getItems().add(subject);
        subjectNameInput.clear();
        subjectCreditsInput.clear();

        //THIS PROVES THAT VALUES ARE ON THE OBJECT, BUT I CANNOT SEE THEM IN A TABLE
        System.out.println(subject.getSubjectName());
        System.out.println(subject.getSubjectCredits());
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
        Group group = new Group();
        group.setGroupName(groupTextField.getText());
        System.out.println(group.getGroupName());
        group.setSemester(Integer.parseInt(semester.getText()));
        System.out.println(group.getSemester());
    }

}