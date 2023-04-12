package FirstAssessment;

import java.util.Scanner;

public class HypotenuseCalculations {
        /**
         * Define a method hypotenuse that calculates the hypotenuse of
         * a right triangle when the lengths of the other two sides are given.
         * The method should take two arguments of type double and return the hypotenuse as double
         * application that reads values for side1 and side2 and performs the calculation with the hypotenuse
         * method. Use Math methods pow and sqrt to determine the length of the hypotenuse for each of the
         * triangles [Note: Class Math also provides method hypot to perform this calculation.
         * triangle 1 side1=3.0, side2= 4.0
         * triangle 2 side1=5.0, side2= 12.0
         * triangle 3 side1=8.0, side2=15.0]
         */
        public static void main(String[] args) {
            double value1OfSide1=3.0, value1OfSide2=4.0;
            double value2OfSide1=5.0, value2OfSide2=12.0;
            double value3OfSide1=8.0, value3OfSide2=15.0;


            //using hypotenuse=Math.sqrt(Math.pow(leg1,1)+Math.pow(side2,2) to calculate hypotenuse
            double hypotenuse1= Math.sqrt(Math.pow(value1OfSide1,2)+Math.pow(value1OfSide2,2));
            double hypotenuse2= Math.sqrt(Math.pow(value2OfSide1,2)+Math.pow(value2OfSide2,2));
            double hypotenuse3= Math.sqrt(Math.pow(value3OfSide1,2)+Math.pow(value3OfSide2,2));

            System.out.printf("\nThe hypotenuse1 is: %.2f", hypotenuse1);
            System.out.printf("\nThe hypotenuse2 is: %.2f", hypotenuse2);
            System.out.printf("\nThe hypotenuse3 is: %.2f", hypotenuse3);
        }

    }
