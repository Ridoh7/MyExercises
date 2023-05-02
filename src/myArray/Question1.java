package myArray;

import java.util.Scanner;

public class Question1 {
    /**
     * Take 10 integer inputs from user and store them in an array and print them on screen.
     */
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter ten digits");
        int[]z=new int[10];
        for (int i = 0; i < z.length; i++) {
            System.out.println("Print the value of z["+i+"]");
            z[i]= scanner.nextInt();
        }
        for (int i = 0; i < z.length; i++) {
            System.out.println("Print the value of z["+i+"]=" + z[i]);

        }
    }
}
