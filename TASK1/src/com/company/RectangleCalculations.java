package com.company;

public class RectangleCalculations {

    public static float getPerimeter(float length, float width) {
        return (2 * length) + (2 * width);
    }

    public static float getArea(float length, float width) {
        return length * width;
    }

    public static float getDiagonalLength(float length, float width) {
        return (float) Math.sqrt(length * length + width * width);
        //return (float) Math.sqrt(Math.pow(length, 2)+Math.pow(width, 2)); //typecast
    }

    public static void getDiagInterCoord(float length, float width) {
        System.out.println("\nCoordinateX: " + (length/2) + "\nCoordinateY: " + (width/2));
    }
}