package AssignmentAssessment;

public class hypotenuseCalculation {
    public static void main(String[] args) {

        hypotenuseCalculation(3.0,4.0);
        hypotenuseCalculation(5.0, 12.0);
        hypotenuseCalculation(8.0, 15.0);
    }

    public static double hypotenuseCalculation(double side1, double side2) {
        int counter = 1;
        double length = Math.sqrt(Math.pow(side1, 2) + Math.pow(side2, 2));
        System.out.printf("%s\t%s\t%s\t%s\n", "Triangle", "Side1", "Side2", "Length");
        System.out.printf("%d %14.2f %8.2f %8.2f\n", counter++, side1, side2, length);
        return length;
    }

}
