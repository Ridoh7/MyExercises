package myArray;

import java.util.Scanner;

public class Question2 {
    /**
     * Take 10 integer inputs from user and store them in an array. Again ask user to give a number.
     * Now, tell user whether that number is present in array or not.
     */
    public static void main(String[] args) {
        int[]z=new int[10];
        Scanner scanner=new Scanner(System.in);
        for (int i = 0; i < z.length; i++) {
            System.out.println("Print value of z["+i+"]");
            z[i]= scanner.nextInt();
        }
        for (int i = 0; i < z.length ; i++) {
            System.out.println("Print value of z["+i+"]=" + z[i]);
        }

        int input;
        System.out.println("Enter an integer");
        input= scanner.nextInt();
        boolean isFound=false;
        for (int i = 0; i < 10; i++) {
            if (input == z[i]) {
                isFound = true;
                break;
            }
        }

            if (isFound){
            System.out.println("input is present in z[i]");
        }
            else
            { System.out.println("input not present");

        }

    }
    }
