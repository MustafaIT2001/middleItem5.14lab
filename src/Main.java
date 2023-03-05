import java.util.Scanner;

public class Main {
    /**
     * Given a sorted list of integers, output the middle integer.
     * A negative number indicates the end of the input (the negative number is not a part of the sorted list).
     * Assume the number of integers is always odd.
     * <p>
     * Ex: If the input is:
     * <p>
     * 2 3 4 8 11 -1
     * the output is:
     * <p>
     * Middle item: 4
     * The maximum number of list values for any test case should not exceed 9.
     * If exceeded, output "Too many numbers".
     * <p>
     * Hint: First read the data into an array. Then,
     * based on the array's size, find the middle item.
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] myarr = new int[100];
        int numElements = s.nextInt();
        int i = 0;
        while (numElements >= 0) {
            myarr[i++] = numElements;
            numElements = s.nextInt();

        }
        if (i > 10) {
            System.out.println("Too many numbers");

        } else {
            int midIndex = i / 2;
            int midValue = myarr[midIndex];

            System.out.println("Middle item: " + midValue);

        }


    }
}