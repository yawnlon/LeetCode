package yawnlon.algorithms;

/**
 * Given two non-negative numbers num1 and num2 represented as string, return
 * the sum of num1 and num2.
 * 
 * Note:
 * 
 * The length of both num1 and num2 is < 5100. Both num1 and num2 contains only
 * digits 0-9. Both num1 and num2 does not contain any leading zero. You must
 * not use any built-in BigInteger library or convert the inputs to integer
 * directly.
 * 
 * @author yawnlon
 *
 */
public class P415 {

	// public static void main(String[] args) {
	// System.out.println(addStrings("6913259244", "71103343"));
	// }

	public static String addStrings(String num1, String num2) {
		int flag = 0;
		int l1 = num1.length();
		int l2 = num2.length();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < Math.max(num1.length(), num2.length()); i++) {
			int i1 = i >= l1 ? 0 : num1.charAt(l1 - 1 - i) - '0';
			int i2 = i >= l2 ? 0 : num2.charAt(l2 - 1 - i) - '0';
			int s = i1 + i2 + flag;
			flag = s / 10;
			sb.append(s % 10);
		}
		if (flag == 1)
			sb.append('1');
		return sb.reverse().toString();
	}
}
