package com.company;

public class Student {
    private String studentName;
    private String studentSurname;
    private String studentGroup;
    Subject subjectList;

    //public Student (String inputName, String surname, String group, Subject subjectList) {
    //        studentName = inputName;
    //        studentSurname = surname;
    //        studentGroup = group;
    //        this.subjectList = subjectList;
    //}

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
    //gpa
}
