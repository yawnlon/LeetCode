package yawnlon.algorithms;

import yawnlon.datastructure.TreeNode;

/*
 * Given a binary tree, find its maximum depth.
 * The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
 * */

public class P104 {

	public static int maxDepth(TreeNode root) {
		if (root == null)
			return 0;
		if (root.left == null && root.right == null)
			return 1;
		else if (root.left != null && root.right != null)
			return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
		else if (root.left != null)
			return 1 + maxDepth(root.left);
		else
			return 1 + maxDepth(root.right);
	}
}
