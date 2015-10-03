package yawnlon.algorithms;

import java.util.HashMap;

/**
 * Write an algorithm to determine if a number is "happy".
 * 
 * A happy number is a number defined by the following process: Starting with
 * any positive integer, replace the number by the sum of the squares of its
 * digits, and repeat the process until the number equals 1 (where it will
 * stay), or it loops endlessly in a cycle which does not include 1. Those
 * numbers for which this process ends in 1 are happy numbers.
 */

public class P202 {

	public static void main(String[] args) {
		int n = 2;
		for (int i = 0; i < 10; i++) {
			n = doSquare(n);
			System.out.print(n + " ");
		}
	}

	public boolean isHappy(int n) {
		HashMap<Integer, Integer> map = new HashMap<>();
		while (true) {
			map.put(n, n);
			n = doSquare(n);
			if (n == 1)
				return true;
			if (map.get(n) != null)
				return false;
		}
	}

	static public int doSquare(int n) {
		String s = Integer.toString(n);
		int result = 0;
		for (int i = 0; i < s.length(); i++) {
			int dight = s.charAt(i) - '0';
			result += dight * dight;
		}
		return result;
	}
}
