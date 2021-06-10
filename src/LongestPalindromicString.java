/******************************************************************************

 Write a program to find the longest palindromic substring of a given string.

 Input : bananas
 Output: anana
 *******************************************************************************/

public class LongestPalindromicString {

    public static boolean isPalindrome(String str) {
        int midIndex = str.length() / 2;
        String left = str.substring(0, midIndex);
        String reverseStr = new StringBuilder(str).reverse().toString();
        String right = reverseStr.substring(0, midIndex);
        return left.equals(right);
    }

    public static void printLongestPalindrome(String input) {
        String output = "";
        for (int i = 0; i < input.length(); i++)
            for (int j = input.length(); j > i; j--) {
                String subStr = input.substring(i, j);
                if (isPalindrome(subStr) && subStr.length() > output.length()) {
                    output = subStr;
                }
            }
        System.out.println("The longest palindromic substring is : " + output);
    }

    public static void main(String[] args) {
        String input = "bananas";
        printLongestPalindrome(input);
    }
}
