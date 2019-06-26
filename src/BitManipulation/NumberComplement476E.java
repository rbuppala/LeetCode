package BitManipulation;
/*
    476. Number Complement

    Given a positive integer, output its complement number.
    The complement strategy is to flip the bits of its binary representation.

    Example 1:
    Input: 5
    Output: 2
    Explanation: The binary representation of 5 is 101 (no leading zero bits), and its complement is 010.
    So you need to output 2.

    The signed left shift operator "<<" shifts a bit pattern to the left,
    and the signed right shift operator ">>" shifts a bit pattern to the right.

    0000 | 0001 -> 0001 (1)
    0010 | 0001 -> 0011 (3)
    0110 | 0001 -> 0111 (7)

    0111 (7) - 0101 (5) = 0010 (2)
 */
public class NumberComplement476E {

    public static void main(String args[]) {
        int num = 5;
        System.out.println(" Given Number .."+ Integer.toBinaryString(num)+ "Num Complement ..."+
                Integer.toBinaryString(findComplement(num)));
    }

    public static int findComplement(int num) {
       int n = 0;
        while (n < num) {
            n = (n << 1) | 1;
        }
        return n - num;
    }
}
