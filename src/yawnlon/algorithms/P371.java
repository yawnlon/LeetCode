package yawnlon.algorithms;

/**
 * Calculate the sum of two integers a and b, but you are not allowed to use the
 * operator + and -. Example: Given a = 1 and b = 2, return 3.
 * 
 * @author yawnlon
 *
 */
public class P371 {

//	public static void main(String[] args) {
//		System.out.println(getSum(1, -1));
//	}

	public static int getSum(int a, int b) {
		if (a == 0)
			return b;
		if (b == 0)
			return a;

		char[] as = printBinaryInt(a);
		char[] bs = printBinaryInt(b);

		char[] result = new char[Math.max(as.length, bs.length)];
		char[] add = new char[Math.max(as.length, bs.length)];

		for (int i = 1; i < result.length; i++) {
			int ac = as.length - i >= 0 ? as[as.length - i] - '0' : 0;
			int bc = bs.length - i >= 0 ? bs[bs.length - i] - '0' : 0;
			add[add.length - i] = (char) (ac & bc + '0');
			if (i == 1)
				result[add.length - i] = (char) (ac ^ bc + '0');
			else
				result[add.length - i] = (char) (ac ^ bc ^ add[add.length + 1 - i] + '0');
		}
		return Integer.parseInt(String.valueOf(result), 2);
	}

	static char[] printBinaryInt(int i) {
		char[] result = new char[32];
		for (int j = 31; j >= 0; j--)
			if (((1 << j) & i) != 0)
				result[31- j] = '1';
			else
				result[31- j] = '0';
		return result;
	}
}
