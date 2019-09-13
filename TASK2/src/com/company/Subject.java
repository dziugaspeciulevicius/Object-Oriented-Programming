package com.company;

public class Subject {
    private String subjectName;
    private float grade;
    private int credits;

    /*public Subject(String subjectName, float grade, int credits) {
        this.subjectName = subjectName;
        this.grade = grade;
        this.credits = credits;
    }*/

    public String getSubjectName() {
        return subjectName;
    }

    public float getGrade() {
        return grade;
    }

    public int getCredits() {
        return credits;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public void setGrade(float subjectGrade) {
        this.grade = subjectGrade;
    }

    public void setCredits(float subjectCredits) {
        this.grade = subjectCredits;
    }
}