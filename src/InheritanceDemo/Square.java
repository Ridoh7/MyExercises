package InheritanceDemo;

public class Square extends Rectangle{
    private double sides;

    public Square(double sides) {
        super(sides);
        this.sides = sides;
    }

    public double getSides() {
        return sides;
    }

    public void setSides(double sides) {
        this.sides = sides;
    }

    @Override
    public double getArea() {
        double area;
        area= Math.pow(sides,2);
        return area;
    }

    @Override
    public void setArea(double area) {
    }

    @Override
    public double getPerimeter() {
        double perimeter;
        perimeter=4*sides;
        return perimeter;
    }

    @Override
    public void setPerimeter(double perimeter) {
    }

}
