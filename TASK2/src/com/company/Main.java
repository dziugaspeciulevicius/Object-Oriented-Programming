//Write a program that calculates student grade average considering the number of credits.
//MAIN REQUIREMENTS:
//-Program has to let us insert student data (name, surname, group) and his lectures passed (subject name, evaluation, credit number)
//-Program has to print full student information and calculated average value
//
//EXTRA REQUIREMENT: program architecture has to have single responsibility

package com.company;
import java.util.ArrayList;
import java.util.List;
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

        System.out.println("Enter the amount of subjects you are taking this semester: ");
        int numberOfSubjects = input.nextInt();
        List<Record> list = new ArrayList<>(); //TRYING TO CREATE FEW OBJECT AND ADD EVERYTHING INTO ARRAY LIST
        for (int i = 1; i <= numberOfSubjects; i++) {
            Record subjectRecord = new Record();
            list.add(subjectRecord);
            System.out.println("\nEnter the name of a subject #" + i + ":");
            String inputSubjectName = input.next();
            subjectRecord.setSubjectName(inputSubjectName);
            System.out.println("Enter the student grade of a subject #" + i + ":");
            float inputSubjectGrade = input.nextFloat();
            subjectRecord.setSubjectGrade(inputSubjectGrade);
            System.out.println("Enter the credit number of a subject #" + i + ":");
            int inputSubjectCredits = input.nextInt();
            subjectRecord.setSubjectCredits(inputSubjectCredits);

            System.out.println("\nSubject #" + i +
                    "\nName: " + subjectRecord.getSubjectName() +
                    "\nGrade: " + subjectRecord.getSubjectGrade() +
                    "\nCredits: " + subjectRecord.getSubjectCredits());
        }

        //Getting first entered subject
        //System.out.println(list.get(0).getSubjectName() + list.get(0).getSubjectGrade() + list.get(0).getSubjectCredits());
        //Getting third entered subject
        //System.out.println(list.get(2).getSubjectName() + list.get(2).getSubjectGrade() + list.get(2).getSubjectCredits());

        //GPA FORMULA:
        //(subject grade * subject credits) = subject grade and credit evaluation (X)
        //(X + X + X + X + X + X) = total number of all subject evaluation (Y)
        // (Y / number of credits in a semester) = GPA
    }
}
