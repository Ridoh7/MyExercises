package myArray;

public class Question6 {
    /**Initialize and print all elements of a 2D array.
     *
     */
    public static void main(String[] args) {
        int [][]array={{2,3,5},{6,7,9},{1,0,7}};
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();

        }
    }
}
