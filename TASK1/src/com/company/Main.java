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

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("PLease enter the length of a rectangle: ");
        float inputLength = input.nextFloat();
        System.out.println("PLease enter the width of a rectangle:");
        float inputWidth = input.nextFloat();
        System.out.println("Length: "+ inputLength + "\nWidth: " + inputWidth);

        Rectangle rectangle1 = new Rectangle(inputLength, inputWidth, 0, 0);

        System.out.println("The perimeter of a rectangle is: " + RectangleCalculations.getPerimeter(rectangle1.length, rectangle1.width));
        System.out.println("The square of a rectangle is: " + RectangleCalculations.getArea(rectangle1.length, rectangle1.width));
        System.out.printf("Diagonal %.2f", RectangleCalculations.getDiagonalLength(rectangle1.length, rectangle1.width));
        RectangleCalculations.getDiagInterCoord(rectangle1.length, rectangle1.width);
        System.out.println("\n CoordinateX: ");
    }
}
