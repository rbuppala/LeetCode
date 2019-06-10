package Arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate217E {

    public static void main(String args[]) {
        int[] array = {1,3,5,8,6,4};
        System.out.println(containsDuplicate(array));
        System.out.println(containsDuplicateSort(array));
        System.out.println(containsDuplicateNestedLoop(array));
    }

    /*
        Time Complexity O(n)
     */
    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> numsSet = new HashSet<>();
        for (Integer num: nums){
            if (numsSet.contains(num)) {
                return true;
            } else {
                numsSet.add(num);
            }
        }
        return false;
    }

    /*
    Time complexity : O(nlogn).
     */
    public static boolean containsDuplicateSort(int[] nums) {

        Arrays.sort(nums);

        for (int i = 0; i < nums.length -1; i++) {
            if (nums[i] == nums[i+1]) {
                return true;
            }
        }
        return false;
    }

    /*
    Time complexity : O(n2)
     */
    public static boolean containsDuplicateNestedLoop(int[] nums) {

       for (int i = 0; i < nums.length -1; i++) {
           for (int j = 0; j < i; j++) {
               if (nums[i] == nums[j]) {
                    return true;
               }
           }
       }
       return false;
    }
}
