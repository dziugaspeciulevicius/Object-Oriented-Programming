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

        System.out.println("\nEnter your name: ");
        String inputName = input.nextLine();
        studentRecord.setStudentName(inputName);

        System.out.println("\nEnter your surname: ");
        String inputSurname = input.nextLine();
        studentRecord.setStudentSurname(inputSurname);

        System.out.println("\nEnter your group: ");
        String inputGroup = input.nextLine();
        studentRecord.setStudentGroup(inputGroup);
        System.out.println("\nEnter the amount of subjects you are taking this semester: ");
        int numberOfSubjects = input.nextInt();
        Student.Subject[] subjectList = new Student.Subject[numberOfSubjects];
        for (int i = 1; i <= numberOfSubjects; i++) {



        //List<Object> list1 = new ArrayList<Object>();
        //list1.add(" ");
            //----------------------------------

            //Home h = new Home();
            //Sports[] sports = new Sports[10];
            //School[] schools = new School[10];
            //for (int i =0; i< sports.length; i++) {
            //    h.add(sports[i], schools[i]);
            //}
            //----------------------------------

            //class main{
            //    int bucky[] = {3,4,5,6,7};
            //    change(bucky);
            //
            //for (int y:bucky)
            //            System.out.println(y);
            //}
            //public static void change (int x[]) {
            //   for (int counter = 0; counter<x.length; counter++)
            //        x[counter]+=5;
            //    }
            // }
            //--------------------------------
        }

    }
}
