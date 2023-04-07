package MyExercises;

import java.util.Scanner;

public class EvenOrOdd {

//    /**
//     * (Odd or Even) Write an application that reads an integer and determines and prints whether it’s odd or even.
//     * [Hint: Use the remainder operator. An even number is a multiple of 2.
//     * Any multiple of 2 leaves a remainder of 0 when divided by 2.]
//     */
    public static void main(String[] args) {
        int number;
        Scanner input= new Scanner(System.in);
        System.out.println("Enter number");
        number= input.nextInt();

        if (number % 2 == 0){
            System.out.printf("\nnumber is even "  + number );
        }
        if (number % 2 != 0){
            System.out.printf("\n number is odd "  + number);
        }

//    /**
//     * Write an application that reads two integers, determines whether the first is a
//     * multiple of the second and prints the result.
//     */
    int num1;
    int num2;
    Scanner scanner= new Scanner(System.in);
        System.out.println("Enter first integer");
        num1= scanner.nextInt();

        System.out.println("Enter second integer");
        num2= scanner.nextInt();

        if (num2 % num1 == 0)
            System.out.println("num1 is a multiple of num2");
        else {
            System.out.println("num1 is not a multiple of num2");
        }
}
}
