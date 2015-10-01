package yawnlon.algorithms;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of integers, find if the array contains any duplicates. Your
 * function should return true if any value appears at least twice in the array,
 * and it should return false if every element is distinct.
 */

public class P217 {
	public boolean containsDuplicate(int[] nums) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			if (map.get(nums[i]) != null)
				return true;
			map.put(nums[i], nums[i]);
		}
		return false;
	}
}
