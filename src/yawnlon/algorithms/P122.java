package yawnlon.algorithms;

/**
 * Say you have an array for which the ith element is the price of a given stock
 * on day i.
 * 
 * Design an algorithm to find the maximum profit. You may complete as many
 * transactions as you like (ie, buy one and sell one share of the stock
 * multiple times). However, you may not engage in multiple transactions at the
 * same time (ie, you must sell the stock before you buy again).
 * 
 * @author yawnlon
 *
 */
public class P122 {

	public int maxProfit(int[] prices) {
		int pl = prices.length;
		if (pl <= 1)
			return 0;
		int sum = 0;
		for (int i = 0; i < pl - 1; i++) {
			int dif = prices[i + 1] - prices[i];
			if (dif > 0)
				sum += dif;
		}
		return sum;
	}
}
