package com.seankozen;

import java.awt.geom.Point2D;

public class Point {

    private int x;
    private int y;

    public Point() {
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance () {
        return Math.sqrt((x*x) + (y*y));
    }

    public double distance ( int anotherX, int anotherY) {
        return Math.sqrt((this.x - anotherX) * (this.x -anotherX) + (this.y - anotherY) * (this.y - anotherY));
    }



    public double distance (Point another) {
        return Math.sqrt((this.x - another.x) * (this.x -another.x) + (this.y - another.y) * (this.y - another.y));
    }




}
