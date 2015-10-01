package yawnlon.algorithms;

/**
 * Related to question Excel Sheet Column Title
 * 
 * Given a column title as appear in an Excel sheet, return its corresponding
 * column number.
 * 
 * For example:
 * 
 * A -> 1 B -> 2 C -> 3 ... Z -> 26 AA -> 27 AB -> 28
 *
 *
 */

public class P171 {

	public static void main(String[] args) {
		System.out.println(titleToNumber("AA"));
	}

	static public int titleToNumber(String s) {
		int l = s.length();
		int result = 0;
		for (int i = 0; i < l; i++) {
			char c = s.charAt(l - 1 - i);
			result += toInt(c) * Math.pow(26, i);
		}
		return result;
	}

	static int toInt(char A) {
		return A - 'A' + 1;
	}
}
