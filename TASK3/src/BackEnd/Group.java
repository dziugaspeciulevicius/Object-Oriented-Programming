package BackEnd;

import javafx.beans.property.*;
import javafx.collections.ObservableList;

public class Group{

    private StringProperty groupName;
    private IntegerProperty semester;
    //private Student[] studentList;
    private ListProperty<Student> studentList;
    //private Subject[] subjectList;
    private ListProperty<Subject> subjectList;

    public Group(){
        this(null, 0, null, null);
        //this.groupName = null;
        //this.semester = null;
        //this.studentList = null;
        //this.subjectList = null;
    }

    public Group(String groupName, Integer semester, ObservableList studentList, ObservableList subjectList){
        this.groupName = new SimpleStringProperty(groupName);
        this.semester = new SimpleIntegerProperty(semester);
        this.studentList = new SimpleListProperty<Student>(studentList);
        this.subjectList = new SimpleListProperty<Subject>(subjectList);
    }

    public StringProperty getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName.set(groupName);
    }

    public StringProperty groupNameProperty() {
        return groupName;
    }

    public IntegerProperty getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester.set(semester);
    }

    public IntegerProperty semesterProperty() {
        return semester;
    }

    public ObservableList<Student> getStudentList() {
        return studentList.get();
    }

    public ListProperty<Student> studentListProperty() {
        return studentList;
    }

    public void setStudentList(ObservableList<Student> studentList) {
        this.studentList.set(studentList);
    }

    public ObservableList<Subject> getSubjectList() {
        return subjectList.get();
    }

    public ListProperty<Subject> subjectListProperty() {
        return subjectList;
    }

    public void setSubjectList(ObservableList<Subject> subjectList) {
        this.subjectList.set(subjectList);
    }
}
