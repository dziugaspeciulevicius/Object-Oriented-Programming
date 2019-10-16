package FrontEnd;

import BackEnd.Group;
import BackEnd.Student;
import BackEnd.Subject;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

public class AddGroup {

    @FXML
    private ObservableList<Student> studentList = FXCollections.observableArrayList();
    @FXML
    private TableView<Student> studentTableView;
    @FXML
    private TableColumn<String, Student> studentNameColumn;
    @FXML
    private TableColumn<String, Student> studentSurnameColumn;
    @FXML
    private Button addStudentButton;
    @FXML
    private Button deleteStudentButton;
    @FXML
    private ObservableList<Subject> subjectList = FXCollections.observableArrayList();
    @FXML
    private TableView<Subject> subjectTableView;
    @FXML
    private TableColumn<String, Subject> subjectsColumn;
    @FXML
    private TableColumn<Integer, Subject> creditsColumn;
    @FXML
    private Button addSubjectButton;
    @FXML
    private Button deleteSubjectButton;
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
    private Button addGroup;
    @FXML
    private TextField subjectNameInput;

    @FXML
 /*   void deleteStudentAction(ActionEvent event) {
        try {
            deleteStudentButton.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    System.out.println("Delete");
                    Student student = studentTableView.getSelectionModel().getSelectedItem();
                    if (student!=null) {
                        studentList.remove(student);
                    }
                }
            });
        } catch (Exception e){
            System.out.println("Error/List is empty");
        }
    }*/

    void deleteStudentAction(ActionEvent event) {
        try {
            Student student = studentTableView.getSelectionModel().getSelectedItem();
            if (student!=null) {
                studentList.remove(student);
            } else {
                System.out.println("Nothing to remove");
            }
        } catch (Exception e) {
            System.out.println("Error/List is empty");
        }
    }

    public void initialize(){
        final ObservableList<Student> studentList = FXCollections.observableArrayList();

        studentNameColumn.setCellValueFactory(new PropertyValueFactory<String, Student>("studentName"));
        studentSurnameColumn.setCellValueFactory(new PropertyValueFactory<String, Student>("studentSurname"));

        studentTableView.setItems(studentList);
    }
    
    @FXML
    void addStudentAction(ActionEvent event) {
        Student student = new Student();
        student.setStudentName(studentNameInput.getText());
        student.setStudentSurname(studentSurnameInput.getText());

        studentList.add(student);
        studentTableView.setItems(studentList);

        studentNameInput.clear();
        studentSurnameInput.clear();

        System.out.println(student.getStudentName());
        System.out.println(student.getStudentSurname());
        System.out.println(studentList);
    }

    @FXML
    void deleteSubjectAction(ActionEvent event) {
        try {
            subjectTableView.getSelectionModel().selectedItemProperty().addListener((v, oldValue, newValue ) -> System.out.println(newValue));
            subjectList.forEach(subjectList::remove);
        } catch (Exception e){
            System.out.println("Error/List is empty");
        }
    }


    @FXML
    void addSubjectAction(ActionEvent event) {
        //addStudentButton.setOnAction(e -> addStudentButtonClicked());
        final String subjectName = subjectNameInput.getText();
        final Integer subjectCredits = Integer.parseInt(subjectCreditsInput.getText());

        Subject subject = new Subject(subjectName, subjectCredits);
        subject.setSubjectName(subjectNameInput.getText());
        subject.setSubjectCredits(Integer.parseInt(subjectCreditsInput.getText()));
        subjectList.add(subject);
        subjectTableView.setItems(subjectList);

        subjectNameInput.clear();
        subjectCreditsInput.clear();

        System.out.println(subject.getSubjectName());
        System.out.println(subject.getSubjectCredits());
        System.out.println(subjectList);
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