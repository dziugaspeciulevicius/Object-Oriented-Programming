package com.company;

public class Student extends Subject{
    private String studentName;
    private String studentSurname;
    private String studentGroup;
    private int numberOfSubjects;
    Subject[] subjectList = new Subject[10];

    public void setStudentName(String studentName){
        this.studentName = studentName;
    }

    public void setStudentSurname(String studentSurname){
        this.studentSurname = studentSurname;
    }

    public void setStudentGroup(String studentGroup){
        this.studentGroup = studentGroup;
    }

    public void setNumberOfSubjects(int numberOfSubjects){
        this.numberOfSubjects = numberOfSubjects;
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

    public float getGPA(){
        float x = 0;
        float y = 0;

        for (int i = 1; i <= numberOfSubjects; i++) {
            x = x + subjectList[i].getSubjectCredits() * subjectList[i].getSubjectGrade();
            y = y + subjectList[i].getSubjectCredits();
        }
        return x / y;
    }
    /*
    for (numberOfSubjects:subjectList) {
        x = x + subjectList[i].getSubjectCredits() * subjectList[i].getSubjectGrade();
        y = y + subjectList[i].getSubjectCredits();
    }
    */

    /*
    GPA FORMULA:
    (subject grade * subject credits) = subject grade and credit evaluation (X)
    (X + X + X + X + X + X) = total number of all subject evaluation (Y)
    (Y / number of credits in a semester) = GPA
    */
}