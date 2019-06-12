package Arrays;
/*
Given an integer array nums, find the contiguous subarray (containing at least one number)
 which has the largest sum and return its sum.

Example:

Input: [-2,1,-3,4,-1,2,1,-5,4],
Output: 6
Explanation: [4,-1,2,1] has the largest sum = 6.
 */
public class MaximumSubArray53E {

    public static void main(String args[]) {
        int[] numsArray = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(numsArray));
    }

    public static int maxSubArray(int[] nums) {
        int maxSoFar = nums[0];
        int maxEndingHere = nums[0];
        for (int i = 1; i < nums.length; i++) {
            maxEndingHere= Math.max(maxEndingHere+nums[i],nums[i]);
            maxSoFar=Math.max(maxSoFar, maxEndingHere);
            System.out.println(" For i"+i+"maxEndingHere"+ maxEndingHere +"maxSoFar "+maxSoFar);
        }
        return maxSoFar;
    }
}
