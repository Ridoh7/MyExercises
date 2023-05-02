package InheritanceDemo;

public class Square1Test {
    public static void main(String[] args) {
        Rectangle1 rectangle1=new Rectangle1(5,4);
        Square1 square1=new Square1(7);

        Square1 square11[]= new Square1[10];

        square11[0]=new Square1(1);
        square11[1]=new Square1(2);
        square11[2]=new Square1(3);
        square11[3]=new Square1(4);
        square11[4]=new Square1(5);
        square11[5]=new Square1(6);
        square11[6]=new Square1(7);
        square11[7]=new Square1(8);
        square11[8]=new Square1(9);
        square11[9]=new Square1(10);

        System.out.printf("%s\t%8s\n", "Area", "Perimeter");

//        for (int counter=0; counter<square11.length; counter++){
//            System.out.printf("%5d%8d%n", counter, square11[counter]);
//        }


        for (int counter=0; counter<square11.length;counter++){
            counter=+counter;
            System.out.println(square1.getArea() + "\t\t" + square1.getPerimeter());

        }

//        for (int i=0; i<square11.length;i++){
//            System.out.println("\nArea of square "+(i+1) + " is " + square1.getArea());
//            System.out.println("\nPerimeter of square "+ (i+1) + " is " + square1.getPerimeter());
//
//        }


//        System.out.println("Area of rectangle is "  + rectangle1.getArea());
//        System.out.println("\nPerimeter of rectangle is " + rectangle1.getPerimeter());
//        System.out.println("\nArea of square is " + square1.getArea());
//        System.out.println("\nPerimeter of square is " + square1.getPerimeter());

    }
}
