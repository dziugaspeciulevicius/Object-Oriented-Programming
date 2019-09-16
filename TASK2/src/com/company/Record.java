package com.company;

public class Record {
    private String studentName;
    private String studentSurname;
    private String studentGroup;
    private String subjectName;
    private float subjectGrade;
    private int subjectCredits;

    public String toString(){
        return "\nSubject name: "+ subjectName +"\n Subject grade: " + subjectGrade + "\n Subject credits: " + subjectCredits + "\n";
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

    public String getSubjectName() {
        return subjectName;
    }

    public float getSubjectGrade() {
        return subjectGrade;
    }

    public int getSubjectCredits() {
        return subjectCredits;
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