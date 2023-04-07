package MyExercises;

import java.util.Scanner;

public class PositiveNegativeZero {
    /**
     * (Negative, Positive and Zero Values) Write a program that inputs five numbers and determines
     * and prints the number of negative numbers input, the number of positive numbers input and
     * the number of zeros input
     */
    public static void main(String[] args) {
        int numb1; int  numb2; int numb3; int numb4; int numb5;
        int positive=0; int negative =0; int zero=0;

        Scanner input=new Scanner(System.in);

        System.out.println("Enter first num");
        numb1= input.nextInt();

        System.out.println("Enter second num");
        numb2= input.nextInt();

        System.out.println("Enter third num");
        numb3= input.nextInt();

        System.out.println("Enter forth num");
        numb4= input.nextInt();

        System.out.println("Enter fifth num");
        numb5= input.nextInt();

        if (numb1>0)
            positive=positive+1;

        if (numb2>0)
            positive=positive+1;

        if (numb3>0)
            positive=positive+1;

        if (numb4>0)
            positive=positive+1;

        if (numb5>0)
            positive=positive+1;

        if (numb1<0)
            negative=negative+1;

        if (numb2<0)
            negative=negative+1;

        if (numb3<0)
            negative=negative+1;

        if (numb4<0)
            negative=negative+1;

        if (numb5<0)
            negative=negative+1;

        if (numb1==0)
            zero=zero+1;

        if (numb2==0)
            zero=zero+1;

        if (numb3==0)
            zero=zero+1;

        if (numb4==0)
            zero=zero+1;

        if (numb5==0)
            zero=zero+1;

        System.out.printf("Number of positive input is: %d", positive);
        System.out.printf("\nNumber of negative input is: %d", negative);
        System.out.printf("\nNumber of zero input is: %d", zero);

    }
}
