package com.company;

public class Rectangle {

    public int length;
    public int width;
    public static int xCoordinate; //x coordinate of top left rectangle corner
    public static int yCoordinate; //y coordinate of top left rectangle corner

    public Rectangle(int length, int width, int x, int y) {
        this.length = length;
        this.width = width;
        this.xCoordinate = x;
        this.yCoordinate = y;
    }

    public static int getPerimeter(int height, int width) {
        return (2 * height) + (2 * width);
    }

    public static int getSquare(int height, int width) {
        return height * width;
    }
}