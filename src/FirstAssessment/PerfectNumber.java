package FirstAssessment;

public class PerfectNumber {
    /**
     * (Perfect Numbers) An integer number is said to be a perfect number if its factors, including
     * 1 (but not the number itself), sum to the number. For example, 6 is a perfect number, because 6 =
     * 1 + 2 + 3. Write a method isPerfect that determines whether parameter number is a perfect number.
     * Use this method in an application that displays all the perfect numbers between 1 and 1000. Display
     * the factors of each perfect number to confirm that the number is indeed perfect.
     * Challenge the computing power of your computer by testing numbers much larger than 1000. Display the results.
     */
    public static boolean isPerfect(int number) {
        int sum=1;
        for (int i=2; i*i<=number; i++){
            if (number%i==0){
                if (i*i!=number)
                    sum=sum+i+number/i;
                else
                    sum=sum+i;
            }
        }
        if (sum==number && number!=1)
            return true;
        else {
        return false;

    }
    }

    public static void main(String[] args) {
        System.out.println("Perfect numbers between 1 to 1000 are:");
        for (int n=2; n<1000; n++)
            if (isPerfect(n)) {
                System.out.println(n + " is a perfect number" );
            }

    }
}
