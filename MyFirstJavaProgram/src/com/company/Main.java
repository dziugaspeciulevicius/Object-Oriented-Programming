package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter the width and the height of a rectangle to calculate its circumference and square size:");

        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        System.out.println("Entered width number:" + a);
        int b = in.nextInt();
        System.out.println("Entered length number" + b);

        int c = getCircumference(a,b);
        System.out.println("The circumference of rectangle is: " + c);
    }

    static int getCircumference(int height, int length) {
        return + 2 * height + 2 * length;
    }
}
