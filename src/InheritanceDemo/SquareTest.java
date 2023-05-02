package InheritanceDemo;

public class SquareTest {
    public static void main(String[] args) {
        Rectangle rectangle=new Rectangle(4,5);
        Square square=new Square(4);

        Square[] squares=new Square[10];

        squares[0]=new Square(1);
        squares[1]=new Square(2);
        squares[2]=new Square(3);
        squares[3]=new Square(4);
        squares[4]=new Square(5);
        squares[5]=new Square(6);
        squares[6]=new Square(7);
        squares[7]=new Square(8);
        squares[8]=new Square(9);
        squares[9]=new Square(10);

        for (int i = 0; i < squares.length; i++) {

            System.out.println("The area of squares "  + (i+1) + " is "  + squares[i].getArea());
        }
        System.out.printf("\nArea of rectangle is %s", rectangle.getArea());
        System.out.printf("\nPerimeter of rectangle is %s", rectangle.getPerimeter());
        System.out.printf("\nArea of square is %s", square.getArea());
        System.out.printf("\nPerimeter of square is %s", square.getPerimeter());
    }
}
