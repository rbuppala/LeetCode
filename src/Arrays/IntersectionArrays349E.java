package Arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class IntersectionArrays349E {

    public static void main(String args[]) {

        int[] num1 = {1,2,2,1};
        int[] num2 = {2,2};

        System.out.println(Arrays.toString(intersection(num1, num2)));
    }

    /*
        Time Complexity O(n)
     */
    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> numSet = new HashSet<>();
        Set<Integer> intersections = new HashSet<>();
        for (Integer num: nums1) {
            numSet.add(num);
        }

        for (Integer num: nums2) {
            if (numSet.contains(num)) {
                intersections.add(num);
            }
        }

        return intersections.stream().mapToInt(k-> k).toArray();
    }
}
