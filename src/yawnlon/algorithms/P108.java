package yawnlon.algorithms;

import java.util.ArrayList;
import java.util.List;

/**
 * Given numRows, generate the first numRows of Pascal's triangle.
 * 
 * For example, given numRows = 5, Return
 * 
 * [ [1], [1,1], [1,2,1], [1,3,3,1], [1,4,6,4,1] ]
 * 
 * @author yawnlon
 *
 */
public class P108 {
	public List<List<Integer>> generate(int numRows) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		List<Integer> last = null;
		for (int i = 0; i < numRows; i++) {
			List<Integer> row = new ArrayList<Integer>();
			if (i <= 1) {
				row.add(1);
				if (i == 1)
					row.add(1);
				last = row;
				result.add(row);
				continue;
			}
			row.add(1);
			for (int j = 1; j < i; j++) {
				row.add(last.get(j - 1) + last.get(j));
			}
			row.add(1);
			last = row;
			result.add(row);
		}
		return result;
	}
}
