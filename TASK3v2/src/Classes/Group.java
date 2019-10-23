package Classes;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Group {

    private SimpleStringProperty groupName;
    private int semester;
    //private double groupAverage;
    private double groupAverage = 0;
    Student[] topThree = new Student[3];
    public ObservableList<Student> studentList = FXCollections.observableArrayList();
    public ObservableList<Subject> subjectList = FXCollections.observableArrayList();


    public String getGroupName() {
        return groupName.get();
    }

    public void setGroupName(String groupName) {
        this.groupName = new SimpleStringProperty(groupName);
        //this.groupName.set(groupName); //this does not work becuz no new SimpleStringProperty
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public double getGroupAverage() {
        return groupAverage;
    }

    public void setGroupAverage(double groupAverage) {
        this.groupAverage = groupAverage;
    }


}
