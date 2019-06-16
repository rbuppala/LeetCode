package BinarySearch;
/*
Given a sorted (in ascending order) integer array nums of n elements and a target value,
write a function to search target in nums. If target exists, then return its index, otherwise return -1.


Example 1:

Input: nums = [-1,0,3,5,9,12], target = 9
Output: 4
Explanation: 9 exists in nums and its index is 4

Example 2:

Input: nums = [-1,0,3,5,9,12], target = 2
Output: -1
Explanation: 2 does not exist in nums so return -1
 */
public class BinarySearch704E {

    public static void main(String args[]) {
        int[] nums = {-1,0,3,5,9,12};
        int target = 9;
        System.out.println(search(nums, target));
        System.out.println(binarySearch(nums,0, nums.length - 1, target));
    }

    /*
        Using while loop
        Time Complexity O(log n)
        Space Complexity
     */
    public static int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] == target) {
              return mid;
            } else if (nums[mid] < target){
                low = mid + 1;
            } else if(nums[mid] > target) {
                high = mid - 1;
            }

        }
        return -1;
    }
    /*
        Using Recursion
        Time Complexity O(Log n).
     */
    public static int binarySearch(int[] nums, int low, int high, int target) {

        if (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] == target) {
                return mid;
            }

            if (nums[mid] < target) {
               return  binarySearch(nums, mid+1, high, target);
            }

            if (nums[mid] > target) {
                return binarySearch(nums, low, mid -1, target);
            }


        }
        return -1;

    }
}
