package MyExercises;

import java.util.Scanner;

public class ComparingIntegers {
    public static void main(String[] args) {
//        /**
//         * Comparing Integers Write an application that asks the user to enter two integers, obtains
//         * them from the user and displays the larger number followed by the words "is larger".
//         * If the numbers are equal, print the message "These numbers are equal".
//         */
        int numb1;
        int numb2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first integer");
        numb1 = scanner.nextInt();

        System.out.println("Enter second integer");
        numb2 = scanner.nextInt();


        if (numb2 > numb1)
            System.out.printf(" %d > %d ", numb2, numb1);

        if (numb1 > numb2)
            System.out.printf("%d is > %d ", numb1, numb2);

        System.out.println("\nEnter first integer");
        numb1= scanner.nextInt();

        System.out.println("Enter second integer");
        numb2= scanner.nextInt();

        if (numb1 == numb2)
            System.out.println("\n these numbers are equal");
    }
}
