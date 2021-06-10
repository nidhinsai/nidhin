import java.util.HashSet;

/******************************************************************************

 Write a program to find the longest sequence of positive numbers in a given array.
 Input : {9, 12, -1, 3, 4, -9, 23, 45,21,-87, 12345, 987, -31, 10}
 Output: {23,45,21}
 *******************************************************************************/

public class FindTheLongestPositiveNumberSequence {

    public static void getPositiveSequence(int[] arr) {
        HashSet<Integer> tempSet = new HashSet<>();
        HashSet outputSet = new HashSet<>();
        for (int num : arr) {
            if (num > 0) {
                tempSet.add(num);
            } else {
                if (tempSet.size() > outputSet.size()) {
                    System.out.println("TempSet : ");
                    for (int a : tempSet) {
                        System.out.println(a);
                    }
                    outputSet = (HashSet) tempSet.clone();
                }
                tempSet.clear();
            }
        }
        System.out.println("Longest positive sequence: " + outputSet.toString());
    }

    public static void main(String[] args) {
        int[] input = {9, 12, -1, 3, 4, -9, 23, 45, 21, -87, 12345, 987, -31, 10};
        getPositiveSequence(input);
    }
}
