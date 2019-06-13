package Arrays;

import java.util.HashMap;
import java.util.Map;

/*
136. Single Number

Given a non-empty array of integers, every element appears twice except for one. Find that single one.

Note:

Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?

Example 1:

Input: [2,2,1]
Output: 1
Example 2:

Input: [4,1,2,1,2]
Output: 4
 */
public class SingleNumber136E {

    public static void main(String args[]) {
        int[] array = {4,1,2,1,2};
        System.out.println(singleNumber(array));
        System.out.println(singleNumberXor(array));
    }

    /*
        Time Complexity O(n)
        Space Complexity O(n)
     */
    public static int singleNumber(int[] nums) {

        Map<Integer, Integer> numsMap = new HashMap<>();
        for (int i = 0; i < nums.length;i++) {
            numsMap.put(nums[i], numsMap.getOrDefault(nums[i],0) + 1);
        }
        for (int i = 0; i < nums.length; i++) {
            if(numsMap.get(nums[i]) == 1) {
                return nums[i];
            }
        }

        return -1;
    }

    /*
        Time Complexity O(n)

     */
    public static int singleNumberXor(int[] nums) {
        int result = 0;
        for(int i : nums) {
            result ^= i;
        }
        return result;
    }
}
