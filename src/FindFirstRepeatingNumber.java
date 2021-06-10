/******************************************************************************

 Write a program to find the first element that repeats in an integer array.

 Input : {2, 6, 8, 3, 6, 3, 8}
 Output: 6
 *******************************************************************************/

public class FindFirstRepeatingNumber {

    public static boolean isRepeating(int[] inputArray, int targetNum) {
        int count = 0;
        for (int i : inputArray) {
            if (i == targetNum) {
                count++;
                if (count > 1) return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] input = {2, 6, 8, 3, 6, 3, 8};
        for (int num : input) {
            if (isRepeating(input, num)) {
                System.out.println("The first element that repeats is: " + num);
                break;
            }
        }
    }

}
