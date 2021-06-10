import java.util.Arrays;

/******************************************************************************

 Write a program to find the maximum product of any three integers in an array.

 Input : {12, 34, 12, 6, 8, 1}
 Output: 3264
 *******************************************************************************/

public class MaxProductOfThree {

    public static ReturnValues maxProduct(int[] arr) {
        int maxProduct = 0;
        int[] finalArray = new int[3];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (j == i) continue;
                for (int k = 0; k < arr.length; k++) {
                    if (k == j || k == i) continue;
                    if (arr[i] * arr[j] * arr[k] > maxProduct) {
                        maxProduct = arr[i] * arr[j] * arr[k];
                        finalArray = new int[]{arr[i], arr[j], arr[k]};
                    }
                }
            }
        }
        return new ReturnValues(maxProduct, finalArray);
    }

    public static void main(String[] args) {
        int[] inputArray = {12, 34, 12, 6, 8, 1};
        ReturnValues returnValues = maxProduct(inputArray);
        System.out.printf("Three numbers giving maximum product are: %s and maximum product is : %s", Arrays.toString(returnValues.arr), returnValues.product);
    }

    public static class ReturnValues {
        public final int product;
        public final int[] arr;

        public ReturnValues(int product, int[] arr) {
            this.product = product;
            this.arr = arr;
        }
    }
}
