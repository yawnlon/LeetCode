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

//	public static void main(String[] args) {
//		TreeNode root = TreeNode.init("{1,2,3,#,#,4,#,#,5}");
//		System.out.println(root.toStirng());
//		System.out.println(isBalanced(root));
//	}

	static public boolean isBalanced(TreeNode root) {
		if (root == null)
			return true;

		if (Math.abs(maxDepth(root.left) - maxDepth(root.right)) > 1)
			return false;

		return isBalanced(root.left) && isBalanced(root.right);
	}

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
