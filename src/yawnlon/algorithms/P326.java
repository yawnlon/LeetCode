package yawnlon.algorithms;

/**
 * 
 * Given an integer, write a function to determine if it is a power of three.
 * Follow up: Could you do it without using any loop / recursion?
 *
 */

public class P326 {
	public boolean isPowerOfThree(int n) {
		if (n <= 0)
			return false;
		double log = Math.log10(n) / Math.log10(3);
		return log % 1 == 0;
	}
}
