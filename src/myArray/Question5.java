package myArray;

public class Question5 {
    /**
     * Write a program to find the sum and product of all elements of an array.
     */

    public static void main(String[] args){
        int[] array={1,3,4,6,8,9,0,7,53,5,6,7};
        int sum=0;
        int counter;
        for (counter = 0; counter< array.length; counter++) {
            sum += array[counter];
        }
            System.out.println("total sum of array is " + sum);

        for (int number:array){
            number+=sum;
        }
            System.out.println("total number of array is " + sum);
    }
}
