package InheritanceDemo;

public class SquareRectangle extends RectangleShape{
    private int sides;
    public static void square (){

        System.out.println("Square is a rectangular");
    }

    public static void main(String[] args) {
        SquareRectangle squareRectangle=new SquareRectangle();
        squareRectangle.printShape();
        squareRectangle.printRectangle();
    }
}
