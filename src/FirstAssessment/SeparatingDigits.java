package FirstAssessment;

import java.util.Scanner;

/**
 * 6.21 (Separating Digits) Write methods that accomplish each of the following tasks:
 * a) Calculate the integer part of the quotient when integer a is divided by integer b.
 * b) Calculate the integer remainder when integer a is divided by integer b.
 * c) Use the methods developed in parts (a) and (b) to write a method displayDigits that
 * receives an integer between 1 and 99999 and displays it as a sequence of digits, separating
 * each pair of digits by two spaces. For example, the integer 4562 should appear as
 *                                  4  5  6  2
 * Incorporate the methods into an application that inputs an integer and calls displayDigits by passing the
 * method the integer entered. Display the results.
 */
public class SeparatingDigits {
    private int a;
    private int b;
    //calculating the integer
    public static int quotient(int a, int b){
        return a/b;
    }
    //calculating the remainder
    public static int remainder(int a, int b){
        return a%b;
    }

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

