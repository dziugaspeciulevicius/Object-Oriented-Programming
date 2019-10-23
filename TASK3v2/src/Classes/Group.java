package Classes;

import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Group {

    private SimpleStringProperty groupName;
    //private double groupAverage;
    private double groupAverage = 0;
    Student[] topThree = new Student[3];
    ObservableList<Student> studentList = FXCollections.observableArrayList();
    ObservableList<Subject> subjectList = FXCollections.observableArrayList();


    public String getGroupName() {
        return groupName.get();
    }

    public void setGroupName(String groupName) {
        this.groupName.set(groupName);
    }

    public double getGroupAverage() {
        return groupAverage;
    }

    public void setGroupAverage(double groupAverage) {
        this.groupAverage = groupAverage;
    }


}
