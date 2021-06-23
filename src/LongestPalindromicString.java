/******************************************************************************

 Write a program to find the longest palindromic substring of a given string.

 Input : bananas
 Output: anana
 *******************************************************************************/

public class LongestPalindromicString {

    public static boolean isPalindrome(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString().equals(str);
    }

    public static void printLongestPalindrome(String input) {
        String output = "";
        for (int i = 0; i < input.length(); i++) {
            for (int j = input.length(); j > i; j--) {
                String temp = input.substring(i, j);
                if (isPalindrome(temp) && temp.length() > output.length()) {
                    output = temp;
                }
            }
        }
        System.out.println("Longest palindromic substring is : " + output);
    }

    public static void main(String[] args) {
        String input = "bananas";
        printLongestPalindrome(input);
    }
}
