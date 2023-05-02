package myArray;

import java.util.Scanner;

/**
 * Take 20 integer inputs from user and print the following:
 * number of positive numbers
 * number of negative numbers
 * number of odd numbers
 * number of even numbers
 * number of 0s.
 */

public class Question3 {
    public static void main(String[] args) {
        int[] array = new int[20];
        int positive=0;
        int negative=0;
        int zero=0;
        int odd=0;
        int even=0;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.println("Print value of z [" + i + "]");
            array[i] = scanner.nextInt();

            if (array[i] > 0) {
                positive++;
            } else if (array[i] < 0) {
                negative++;
            }else if (array[i]==0)
                zero++;

            if (array[i]/2==0){
                even++;
            }else
                odd++;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println("Arrays of 20 integers are" +"z [" + i + "]=" + array[i]);
        }
        System.out.printf("""
                Positive numbers are %s
                Negative numbers are %s
                Zero numbers are %s
                even numbers are %s
                odd numbers are %s""",
                positive,negative,even,odd,zero);
    }
}

