package Strings;
/*
344. Reverse String
Write a function that reverses a string. The input string is given as an array of characters char[].

Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.

Example 1:

Input: ["h","e","l","l","o"]
Output: ["o","l","l","e","h"]
Example 2:

Input: ["H","a","n","n","a","h"]
Output: ["h","a","n","n","a","H"]
 */
public class ReverseString344E {

    public static void main(String[] args) {
        String str = "NewYork";
        System.out.println(reverseString(str));
    }
    /*
        Time Complexity O(n)
     */
    public static String reverseString(String str) {
        if (str == null) return str;

        char[] charArray = str.toCharArray();
        int i = 0;
        int j = charArray.length - 1;

        while (i < j) {
            char temp = charArray[i];
            charArray[i] = charArray[j];
            charArray[j] = temp;
            i++;
            j--;
        }
        return String.valueOf(charArray);
    }
}
