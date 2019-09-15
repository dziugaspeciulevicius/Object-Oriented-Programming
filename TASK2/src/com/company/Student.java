package com.company;

public class Student {
    private String studentName;
    private String studentSurname;
    private String studentGroup;

    /*public Student(String name, String surname, String group) {
        this.name = name;
        this.surname = surname;
        this.group = group;
    }*/

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