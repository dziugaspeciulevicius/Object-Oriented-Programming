package com.company;

import java.awt.geom.Rectangle2D;

public class Rectangle {

    public int length;
    public int width;
    public int x; //x coordinate of top left rectangle corner
    public int y; //y coordinate of top left rectangle corner


    public static int getPerimeter(int height, int width) {
        return (2 * height) + (2 * width);
    }
    public static int getSquare(int height, int width) {
        return height * width;
    }
}
