//Class Rectangle attributes: length, width, top left corner coordinates (x, y)
//There has to be methods who return:
//-Rectangle square size (2t)
//-Rectangle perimeter (2t)
//-Diagonal length (2t)
//-Rectangle diagonals intersection coordinates (4t)
//
//EXTRA REQUIREMENT: Class Rectangle has to have single responsibility principle (5t)
//---------------------------------------------------------------------------------------
//SingleResponsibilityPrinciple: https://www.youtube.com/watch?v=bnKIDV-HsXA
//Its a principle where one class is responsible for no more than two different methods (functions)
//JAVA DOCUMENTATION BELOW FOR THIS EXERCISE:
//https://docs.oracle.com/javase/7/docs/api/java/awt/Rectangle.html#union(java.awt.Rectangle)

package com.company;
import java.util.Scanner;

public class Main {

    public static void promptEnterKey(){
        System.out.println("Press ENTER key to continue...");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("PLease enter the length of a rectangle: ");
        int length = input.nextInt();
        System.out.println("PLease enter the width of a rectangle:");
        int width = input.nextInt();
        System.out.println("Length: "+ length + "\nWidth: " + width);

        System.out.println("The perimeter of a rectangle is: " + Rectangle.getPerimeter(length, width));
        System.out.println("The square of a rectangle is: " + Rectangle.getArea(length, width));
        //System.out.println("Diagonal: "  + Rectangle.getDiagonalLength(length, width));
        System.out.printf("Diagonal %.2f", Rectangle.getDiagonalLength(length, width));
    }
}
