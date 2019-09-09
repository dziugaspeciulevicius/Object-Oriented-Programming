package com.company;

public class Rectangle {

    public int length;
    public int width;
    public int x, y; //x, y coordinates of top left rectangle corner


    public Rectangle(int length, int width, int x, int y) {
        this.length = length;
        this.width = width;
        this.x = x;
        this.y = y;
    }

    public static int getPerimeter(int length, int width) {
        return (2 * length) + (2 * width);
    }

    public static int getArea(int length, int width) {
        return length * width;
    }

    public static float getDiagonalLength(int length, int width) {
        return (float) Math.sqrt(Math.pow(length,2)+Math.pow(width,2)); //typecast
    }
}