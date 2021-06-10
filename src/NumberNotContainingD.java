/******************************************************************************

 Write a program to find the closest number not containing a given digit 'D' from a given number.
 Input : 1221, 2
 Output: 1999
 *******************************************************************************/


public class NumberNotContainingD {

    public static boolean containsD(int number, int digit) {
        while (number > 0) {
            if (number % 10 == digit) return true;
            number = number / 10;
        }
        return false;
    }

    public static int closestNumNotContainingD(int number, int digit) {
        int output = -1;
        if (!containsD(number, digit)) return number;
        for (int i = 1; output < 0; i++) {
            if (!containsD(number + i, digit)) {
                output = number + i;
                break;
            }
            if (!containsD(number - i, digit)) {
                output = number - i;
                break;
            }
        }
        return output;
    }

    public static void main(String[] args) {
        int inputNum = 1221;
        int digit = 2;
        int output = closestNumNotContainingD(inputNum, digit);
        System.out.println("Closest number not containing given digit is : " + output);
    }
}
