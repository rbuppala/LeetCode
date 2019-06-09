package Arrays;

import java.util.Arrays;

/*
Given an array of integers A sorted in non-decreasing order, return an array of the squares of each number,
 also in sorted non-decreasing order.



Example 1:

Input: [-4,-1,0,3,10]
Output: [0,1,9,16,100]
Example 2:

Input: [-7,-3,2,3,11]
Output: [4,9,9,49,121]
 */
public class SquaresOfSortedArray977E {

    public static void main(String args[]) {
        int[] array = {-4,-1,0,3,10};
        System.out.println(Arrays.toString(sortedSquares(array)));
    }

    static int[] getSquaredArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] * array[i];
        }
        Arrays.sort(array);
        return array;
    }

    public static int[] sortedSquares(int[] A) {
        int n = A.length;
        int lower = 0,higher = n-1;
        int solution[] = new int[n];
        for(int i = n-1;i >= 0; i--)
        {
            if(Math.abs(A[lower]) > Math.abs(A[higher]))
                solution[i] = A[lower] * A[lower++];
            else
                solution[i] = A[higher] * A[higher--];
        }
        return solution;
    }


}
