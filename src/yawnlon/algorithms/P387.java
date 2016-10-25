package yawnlon.algorithms;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Given a string, find the first non-repeating character in it and return it's
 * index. If it doesn't exist, return -1.
 * 
 * @author yawnlon
 *
 */
public class P387 {

	public int firstUniqChar(String s) {
		Map<Character, MChar> ms = getCharCount(s);
		Iterator<MChar> values = ms.values().iterator();
		int result = Integer.MAX_VALUE;
		while (values.hasNext()) {
			MChar value = values.next();
			if (value.count == 1 && value.index < result) {
				result = value.index;
			}
		}
		if (result == Integer.MAX_VALUE)
			return -1;
		return result;
	}

	public Map<Character, MChar> getCharCount(String s) {
		Map<Character, MChar> map = new HashMap<>();
		if (s != null) {
			for (int i = 0; i < s.length(); i++) {
				char c = s.charAt(i);
				if (map.get(c) == null) {
					map.put(c, new MChar(1, i));
				} else {
					map.get(c).count++;
				}
			}
		}
		return map;
	}

	class MChar {
		public MChar(int count, int index) {
			this.count = count;
			this.index = index;
		}

		public int count;
		public int index;
	}
}
