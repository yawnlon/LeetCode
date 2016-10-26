package yawnlon.algorithms;

/**
 * Say you have an array for which the ith element is the price of a given stock
 * on day i.
 * 
 * Design an algorithm to find the maximum profit. You may complete at most two
 * transactions.
 * 
 * Note: You may not engage in multiple transactions at the same time (ie, you
 * must sell the stock before you buy again).
 * 
 * @author yawnlon
 *
 */
public class P123 {
	public int maxProfit(int[] prices) {
		int pl = prices.length;
		if (pl <= 1)
			return 0;
		int start = 0;
		int end = 0;
		
		return 0;
	}

	public int subMaxProfit(int[] prices, int i, int j) {
		int min = prices[i];
		int max = 0;
		for (int k = i + 1; k < j; k++) {
			int dif = prices[k] - min;
			if (dif > max)
				max = dif;
			if (prices[k] < min)
				min = prices[k];
		}
		return max;
	}
}
