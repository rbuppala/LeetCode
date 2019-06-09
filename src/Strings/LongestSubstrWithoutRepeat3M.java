package Strings;

import java.util.HashSet;
import java.util.Set;
/*
    3. Longest Substring Without Repeating Characters
    Given a string, find the length of the longest substring without repeating characters.

Example 1:

Input: "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
Example 2:

Input: "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
 */
public class LongestSubstrWithoutRepeat3M {

    public static void main(String args[]) {
        String str = "Raja";
        System.out.println(lengthOfLongestSubstring(str));
    }

    public static int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int ans = 0, i = 0, j = 0;
        Set<Character> charSet = new HashSet<Character>();
        while ( i < n && j < n) {
            if (!charSet.contains(s.charAt(j))) {
                charSet.add(s.charAt(j++));
                ans = Math.max(ans, j - i);

            } else {
                charSet.remove(s.charAt(i++));
            }
        }
        return ans;
    }
}
