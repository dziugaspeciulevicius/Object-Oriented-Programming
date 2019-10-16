package BackEnd;

import javafx.beans.property.FloatProperty;
import javafx.beans.property.SimpleFloatProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Student {

    private StringProperty studentName;
    private StringProperty studentSurname;

    public Student(){
        //this.studentName = null;
        //this.studentSurname = null;
        this(null, null);
    }


    public Student(String studentName, String studentSurname){
        this.studentName = new SimpleStringProperty(studentName);
        this.studentSurname = new SimpleStringProperty(studentSurname);
    }

    public void setStudentName(String studentName) {
        this.studentName.set(studentName);
    }

    public void setStudentSurname(String studentSurname) {
        this.studentSurname.set(studentSurname);
    }

    public StringProperty studentSurnameProperty() {
        return studentSurname;
    }

    public StringProperty getStudentName() {
        return studentName;
    }

    public StringProperty getStudentSurname() {
        return studentSurname;
    }

    public StringProperty studentNameProperty() {
        return studentName;
    }

    /*
    public float getGPA() {
        float x = 0;
        float y = 0;

        for (int i = 1; i <= numberOfSubjects; i++) {
            x = x + subjectList[i].getSubjectCredits() * subjectList[i].getSubjectGrade();
            y = y + subjectList[i].getSubjectCredits();
        }
        return x / y;
    }*/

}