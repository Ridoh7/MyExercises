package FirstAssessment;

import java.util.Scanner;

public class ReversingDigits {
    public static void main(String[] args) {
        int number;
        int reverse=0;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter digit");
        number= input.nextInt();

        while (number!=0) {
            int remainder=number%10;
            reverse=reverse*10+remainder;
            number=number/10;
        }
        System.out.println("The reverse of the digit is: " + reverse);
    }

}
