package yawnlon.algorithms;

/**
 * Given an integer n, return the number of trailing zeroes in n!.
 * 
 * Note: Your solution should be in logarithmic time complexity.
 * 
 * @author yawnlon
 *
 */
public class P172 {
	public int trailingZeroes(int n) {
		int numOfPrime2 = 0, numOfPrime5 = 0;
		for (int i = 2; i <= n; i++) {
			numOfPrime2 += numOfPrime(i, 2);
			numOfPrime5 += numOfPrime(i, 5);
		}
		return Math.min(numOfPrime2, numOfPrime5);
	}

	public int numOfPrime(int n, int prime) {
		int s = 0, r = 0;
		int q = n;
		while (r != 0) {
			r = q % prime;
			q = q / prime;
			if (r == 0)
				s++;
		}
		return s;
	}
}
