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

        Student studentInfo = new Student();

        System.out.println("Enter your name: ");
        String inputName = input.nextLine();
        studentInfo.setStudentName(inputName);
        System.out.println("Enter your surname: ");
        String inputSurname = input.nextLine();
        studentInfo.setStudentSurname(inputSurname);
        System.out.println("Enter your group name/number: ");
        String inputGroup = input.nextLine();
        studentInfo.setStudentGroup(inputGroup);

        Subject subjectsInfo = new Subject();

        String subjectName;
        float subjectGrade;
        int subjectCredits;
        System.out.println("Enter the amount of subjects you are taking this semester: ");
        int numberOfSubjects = input.nextInt();
        for (int i = 0; i < numberOfSubjects; i++) {
            //System.out.println("Subject #" + i);
            subjectName = input.next();
            subjectsInfo.setSubjectName(subjectName);

            System.out.println("Subject #" + i + " Name: " + subjectsInfo.getSubjectName());
        }





        //GPA FORMULA:
        //(subject grade * subject credits) = subject grade and credit evaluation (X)
        //(X + X + X + X + X + X) = total number of all subject evaluation (Y)
        // (Y / number of credits in a semester) = GPA

        //System.out.println("Enter the number of subjects: ");
        //Student student1 = new Student(inputName, inputSurname, inputGroup);

    }
}
