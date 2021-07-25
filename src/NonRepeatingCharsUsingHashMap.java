import java.util.HashMap;

/******************************************************************************

 Write a program to find non-repeating characters from a string.

 Input : "this is a sample java program"
 Output:
 t
 h
 l
 e
 j
 v
 o
 g
 *******************************************************************************/

public class NonRepeatingCharsUsingHashMap {
    public static void findNonRepeatingChars(String input) {
        HashMap<Character, Boolean> map = new HashMap<>();
        for (char ch : input.toCharArray()) {
            map.computeIfPresent(ch, (key, val) -> true); // Updates as true if it is repeating
            map.putIfAbsent(ch, false);
        }
        System.out.println("Non-repeating characters in the string: ");
        for (char ch : map.keySet()) {
            if (!map.get(ch)) {
                System.out.println(ch);
            }
        }
    }

    public static void main(String[] args) {
        String input = "This is a sample java program";
        input = input.replaceAll(" ", "");
        findNonRepeatingChars(input);
    }
}
