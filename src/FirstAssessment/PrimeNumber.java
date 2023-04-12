package FirstAssessment;

import java.util.Scanner;

public class PrimeNumber {
    /**
     * 6.25 (Prime Numbers) A positive integer is prime if it’s divisible by only 1 and itself. For example,
     * 2, 3, 5 and 7 are prime, but 4, 6, 8 and 9 are not. The number 1, by definition, is not prime.
     * a) Write a method that determines whether a number is prime.
     * b) Use this method in an application that determines and displays all the prime numbers
     * less than 10,000. How many numbers up to 10,000 do you have to test to ensure that
     * you’ve found all the primes?
     * c) Initially, you might think that n/2 is the upper limit for which you must test to see
     * whether a number n is prime, but you need only go as high as the square root of n. Rewrite
     * the program, and run it both ways.
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number : ");
        int start = input.nextInt();

        System.out.print("Enter the second number : ");
        int end = input.nextInt();
        System.out.println("List of prime numbers between " + start + " and " + end);

        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
