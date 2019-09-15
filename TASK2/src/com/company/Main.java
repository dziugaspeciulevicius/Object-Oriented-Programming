//Write a program that calculates student grade average considering the number of credits.
//MAIN REQUIREMENTS:
//-Program has to let us insert student data (name, surname, group) and his lectures passed (subject name, evaluation, credit number)
//-Program has to print full student information and calculated average value
//
//EXTRA REQUIREMENT: program architecture has to have single responsibility

package com.company;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Record studentRecord = new Record();

        System.out.println("Enter your name: ");
        String inputName = input.nextLine();
        studentRecord.setStudentName(inputName);
        System.out.println("Enter your surname: ");
        String inputSurname = input.nextLine();
        studentRecord.setStudentSurname(inputSurname);
        System.out.println("Enter your group name/number: ");
        String inputGroup = input.nextLine();
        studentRecord.setStudentGroup(inputGroup);

        String subjectName;
        float subjectGrade;
        int subjectCredits;

        System.out.println("Enter the amount of subjects you are taking this semester: ");
        int numberOfSubjects = input.nextInt();
        //Record subject = new Record();
        Record[] subject = new Record[numberOfSubjects];
        for (int i = 0; i < numberOfSubjects; i++) {
            subject[i] = new Record();

            System.out.println("\nEnter the name of a subject #" + i + ":");
            String inputSubjectName = input.next();
            subject[i].setSubjectName(inputSubjectName);
            System.out.println("Enter the student grade of a subject #" + i + ":");
            float inputSubjectGrade = input.nextFloat();
            subject[i].setSubjectGrade(inputSubjectGrade);
            System.out.println("Enter the credit number of a subject #" + i + ":");
            int inputSubjectCredits = input.nextInt();
            subject[i].setSubjectCredits(inputSubjectCredits);

            System.out.println("\nSubject #" + i +
                    "\nName: " + subject[i].getSubjectName() +
                    "\nGrade: " + subject[i].getSubjectGrade() +
                    "\nCredits: " + subject[i].getSubjectCredits());

            /*
            System.out.println("Enter the name of a subject #" + i + ":");
            String inputSubjectName = input.next();
            subject.setSubjectName(inputSubjectName);
            System.out.println("Enter the student grade of a subject #" + i + ":");
            float inputSubjectGrade = input.nextFloat();
            subject.setSubjectGrade(inputSubjectGrade);
            System.out.println("Enter the credit number of a subject #" + i + ":");
            int inputSubjectCredits = input.nextInt();
            subject.setSubjectCredits(inputSubjectCredits);

            System.out.println("Subject #" + i +
                    "\nName: " + subject.getSubjectName() +
                    "\nGrade: " + subject.getSubjectGrade() +
                    "\nCredits: " + subject.getSubjectCredits());
            */
        }
        System.out.println("\nSubject #1 " + subject[0]);

        /*System.out.println("Taken subjects: " + subject.getSubjectName() + subject.getSubjectGrade() +
                subject.getSubjectCredits());
        */

        //GPA FORMULA:
        //(subject grade * subject credits) = subject grade and credit evaluation (X)
        //(X + X + X + X + X + X) = total number of all subject evaluation (Y)
        // (Y / number of credits in a semester) = GPA
    }
}
