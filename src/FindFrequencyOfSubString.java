import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


/******************************************************************************

 Given a string, find the number of occurrences of a substring in that string.
 Input : 100110010100, 100
 Output: 3
 *******************************************************************************/

public class FindFrequencyOfSubString {
    public static void main(String[] args) {
        String input = "10011001010010101";
        String substring = "101";
        System.out.println("Number of occurrences of substring is: " + findNumberOfOccurrences(input, substring));
    }

    public static int findNumberOfOccurrences(String input, String substring) {
        ArrayList<String> matches = new ArrayList<>();
        Matcher matcher;
        //Here we are implementing this using regex pattern matching. Instead of pattern we are directly giving the substring
        matcher = Pattern.compile(substring).matcher(input);
        while (matcher.find()) {
            matches.add(matcher.group());
        }
        return matches.size();
    }
}
