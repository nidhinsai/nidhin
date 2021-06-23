import java.util.ArrayList;

/******************************************************************************

 Write a program to find the longest sequence of positive numbers in a given array.
 Input : {9, 12, -1, 3, 4, -9, 23, 45,21,-87, 12345, 987, -31, 10}
 Output: {23,45,21}
 *******************************************************************************/

public class FindTheLongestPositiveNumberSequence {

    public static void longestPositiveSequence(int[] inputArray) {
        ArrayList<Integer> temp = new ArrayList<>();
        ArrayList<Integer> output = new ArrayList<>();
        for (int num : inputArray) {
            if (num > 0) {
                temp.add(num);
            } else {
                if (temp.size() > output.size()) {
                    output.clear();
                    output.addAll(temp);
                }
                temp.clear();
            }
        }

        System.out.println("The longest positive sequence is : " + output.toString());
    }

    public static void main(String[] args) {
        int[] input = {9, 12, -1, 3, 4, -9, 23, 45, 21, -87, 12345, 987, -31, 10};
        longestPositiveSequence(input);
    }
}
