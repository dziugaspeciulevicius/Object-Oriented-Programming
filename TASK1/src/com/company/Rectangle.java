package com.company;

public class Rectangle {

    public float length;
    public float width;
    public float x, y; //x, y coordinates of top left rectangle corner

    public Rectangle(float length, float width, float x, float y) {
        this.length = length;
        this.width = width;
        this.x = x;
        this.y = y;
    }

    public static float getPerimeter(float length, float width) {
        return (2 * length) + (2 * width);
    }

    public static float getArea(float length, float width) {
        return length * width;
    }

    public static float getDiagonalLength(float length, float width) {
        //return (float) Math.sqrt(Math.pow(length, 2)+Math.pow(width, 2)); //typecast
        return (float) Math.sqrt(length * length + width * width);
    }

    public static void getDiagInterCoord(float length, float width) {
        System.out.println("\nCoordinateX: " + (length/2) + "\nCoordinateY: " + (width/2));
        //that means xCenter = (x1 +x2)/2
        //           yCenter = (y1 +y2)/2
    }
}