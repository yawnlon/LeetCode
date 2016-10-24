package yawnlon.algorithms;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Given an arbitrary ransom note string and another string containing letters
 * from all the magazines, write a function that will return true if the ransom
 * note can be constructed from the magazines ; otherwise, it will return false.
 * Each letter in the magazine string can only be used once in your ransom note.
 * 
 * @author yawnlon
 *
 */
public class P383 {
	public boolean canConstruct(String ransomNote, String magazine) {
		Map<Character, Integer> ms = getCharCount(ransomNote);
		Map<Character, Integer> ts = getCharCount(magazine);
		Iterator<Character> key = ms.keySet().iterator();
		while (key.hasNext()) {
			Character c = key.next();
			if (ts.get(c) == null || ms.get(c) > ts.get(c)) {
				return false;
			}
		}
        return true;
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
