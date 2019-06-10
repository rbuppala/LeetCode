package Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
1. Two Sum
Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

Example:

Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].
 */
public class TwoSum1E {

    public static void main(String args[]) {
        int[] nums = {2, 7, 11, 15};
        System.out.println(Arrays.toString(twoSum(nums, 17)));
        System.out.println(Arrays.toString(twoSumUsingHashMap(nums, 17)));
    }

    /*
        Method1 - Brute Force
        Time Complexity O(n2)
     */
    public static int[] twoSum(int[] nums, int target) {
        int[] indices = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    indices[0] = i;
                    indices[1] = j;
                    return indices;
                }
            }
        }
        return indices;
    }
    /*
        Time Complexity O(n)
     */
    public static int[] twoSumUsingHashMap(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> numMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (numMap.containsKey(target - nums[i])) {
                result[0] = numMap.get(target - nums[i]);
                result[1] = i;
                return result;
            } else {
                numMap.put(nums[i], i);
            }
        }
        return result;
    }
}
