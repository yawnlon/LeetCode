package yawnlon.algorithms;

import yawnlon.datastructure.TreeNode;

/**
 * Given a binary tree, determine if it is height-balanced.
 * 
 * For this problem, a height-balanced binary tree is defined as a binary tree
 * in which the depth of the two subtrees of every node never differ by more
 * than 1.
 */

public class P110 {
	public boolean isBalanced(TreeNode root) {
		if (root == null)
			return true;
		if (root.left == null && root.right != null) {
			if (root.right.left != null || root.right.right != null)
				return false;
			else
				return true;
		} else if (root.right == null && root.left != null) {
			if (root.left.left != null || root.left.right != null)
				return false;
			else
				return true;
		} else if (root.left == null && root.right == null)
			return true;
		else
			return isBalanced(root.left) && isBalanced(root.right);
	}
}
