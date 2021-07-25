import java.util.Arrays;

/******************************************************************************

 Write a program to find the maximum product of any three integers in an array.

 Input : {12, 34, 7, 6, 8, 1}
 Output: 3264
 *******************************************************************************/

public class MaxProductOfThree {

    public static void maxProductOfThree(int[] arr) {
        Arrays.sort(arr);
        int[] output = Arrays.copyOfRange(arr, arr.length - 3, arr.length);
        System.out.println("The 3 elements giving maximum product are: " + Arrays.toString(output));
        System.out.println("The maximum produc of three is : " + output[0] * output[1] * output[2]);
    }

    public static void main(String[] args) {
        int[] input = {12, 34, 7, 6, 8, 1};
        maxProductOfThree(input);
    }

}
