import java.util.HashMap;

/******************************************************************************

 Write a program to find the length of longest possible palindrome from a given string.

 Input : abchellocab
 Output: 9, abclelcba
 *******************************************************************************/

public class LongestPossiblePalindrome {
    public static String longestPalindrome(String inputStr) {
        HashMap<Character, Integer> map = getNumberOfOccurrences(inputStr.toCharArray());
        StringBuilder sb = new StringBuilder();
        Character mid = null;
        for (char ch : map.keySet()) {
            if (map.get(ch) == 1) {
                mid = ch;
                break;
            }
        }
        for (char key : map.keySet()) {
            while (map.get(key) / 2 > 1) {
                sb.append(key);
                map.put(key, map.get(key) - 2);
            }
        }
        String left = sb.toString();
        String right = sb.reverse().toString();

        return left + mid + right;
    }

    public static HashMap<Character, Integer> getNumberOfOccurrences(char[] arr) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char target : arr) {
            for (char ch : arr) {
                if (ch == target) {
                    if (map.containsKey(target)) {
                        map.put(target, map.get(target) + 1);
                    } else {
                        map.put(ch, 1);
                    }
                }
            }
        }
        System.out.println("Hash Map : " + map.toString());
        return map;
    }

    public static void main(String[] args) {
        String input = "abchellocab";
        String output = longestPalindrome(input);
        System.out.println("Longest possible palindrome is: " + output);
        System.out.println("Length of longest possible palindrome is: " + output.length());
    }

}
