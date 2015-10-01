package yawnlon.algorithms;

/* 
 * Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.
 * For example:
 * Given num = 38, the process is like: 3 + 8 = 11, 1 + 1 = 2. Since 2 has only one digit, return it.
 * 
 * Follow up:
 * Could you do it without any loop/recursion in O(1) runtime?
 * */

public class P258 {
//	public static void main(String[] args) {
//		System.out.println(addDigits(99));
//	}

	// 递归方法
	public static int addDigits(int num) {
		String num_s = Integer.toString(num);
		int length = num_s.length();
		if (length == 1) {
			return num;
		} else {
			int quotient = num, remainder, dight_s = 0;
			for (int i = 0; i < length; i++) {
				remainder = quotient % 10;
				quotient = quotient / 10;
				dight_s += remainder;
			}
			return addDigits(dight_s);
		}
	}

	// 不用递归、循环，O(1)复杂度
	public static int addDigits2(int num) {
		if (num == 0)
			return 0;
		return num % 9 == 0 ? 9 : num % 9;
	}
}
