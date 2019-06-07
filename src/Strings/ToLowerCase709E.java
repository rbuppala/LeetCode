package Strings;
/*
    709. To Lower Case
    Implement function ToLowerCase709E() that has a string parameter str, and returns the same string in lowercase.

    ASCII value of 'A' is 65 and the ASCII value of 'a' is 97, so 65+97=32

    A-Z 65-90
    a-z 97-122

    Example 1:

    Input: "Hello"
    Output: "hello"

    Example 2:

    Input: "here"
    Output: "here"

    Example 3:

    Input: "LOVELY"
    Output: "lovely"

    Time Complexity : O(n)
    Space Complexity: O(1)
 */
public class ToLowerCase709E {

    public static void main(String args[]) {
        String str = "World";
        System.out.println(toLowerCase(str));
        System.out.println(toLowerCaseASCII(str));
    }

    public static String toLowerCase(String str) {
        char[] charArray = str.toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] >= 'A' && charArray[i] <= 'Z') {
                charArray[i] += 32;
            }
        }
        return String.valueOf(charArray);
    }

    public static String toLowerCaseASCII(String str) {
        char[] charArray = str.toCharArray();
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < charArray.length; i++) {
            int ascii = (int) charArray[i];
            if (ascii >= 65 && ascii <= 90) {
                builder.append( (char) (ascii + 32));
            } else {
                builder.append(charArray[i]);
            }
        }
        return builder.toString();
    }

}
