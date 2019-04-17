package com.company.homeworks.AreaOfRectangle;

public class Area extends Shape {

    double length;
    double breadth;
    double side;
    double radius;
    double P = 3.141592653589793;

    @Override
    public int rectangleArea(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
        double rectangleAreaResult = this.length * this.breadth;
        return (int)rectangleAreaResult;
    }

    @Override
    public int squareArea(double side) {
        this.side = side;
        double squareAreaResult = this.side * this.side;
        return (int) squareAreaResult;
    }

    @Override
    public int circleArea(double radius) {
        this.radius = radius;
        double circleAreaResult = P * this.radius;
        return (int) circleAreaResult;
    }

    /*public void rectangleAreaPrint(){
        System.out.println("Rectangle Area is: " +);
    }

    public void squareAreaPrint(){
        System.out.println("Square Area is: " + length);
    }

    public void circleAreaPrint(){
        System.out.println();
    }*/
}
