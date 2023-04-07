package MyExercises;

import java.util.Scanner;

public class BasicOperations {
    /**
     *  Write an application that inputs three integers from the
     * user and displays the sum, average, product, smallest and largest of the numbers. Use the techniques
     * shown in Fig. 2.15. [Note: The calculation of the average in this exercise should result in an integer
     * representation of the average. So, if the sum of the values is 7, the average should be 2, not
     * 2.3333….]
     */

    public static void main(String[] args) {
        int num1;
        int num2;
        int num3;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first integer");
        num1 = scanner.nextInt();

        System.out.println("Enter second integer");
        num2 = scanner.nextInt();

        System.out.println("Enter third integer");
        num3 = scanner.nextInt();

        int sum = num1 + num2 + num3;
        System.out.printf("Sum is : %d", sum);

        double av;
        av = (double) sum / 3;
        System.out.printf("\nThe Average is : %.0f", av);

        int product = num1 * num2 * num3;
        System.out.printf("\nProduct is : %d", product);

        int largest= num1;
        int smallest=num1;

        if (num2>largest)
            largest=num2;

        if (num3>largest)
            largest=num3;

        if (num2<smallest)
            smallest=num2;

        if (num3<smallest)
            smallest=num3;
        System.out.println("\nLargest of three integers is " + largest + " and the smallest is "+ smallest +".");


        }

    }
