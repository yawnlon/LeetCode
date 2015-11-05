package yawnlon.algorithms;

/**
 * Given an integer, write a function to determine if it is a power of two.
 */
public class P231 {
	public boolean isPowerOfTwo(int n) {
		if (n <= 0)
			return false;
		if (n == 1)
			return true;
		if (n % 2 != 0)
			return false;
		return isPowerOfTwo(n / 2);
	}
}
