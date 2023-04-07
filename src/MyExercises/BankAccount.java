package MyExercises;

import java.util.Scanner;

public class BankAccount {
    public static void main(String[] args) {
        String firstName; String middleName; String lastName;
        String accountNumber;
        String USSD;
        String pin;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your First Name");
        firstName= scanner.nextLine();

        System.out.println("Enter your Middle Name");
        middleName= scanner.nextLine();

        System.out.println("Enter your Last Name");
        lastName= scanner.nextLine();


        String accountName;
        accountName=firstName+" "+middleName+" "+lastName;

        System.out.println("Enter your account number");
        accountNumber=scanner.nextLine();

        System.out.println("Enter your USSD");
        USSD=scanner.nextLine();

        System.out.println("Enter your pin");
        pin= scanner.nextLine();

        System.out.printf("""
                Congrats! Your account has been created successfully
                Your account name is %S
                Your account number is %s
                Your USSD is %s
                Your account Pin is %s,
                """,accountName, accountNumber, USSD, pin);
    }
}
