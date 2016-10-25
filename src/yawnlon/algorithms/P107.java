package yawnlon.algorithms;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import yawnlon.datastructure.TreeNode;

public class P107 {

	/**
	 * Given a binary tree, return the bottom-up level order traversal of its
	 * nodes' values. (ie, from left to right, level by level from leaf to
	 * root).
	 * 
	 */

//	public static void main(String[] args) {
//		TreeNode root = TreeNode.levelInit("1,2");
//		List<List<Integer>> result = levelOrderBottom(root);
//
//		for (List<Integer> list : result) {
//			for (Integer i : list) {
//				System.out.print(i + " ");
//			}
//			System.out.println();
//		}
//
//	}

	public static List<List<Integer>> levelOrderBottom(TreeNode root) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		if (root == null)
			return result;
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		Queue<Integer> levelQ = new LinkedList<Integer>();
		q.add(root);
		levelQ.add(0);
		int lastLevel = 0;
		List<Integer> levelList = new ArrayList<Integer>();
		while (!q.isEmpty()) {
			TreeNode temp = q.poll();
			int currentLevel = levelQ.poll();
			if (currentLevel == lastLevel) {
				levelList.add(temp.val);
			} else {
				result.add(0, levelList);
				levelList = new ArrayList<Integer>();
				levelList.add(temp.val);
				lastLevel = currentLevel;
			}
			if (temp.left != null) {
				q.add(temp.left);
				levelQ.add((currentLevel + 1));
			}
			if (temp.right != null) {
				q.add(temp.right);
				levelQ.add((currentLevel + 1));
			}
		}
		result.add(0, levelList);
		return result;
	}
}
