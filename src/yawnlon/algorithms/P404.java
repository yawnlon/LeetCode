package yawnlon.algorithms;

import yawnlon.datastructure.TreeNode;

/**
 * Find the sum of all left leaves in a given binary tree.
 * 
 * @author yawnlon
 *
 */

public class P404 {
	public int sumOfLeftLeaves(TreeNode root) {
		// 这里的叶子只指最下面一层的
		if (root == null)
			return 0;
		if (root.left != null && root.left.left==null && root.left.right == null) {
			return root.left.val + sumOfLeftLeaves(root.left) + sumOfLeftLeaves(root.right);
		}
		return sumOfLeftLeaves(root.left) + sumOfLeftLeaves(root.right);
	}
}
