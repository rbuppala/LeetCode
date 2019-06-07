package Strings;

import java.util.Arrays;

/*
    242. Valid Anagram

    Given two strings s and t , write a function to determine if t is an anagram of s.

    An anagram is produced by rearranging the letters of ss into tt.
    Therefore, if tt is an anagram of ss, sorting both strings will result in two identical strings.
     Furthermore, if ss and tt have different lengths, tt must not be an anagram of ss and we can return early.
 */
public class Anagrams242E {

    public static void main(String args[]) {
        String s = "car";
        String t = "rac";
        System.out.println(isAnagram(s, t));
        System.out.println(isAnagrams(s, t));
        System.out.println(isAnagramss(s, t));
    }

    /*
        Time complexity : O(nlogn)
        Space complexity : O(1)
     */
    public static boolean isAnagram(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        return Arrays.equals(charArray1, charArray2);
    }

    /*
        Time Complexity O(n)
        Space Complexity O(n)
     */
    public static boolean isAnagrams(String str1, String str2) {
        if (str1.length() != str2.length())  return false;
        int[] asciiSet = new int[256];

        for (char c : str1.toCharArray()) {
            asciiSet[c]++;
        }

        for (char c: str2.toCharArray()) {
            if (asciiSet[c]-- == 0) return false;
        }
        return true;
    }
    /*
            Time Complexity O(n)
     */
    public static boolean isAnagramss(String str1, String str2) {

        if (str1 == null || str2 == null || str1.length()!= str2.length()) {
            return false;
        }

        int[] str1Ascii = new int[128];
        int[] str2Ascii = new int[128];

        for (char c: str1.toCharArray()) str1Ascii[c]++;
        for (char c: str2.toCharArray()) str2Ascii[c]++;

        return Arrays.equals(str1Ascii, str2Ascii);

    }
}
