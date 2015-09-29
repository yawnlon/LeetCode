package yawnlon.algorithms;

/**
 * Write a function that takes an unsigned integer and returns the number of ’1'
 * bits it has (also known as the Hamming weight).
 * 
 * For example, the 32-bit integer ’11' has binary representation
 * 00000000000000000000000000001011, so the function should return 3.
 */

public class P191 {

	public static void main(String[] args) {
		System.out.println(hammingWeight(11));
	}

	static public int hammingWeight(int n) {
		int w = 0, i = 0;
		while (i < 32) {
			if ((n & 1) == 1)
				w++;
			n >>>= 1;
			i++;
		}
		return w;
	}
}
