package com.company;

public class Student {
    private String studentName;
    private String studentSurname;
    private String studentGroup;
    private String subjectName;
    private float subjectGrade;
    private int subjectCredits;
    private subject[] subjectList;

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

    public String getSubjectName() {
        return subjectName;
    }

    public float getSubjectGrade() {
        return subjectGrade;
    }

    public int getSubjectCredits() {
        return subjectCredits;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public void setSubjectGrade(float subjectGrade) {
        this.subjectGrade = subjectGrade;
    }

    public void setSubjectCredits(int subjectCredits){
        this.subjectCredits = subjectCredits;
    }
}
