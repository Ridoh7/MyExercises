package InheritanceDemo;

import com.sun.source.tree.BreakTree;

/**
 * Create a class named 'Rectangle' with two data members 'length' and 'breadth' and two methods to print the area
 * and perimeter of the rectangle respectively. Its constructor having parameters for length and breadth is used to
 * initialize length and breadth of the rectangle.
 * Let class 'Square' inherit the 'Rectangle' class with its constructor having a parameter for its side (suppose s)
 * calling the constructor of its parent class as 'super(s,s)'. Print the area and perimeter of a rectangle and a square.
 */

public class Rectangle {
    private double length;
    private double breadth;
    private double perimeter;
    private double area;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }


    public Rectangle(double perimeter) {
        this.perimeter = perimeter;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getBreadth() {
        return breadth;
    }

    public void setBreadth(double breadth) {
        this.breadth = breadth;
    }

    public double getPerimeter() {
        perimeter = 2*(length+breadth);
        return perimeter;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    public double getArea() {
        area = length*breadth;
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
}

