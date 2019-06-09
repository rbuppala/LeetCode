package Arrays;

import java.util.Arrays;
/*
Given an array nums of n integers where n > 1,  return an array output such that
output[i] is equal to the product of all the elements of nums except nums[i].

Example:

Input:  [1,2,3,4]
Output: [24,12,8,6]
Note: Please solve it without division and in O(n).
 */
public class ProductOfArrayExceptItself238M {

    public static void main(String args[]) {
        int[] array = {1,2,3};
        productExceptSelf(array);
    }
    public static void productExceptSelf(int[] nums) {

        int n = nums.length;
        // Initialize memory to all arrays
        int[] left = new int[n];
        int[] right = new int[n];
        int[] product = new int[n];

        left[0] = 1;
        right[n - 1] = 1;

        int i, j;
        //construct left array
        for (i = 1; i < n; i++)
            left[i] = nums[i - 1] * left[i - 1];


        //construct right array
        for (j = n - 2; j >= 0; j--) {
            right[j] = nums[j + 1] * right[j + 1];
        }

        /* Construct the product array using
           left[] and right[] */
        for (i = 0; i < n; i++)
            product[i] = left[i] * right[i];

        System.out.println(Arrays.toString(left));
        System.out.println(Arrays.toString(right));
        System.out.println(Arrays.toString(product));

    }
}
