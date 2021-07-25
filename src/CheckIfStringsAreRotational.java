/******************************************************************************

 Given two strings. Check if the second string is rotational string of the other. Eg. "welcome" and "comewel".
 *******************************************************************************/

public class CheckIfStringsAreRotational {
    public static void main(String[] args) {
        String str1 = "welcome";
        String str2 = "comewel";
        System.out.println("The strings are rotational: " + isRotational(str1, str2));
    }

    public static boolean isRotational(String str1, String str2) {
        if (str1.length() != str2.length())
            return false;
        return (str2 + str2).contains(str1);
    }
}
