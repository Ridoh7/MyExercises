package MyExercises;

import java.util.Scanner;

public class SeparatingIntegers {

//    /**
//     * Write an application that inputs one number consisting of five digits from the user,
//     * separates the number into its individual digits and prints the digits
//     * separated from one another by three spaces each. For example, if the user types in the number 42339,
//     * the program should print 4   2   3   3   9
//     * Assume that the user enters the correct number of digits. What happens when you enter a
//     * number with more than five digits? What happens when you enter a number with fewer than five
//     * digits? [Hint: It’s possible to do this exercise with the techniques you learned in this chapter. You’ll
//     * need to use both division and remainder operations to “pick off” each digit.]
//     */

    public static void main(String[] args) {
        int number;
        int first_digit, second_digit, third_digit, forth_digit, fifth_digit;
        int first_reminder, second_reminder, third_reminder, forth_reminder;

        Scanner input=new Scanner(System.in);
        System.out.println("Enter enter");
        number= input.nextInt();

        first_digit=number / 10000;
        first_reminder=number%10000;

        second_digit=first_reminder/1000;
        second_reminder=first_reminder%1000;

        third_digit=second_reminder/100;
        third_reminder=second_reminder%100;

        forth_digit=third_reminder/10;
        forth_reminder=third_reminder%10;

        fifth_digit=forth_reminder;

        System.out.printf("%d   ", first_digit);
        System.out.printf("%d   ", second_digit);
        System.out.printf("%d   ", third_digit);
        System.out.printf("%d   ", forth_digit);
        System.out.printf("%d   ", fifth_digit);

    }
}
