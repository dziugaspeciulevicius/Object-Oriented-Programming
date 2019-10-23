package Classes;

import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Student {
    private StringProperty studentName;
    private StringProperty studentSurname;
    private double studentAverage;
    ObservableList<Grades> gradesList = FXCollections.observableArrayList();


    public String getStudentName() {
        return studentName.get();
    }

    public void setStudentName(String studentName) {
        this.studentName.set(studentName);
    }

    public String getStudentSurname() {
        return studentSurname.get();
    }

    public void setStudentSurname(String studentSurname) {
        this.studentSurname.set(studentSurname);
    }

    public double getStudentAverage() {
        return studentAverage;
    }

    public void setStudentAverage(double studentAverage) {
        this.studentAverage = studentAverage;
    }

    public ObservableList<Grades> getGradesList() {
        return gradesList;
    }

    public void setGradesList(ObservableList<Grades> gradesList) {
        this.gradesList = gradesList;
    }

    void calculateGradeAverage (){
        double creditSum = 0;
        double sum = 0;
        for (int i = 0; i < gradesList.size(); i ++){
            sum += gradesList.get(i).getGrade()*gradesList.get(i).subject.getSubjectCredits();
            creditSum += gradesList.get(i).subject.getSubjectCredits();
        }
        studentAverage = sum/creditSum;
    }

}
