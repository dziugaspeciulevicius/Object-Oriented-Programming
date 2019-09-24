package com.company;

public class Student {
    private String studentName;
    private String studentSurname;
    private String studentGroup;
    Subject[] subjectList = new Subject[6];

    /*public Student (String studentName, String studentSurname, String studentGroup, Subject subjectList) {
            this.studentName = studentName;
            this.studentSurname = studentSurname;
            this.studentGroup = studentGroup;
            this.subjectList = subjectList;
    }*/

    public void setStudentName(String studentName){
        this.studentName = studentName;
    }

    public void setStudentSurname(String studentSurname){
        this.studentSurname = studentSurname;
    }

    public void setStudentGroup(String studentGroup){
        this.studentGroup = studentGroup;
    }

    public String getStudentName(){
        return studentName;
    }

    public String getStudentSurname(){
        return studentSurname;
    }

    public String getStudentGroup(){
        return studentGroup;
    }

    public void getGPA(){
        
    }
    /*
    GPA FORMULA:
    (subject grade * subject credits) = subject grade and credit evaluation (X)
    (X + X + X + X + X + X) = total number of all subject evaluation (Y)
    (Y / number of credits in a semester) = GPA
    */
}
