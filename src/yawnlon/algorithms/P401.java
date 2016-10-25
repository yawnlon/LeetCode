package yawnlon.algorithms;

import java.util.ArrayList;
import java.util.List;

public class P401 {

//	public static void main(String[] args) {
//		List<String> result = readBinaryWatch(0);
//		for (String s : result) {
//			System.out.print(s + " ");
//		}
//	}

	public List<String> readBinaryWatch(int num) {
		List<String> list = new ArrayList<>();
		for (int i = 0; i <= num; i++) {
			List<Integer> hours = getHour(i);
			List<Integer> minutes = getMinute(num - i);
			for (Integer hour : hours) {
				for (Integer minute : minutes)
					list.add(hour + ":" + (minute < 10 ? "0" + minute : minute));
			}
		}
		return list;
	}

	public List<Integer> getHour(int num) {
		return getHex(num, 4, 11);
	}

	public List<Integer> getMinute(int num) {
		return getHex(num, 6, 59);
	}

	public List<Integer> getHex(int num, int totalNum, int maxValue) {
		List<Integer> list = new ArrayList<>();
		if (num > totalNum || num < 0)
			return list;
		if (num == 0) {
			list.add(0);
		} else if (totalNum == 1) {
			list.add(1);
		} else {
			List<Integer> former = getHex(num, totalNum - 1, maxValue);
			if (former != null)
				list.addAll(former);
			if (getHex(num - 1, totalNum - 1, maxValue) != null)
				for (Integer i : getHex(num - 1, totalNum - 1, maxValue)) {
					int j = i + (int) Math.pow(2, totalNum - 1);
					if (j <= maxValue)
						list.add(j);
				}
		}
		return list;
	}
}
