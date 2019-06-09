package Recursion;
/*

7. Reverse Integer

Given a 32-bit signed integer, reverse digits of an integer.

Example 1:

Input: 123
Output: 321
Example 2:

Input: -123
Output: -321
Example 3:

Input: 120
Output: 21
 */
public class ReverseInteger {

    static int reverseNum = 0;
    static int basePos = 1;

    public static void main(String args[]) {
        int num = 123;
        reverseIntWhile(num);
    }

    /*
        Time Complexity O(Log(n))
     */
    public static void reverseInt(int num) {

        if ( num < 10) {
            System.out.print(num);
            return;
        } else {
            System.out.print(num % 10);
            reverseInt(num / 10);
        }

    }
    /*
            Time Complexity O(Log(n))
         */
    public static void reverseIntWhile(int num) {
        int reverseNum = 0;

        while (num != 0) {
            reverseNum = reverseNum * 10;
            reverseNum = reverseNum + num % 10;
            num = num / 10;
        }
       System.out.println("Reverse number is::"+reverseNum);

    }
}
