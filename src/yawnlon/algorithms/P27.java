package yawnlon.algorithms;

import java.util.ArrayList;
import java.util.List;

/**
 * Given an array and a value, remove all instances of that value in place and
 * return the new length.
 * 
 * The order of elements can be changed. It doesn't matter what you leave beyond
 * the new length.
 */
public class P27 {

//	public static void main(String[] args) {
//		int[] nums = new int[] { 4, 5 };
//		int newL = removeElement(nums, 4);
//		System.out.println(nums[0]);
//	}

	public static int removeElement(int[] nums, int val) {
		int newLength = 0;
		List<Integer> list = new ArrayList<Integer>();
		for (int i : nums) {
			list.add(i);
		}

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) != val) {
				newLength++;
			} else {
				list.remove(i);
				i--;
			}
		}
		for (int i = 0; i < list.size(); i++)
			nums[i] = list.get(i);
		return newLength;
	}
	
//	Simple solution
//	public int removeElement(int[] nums, int val) {
//        int l = -1;
//        for(int i = 0;i < nums.length;i++)
//            if(nums[i] != val)
//                nums[++l] = nums[i];
//        return l + 1;
//    }
}
