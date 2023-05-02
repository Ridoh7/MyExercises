package myArray;

import java.util.Scanner;

public class Question7 {

    /**
     * Find largest and smallest elements of an array.
     */
    public static void main(String[] args) {
        int [] array=new int[10];
        Scanner scanner= new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.println("Print the value of " + "z["+i+"]");
            array[i]= scanner.nextInt();
        }
        int greatest=array[0];
        int smallest=array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i]>greatest)
                greatest=array[i];
            if (array[i]<smallest)
                smallest=array[i];
        }
        System.out.println("greatest is " +greatest + " smallest is " +smallest );
    }
}
