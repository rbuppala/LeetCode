package Strings;

import java.util.LinkedHashMap;
import java.util.Map;
/*
    Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.

    Examples:

    s = "leetcode"
    return 0.

    s = "loveleetcode",
    return 2.
    Note: You may assume the string contain only lowercase letters.
 */
public class FirstUniqueCharacter387E {

    public static void main(String args[]) {
        String str = "ramana";
        System.out.println(firstUniqueChar(str));
    }

    /*
        Time Complexity O(n)
        Space Complexity O(n)
     */
    public static int firstUniqueCharacter(String str) {
        if (str == null || str.length() == 0) return -1;
        Map<Character, Integer> map = new LinkedHashMap<>();

        for ( int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) +1 );
        }

        for (int i = 0; i < map.size(); i++) {
            if(map.get(str.charAt(i)) == 1) {
                return i;
            }
        }
        return -1 ;
    }
    /*
        Time Complexity O(n)
     */
    public static int firstUniqueChar(String str) {
        int[] count = new int[26];

        for (char ch: str.toCharArray()) {
            count[ch - 'a']++;
        }
        int i = 0;

        for (char ch: str.toCharArray()) {
            if (count[ch - 'a'] == 1) {
                return i;
            }
            i++;
        }
        return -1;
    }
 }
