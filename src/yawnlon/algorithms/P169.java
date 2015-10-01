package yawnlon.algorithms;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of size n, find the majority element. The majority element is
 * the element that appears more than ⌊ n/2 ⌋ times.
 * 
 * You may assume that the array is non-empty and the majority element always
 * exist in the array.
 */

public class P169 {
	public int majorityElement(int[] nums) {
		int n = nums.length;
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			if (map.get(nums[i]) == null)
				map.put(nums[i], 1);
			else {
				map.put(nums[i], map.get(nums[i]) + 1);
			}
			if (map.get(nums[i]) > (n / 2))
				return nums[i];
		}
		return 0;
	}
}
