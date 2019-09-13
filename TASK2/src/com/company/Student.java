package com.company;

public class Student {
    private String name;
    private String surname;
    private String group;

    /*public Student(String name, String surname, String group) {
        this.name = name;
        this.surname = surname;
        this.group = group;
    }*/

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getGroup() {
        return group;
    }

    public void setName(String studentName) {
        this.name = studentName;
    }

    public void setSurname(String studentSurname) {
        this.surname = studentSurname;
    }

    public void setGroup(String studentGroup) {
        this.group = studentGroup;
    }
}