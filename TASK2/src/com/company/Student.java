package com.company;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String studentName;
    private String studentSurname;
    private String studentGroup;

    class Subject {
        private String subjectName;
        private float subjectGrade;
        private int subjectCredits;
        private int numberOfSubjects;
        Subject[] subjectList = new Subject[numberOfSubjects];
        //type[array] name = new type[how long]
        List<String> subjectList = new ArrayList<>();

        public String getSubjectName() {
            return subjectName;
        }

        public float getSubjectGrade() {
            return subjectGrade;
        }

        public int getSubjectCredits() {
            return subjectCredits;
        }

        public void setSubjectName(String newSubjectName) {
            this.subjectName = newSubjectName;
        }

        public void setSubjectGrade(float subjectGrade) {
            this.subjectGrade = subjectGrade;
        }

        public void setSubjectCredits(int subjectCredits) {
            this.subjectCredits = subjectCredits;
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



    /*double getAverage(){

    }*/
}
