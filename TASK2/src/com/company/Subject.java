package com.company;

public class Subject {
    private String subjectName;
    private float subjectGrade;
    private int subjectCredits;

    /*public Subject (String subjectName, float grade, int credits){
        this.subjectName = subjectName;
        subjectGrade = grade;
        subjectCredits = credits;
    }*/

    public void setSubjectName(String subjectName){
        this.subjectName = subjectName;
    }

    public void setSubjectGrade(float subjectGrade){
        this.subjectGrade = subjectGrade;
    }

    public void setSubjectCredits(int subjectCredits){
        this.subjectCredits = subjectCredits;
    }

    public String getSubjectName(){
        return subjectName;
    }

    public float getSubjectGrade(){
        return subjectGrade;
    }

    public int getSubjectCredits(){
        return subjectCredits;
    }
}