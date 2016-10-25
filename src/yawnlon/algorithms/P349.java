package yawnlon.algorithms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/**
 * Given two arrays, write a function to compute their intersection. Example:
 * Given nums1 = [1, 2, 2, 1], nums2 = [2, 2], return [2].
 * 
 * Note: Each element in the result must be unique. The result can be in any
 * order.
 * 
 * @author yawnlon
 *
 */
public class P349 {

	public int[] intersection(int[] nums1, int[] nums2) {
		HashSet<Integer> set1 = new HashSet<>();
		HashSet<Integer> set2 = new HashSet<>();
		for (int num : nums1) {
			set1.add(num);
		}
		for (int num : nums2) {
			set2.add(num);
		}

		List<Integer> list = new ArrayList<>();
		if (set1.size() > set2.size()) {
			Iterator<Integer> iterator = set2.iterator();
			while (iterator.hasNext()) {
				Integer integer = iterator.next();
				if (set1.contains(integer)) {
					list.add(integer);
				}
			}
		} else {
			Iterator<Integer> iterator = set1.iterator();
			while (iterator.hasNext()) {
				Integer integer = iterator.next();
				if (set2.contains(integer)) {
					list.add(integer);
				}
			}
		}

		int[] result = new int[list.size()];
		for (int i = 0; i < list.size(); i++) {
			result[i] = list.get(i);
		}
		return result;
	}
}
