package BackEnd;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.StringProperty;

public class Group {

    private StringProperty groupName;
    private IntegerProperty semester;
    private Student[] studentList;
    private Subject[] subjectList;


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


    public Student[] getStudentList() {
        return studentList;
    }

    public void setStudentList(Student[] studentList) {
        this.studentList = studentList;
    }


    public Subject[] getSubjectList() {
        return subjectList;
    }

    public void setSubjectList(Subject[] subjectList) {
        this.subjectList = subjectList;
    }
}
