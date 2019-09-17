package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Student {
    private String studentName;
    private String studentSurname;
    private String studentGroup;

    static class Subject {
        private ArrayList<String>subjectName = new ArrayList<>();
        private ArrayList<Float>subjectGrade = new ArrayList<>();
        private ArrayList<Integer>subjectCredits = new ArrayList<>();

        public List<String> getSubjectName() {
            return subjectName;
        }

        public List<Float> getSubjectGrade() {
            return subjectGrade;
        }

        public List<Integer> getSubjectCredits() {
            return Collections.unmodifiableList(subjectCredits);
        }

        public void setSubjectName(String subjectName) {
            this.subjectName.add(subjectName);
        }

        public void setSubjectGrade(float subjectGrade) {
            this.subjectGrade.add(subjectGrade);
        }

        public void setSubjectCredits(int credits){
            this.subjectCredits.add(credits);
        }
    }

    public String getStudentName() {
        return studentName;
    }

    public String getStudentSurname() {
        return studentSurname;
    }

    public String getStudentGroup() {
        return studentGroup;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setStudentSurname(String studentSurname) {
        this.studentSurname = studentSurname;
    }

    public void setStudentGroup(String studentGroup) {
        this.studentGroup = studentGroup;
    }
}