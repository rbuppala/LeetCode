package BitManipulation;
/*
    136. Single Number

    Given a non-empty array of integers, every element appears twice except for one. Find that single one.

    Example 1:

    Input: [2,2,1]
    Output: 1
    Example 2:

    Input: [4,1,2,1,2]
    Output: 4

    We can use Xor based product...

    0 ^ 0 = 0
    1 ^ 1 = 0
    0 ^ 1 = 1
    1 ^ 0 = 1

    int[] array ={2,2,1};

    0010 ^ 0010 = 0000
    0000 ^ 0001 = 0001

 */
public class SingleNumber136E {

    public static void main(String args[]) {
        int[] array ={2,2,1};
        System.out.println(singleNumber(array));
    }

    static int singleNumber(int[] array) {
        int result = 0;
        for (Integer num : array) {
            result ^= num;
        }
        return result;
    }
}
