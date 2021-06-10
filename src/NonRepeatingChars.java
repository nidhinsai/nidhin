/******************************************************************************

 Write a program to find non-repeating characters from a string.

 Input : "This is a sample java program"
 Output:
 T
 h
 l
 e
 j
 v
 o
 g
 *******************************************************************************/

public class NonRepeatingChars {
    public static String singleOccurrence(String inputString) {
        char[] inputArray = inputString.toCharArray();
        StringBuilder outputStr = new StringBuilder();
        for (char ch : inputArray) {
            if (numberOfOccurrences(inputArray, ch) == 1) {
                outputStr.append(ch);
            }
        }
        return outputStr.toString();
    }

    public static int numberOfOccurrences(char[] arr, char target) {
        int count = 0;
        for (char c : arr) {
            if (c == target) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        String input = "This is a sample java program";
        String output = singleOccurrence(input);
        System.out.println("Characters that occur only once in the given string: ");
        for (int i = 0; i < output.length(); i++) {
            System.out.println(output.charAt(i));
        }
    }
}
