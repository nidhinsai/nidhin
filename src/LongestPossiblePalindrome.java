import java.util.HashMap;

/******************************************************************************

 Write a program to find the length of longest possible palindrome from a given string.

 Input : abchellocab
 Output: 9, abclolcba
 *******************************************************************************/

public class LongestPossiblePalindrome {

    public static HashMap<Character, Integer> numberOfOccurrences(String input) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (Character ch : input.toCharArray()) {
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }
        return map;
    }

    public static void createPalindrome(String input) {
        HashMap<Character, Integer> map = numberOfOccurrences(input);
        String mid = "";
        StringBuilder sb = new StringBuilder();
        for (Character key : map.keySet()) {
            if (map.get(key) == 1) {
                mid = String.valueOf(key);
            }
            sb.append(String.valueOf(key).repeat(map.get(key) / 2));
        }
        String palindrome = sb.toString();
        palindrome += mid + sb.reverse().toString();
        System.out.println("Longest possible palindrome is : " + palindrome);
        System.out.println("Length og longest possible palindrome is : " + palindrome.length());
    }

    public static void main(String[] args) {
        String input = "abchellocab";
        createPalindrome(input);
    }

}
