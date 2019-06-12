package BackTracking;

import java.util.Arrays;

public class StringPermutations {

    public static void main(String args[]) {
        String str = "abc";
        char[] charArray = str.toCharArray();
        permutations(charArray, 0, charArray.length);
    }

    static void permutations(char[] charArray, int left, int size) {
        if (left == size) {
            for (int i = 0; i < charArray.length; i++) {
                System.out.print(charArray[i]);
            }
            System.out.print(" ");
        } else {
            for (int x = left; x < size; x++) {
                swap(charArray, left, x);
                permutations(charArray, left + 1, size);
                swap(charArray, left, x);
            }
        }
    }

    static void swap(char[] charArray, int i, int j) {
        char temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
    }
}
