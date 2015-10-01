package yawnlon.algorithms;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

/**
 * Given two strings s and t, write a function to determine if t is an anagram
 * of s.
 * 
 * For example, s = "anagram", t = "nagaram", return true. s = "rat", t = "car",
 * return false.
 * 
 * Note: You may assume the string contains only lowercase alphabets.
 *
 */

public class P242 {
	public static void main(String[] args) {
		System.out.println(isAnagram("anagram", "nbgaram"));
	}

	static public boolean isAnagram(String s, String t) {
		if (s.length() != t.length())
			return false;
		HashMap<Character, Integer> maps = toMap(s);
		HashMap<Character, Integer> mapt = toMap(t);
		if (!maps.get('$').equals(mapt.get('$')))
			return false;
		Iterator<Entry<Character, Integer>> it = maps.entrySet().iterator();
		while (it.hasNext()) {
			Entry<Character, Integer> en = it.next();
			char key = en.getKey();
			if (!maps.get(key).equals(mapt.get(key)))
				return false;
		}
		return true;
	}

	static HashMap<Character, Integer> toMap(String s) {
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		int total = 0;
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (map.get(c) == null) {
				total++;
				map.put(c, 1);
			} else {
				map.put(c, map.get(c) + 1);
			}
		}
		map.put('$', total);
		return map;
	}
}
