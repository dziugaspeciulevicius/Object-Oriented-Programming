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

        System.out.println("Enter your name: ");
        String inputName = input.nextLine();
        System.out.println("Enter your surname: ");
        String inputSurname = input.nextLine();
        System.out.println("Enter your group name/number: ");
        String inputGroup = input.nextLine();

        Student student1 = new Student(inputName, inputSurname, inputGroup);

        System.out.println("Enter ");;

        //Student student1 = new Student()

    }
}
