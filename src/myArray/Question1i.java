package myArray;

import java.util.Scanner;

public class Question1i {
    /**
     * Take 10 integer inputs from user and store them in an array and print them on screen.
     */
    public static void main(String[] args) {
        int[]z=new int[10];
        Scanner scanner=new Scanner(System.in);
        for (int i = 0; i < z.length; i++) {
            System.out.println("Print the value of z["+i+"]");
            z[i]= scanner.nextByte();
        }
        for (int i = 0; i < z.length ; i++) {
            System.out.println("Print value of z["+i+"]=" + z[i]);

        }

    }
}
