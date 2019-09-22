//Write a program that calculates student grade average considering the number of credits.
//MAIN REQUIREMENTS:
//-Program has to let us insert student data (name, surname, group) and his lectures passed (subject name, evaluation, credit number)
//-Program has to print full student information and calculated average value
//
//EXTRA REQUIREMENT: program architecture has to have single responsibility

package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Student studentRecord = new Student();

        System.out.println("Enter your name: ");
        String inputName = input.nextLine();
        studentRecord.setStudentName(inputName);

        System.out.println("Enter your surname: ");
        String inputSurname = input.nextLine();
        studentRecord.setStudentSurname(inputSurname);

        System.out.println("Enter your group: ");
        String inputGroup = input.nextLine();
        studentRecord.setStudentGroup(inputGroup);

        System.out.println("Enter the amount of subjects you are taking this semester: ");
        int numberOfSubjects = input.nextInt();

        for (int i = 1; i <= numberOfSubjects; i++) {
            Subject[] subjectList = new Subject[numberOfSubjects];

            System.out.println("Enter the name of a subject #" + i + ":");
            String inputSubjectName = input.nextLine();



            System.out.println("Enter the grade of a subject #" + i + ":");
            float inputSubjectGrade = input.nextFloat();
            studentRecord.subjectList.setSubjectGrade(inputSubjectGrade);

            System.out.println("Enter the credit number of a subject #" + i + ":");
            int inputSubjectCredits = input.nextInt();
            studentRecord.subjectList.setSubjectCredits(inputSubjectCredits);
        }
        System.out.println(studentRecord.subjectList);
        System.out.println(studentRecord.subjectList.getSubjectName());
        System.out.println(studentRecord.subjectList.getSubjectGrade());
        System.out.println(studentRecord.subjectList.getSubjectCredits());
    }
}





















/*
        System.out.println("\nYour student details are: " +
                "\nName: " + studentRecord.getStudentName() +
                "\nSurname: " + studentRecord.getStudentSurname() +
                "\nGroup: " + studentRecord.getStudentGroup());

        System.out.println("\nSubjects: ");
        System.out.println(studentRecord.getSubjectName());
        System.out.println(studentRecord.getSubjectGrade());
        System.out.println(studentRecord.getSubjectCredits());
*/