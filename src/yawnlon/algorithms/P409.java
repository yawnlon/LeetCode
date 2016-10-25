package yawnlon.algorithms;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class P409 {

	public int longestPalindrome(String s) {
		Map<Character, Integer> ms = getCharCount(s);
		Iterator<Integer> values = ms.values().iterator();
		int result = 0;
		boolean flag = true;
		while (values.hasNext()) {
			int value = values.next();
			if (value % 2 == 0) {
				result += value;
			} else if (flag) {
				result += value;
				flag = false;
			} else {
				result += (value - 1);
			}
		}
		return result;
	}

	public static Map<Character, Integer> getCharCount(String s) {
		Map<Character, Integer> map = new HashMap<>();
		if (s != null) {
			for (int i = 0; i < s.length(); i++) {
				char c = s.charAt(i);
				if (map.get(c) == null) {
					map.put(c, 1);
				} else {
					map.put(c, map.get(c) + 1);
				}
			}
		}
		return map;
	}
}
