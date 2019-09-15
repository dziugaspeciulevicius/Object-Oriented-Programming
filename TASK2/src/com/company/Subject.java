package com.company;

public class Subject {
    private String subjectName;
    private float subjectGrade;
    private int subjectCredits;

    /*public Subject(String subjectName, float grade, int credits) {
        this.subjectName = subjectName;
        this.grade = grade;
        this.credits = credits;
    }*/

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