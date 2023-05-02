package InheritanceDemo;

public class Square1 extends Rectangle1{
    private int sides;

    public Square1(int sides) {
        super(sides, sides);
        this.sides=sides;
    }
    public int getArea(){
        int area;
        area= (int) Math.pow(sides,2);
        return area;
    }

    @Override
    public int getPerimeter() {
        int perimeter;
        perimeter= 4*sides;
        return perimeter;
    }
}
