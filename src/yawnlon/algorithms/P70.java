package yawnlon.algorithms;

/**
 * You are climbing a stair case. It takes n steps to reach to the top.
 * 
 * Each time you can either climb 1 or 2 steps. In how many distinct ways can
 * you climb to the top?
 */
public class P70 {

//	public static void main(String[] args) {
//		System.out.print(climbStairs(44));
//	}

	static public int climbStairs(int n) {
		// 递归会超时，用通项公式直接求解
		int a0 = 1, a1 = 1;
		int result = a1;
		for (int i = 1; i < n; i++) {
			result += a0;
			a0 = a1;
			a1 = result;
		}
		return result;
		// return climbStairs(n - 1) + climbStairs(n - 2);
	}
}
