//Write a program that calculates student grade average considering the number of credits.
//MAIN REQUIREMENTS:
//-Program has to let us insert student data (name, surname, group) and his lectures passed (subject name, evaluation, credit number)
//-Program has to print full student information and calculated average value
//
//EXTRA REQUIREMENT: program architecture has to have single responsibility

package com.company;

import java.util.Arrays;
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
            studentRecord.subjectList[i] = new Subject();
            System.out.println("Enter the name of a subject #" + i + ":");
            String inputSubjectName = input.next();
            studentRecord.subjectList[i].setSubjectName(inputSubjectName);

            System.out.println("Enter the grade of a subject #" + i + ":");
            float inputSubjectGrade = input.nextFloat();
            studentRecord.subjectList[i].setSubjectGrade(inputSubjectGrade);

            System.out.println("Enter the credit number of a subject #" + i + ":");
            int inputSubjectCredits = input.nextInt();
            studentRecord.subjectList[i].setSubjectCredits(inputSubjectCredits);

            System.out.println("\nSubject #" + i +
                    "\nName: " + studentRecord.subjectList[i].getSubjectName() +
                    "\nGrade: " + studentRecord.subjectList[i].getSubjectGrade() +
                    "\nCredits: " + studentRecord.subjectList[i].getSubjectCredits());
        }

        System.out.println("\nYour as a student information: " +
                "\nName: " + studentRecord.getStudentName() +
                "\nSurname: " + studentRecord.getStudentSurname() +
                "\nGroup: " + studentRecord.getStudentGroup());

        System.out.println(Arrays.toString(studentRecord.subjectList));
    }
}


/*
private ArrayList<Integer>credits = new ArrayList<>(); // this is how declared array in class

public void setCredits(int credits) { // this is how you create a setter for array s you could freely add stuf to array
    this.credits.add(credits);
}

public List<Integer> getCredits() { // This is the getter that helps you get the credits
    return Collections.unmodifiableList(this.credits);// it's will show a error to you first, but you need to click to "More actions"
}                        // and there will be a button who will make it work

Integer grades=students.getGrades().get(i) // this how you can get one item at the time in array
*/
//----------------------------------

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
//    System.out.println(y);
//}
//public static void change (int x[]) {
//   for (int counter = 0; counter<x.length; counter++)
//        x[counter]+=5;
//    }
// }
//--------------------------------

//THIS PRINTS A WHOLE LIST OF ENTERED SUBJECTS, BUT FOR THIS TO WORK IT NEEDS TO HAVE A toString method in Record
//System.out.println(listOfSubjects);

//Getting first entered subject
//System.out.println(listOfSubjects.get(0).getSubjectName() + listOfSubjects.get(0).getSubjectGrade() + listOfSubjects.get(0).getSubjectCredits());
//Getting third entered subject
//System.out.println(listOfSubjects.get(2).getSubjectName() + listOfSubjects.get(2).getSubjectGrade() + listOfSubjects.get(2).getSubjectCredits());

//GPA FORMULA:
//(subject grade * subject credits) = subject grade and credit evaluation (X)
//(X + X + X + X + X + X) = total number of all subject evaluation (Y)
// (Y / number of credits in a semester) = GPA
