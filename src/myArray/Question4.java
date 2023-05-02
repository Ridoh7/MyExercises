package myArray;

import java.util.Scanner;

public class Question4 {
    /**
     * Take 10 integer inputs from user and store them in an array.
     * Now, copy all the elements in an another array but in reverse order.
     */

    public static void main(String[] args) {
        int[]array=new int[10];
        Scanner scanner=new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.println("Print value of  array["+i+"]");
       array[i]= scanner.nextInt();
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println("The values of array["+i+"]=" + array[i]);

        }
        System.out.println(" ");

//        int j=0;
        for (int i =array.length-1; i>=0; i--) {
            System.out.println("The values of array["+i+"]=" + array[i]);
//            j++;

        }
    }
}
