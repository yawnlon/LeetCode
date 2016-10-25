package yawnlon.algorithms;

import java.util.LinkedList;
import java.util.Queue;

import yawnlon.datastructure.TreeNode;

/**
 * Given a binary tree, check whether it is a mirror of itself (ie, symmetric
 * around its center).
 *
 */

public class P101 {

//	public static void main(String[] args) {
//		TreeNode root = TreeNode.levelInit("1");
//		System.out.println(isSymmetric(root));
//	}

	public static boolean isSymmetric(TreeNode root) {
		String result = levelPrint(root);
		String[] val = result.split(",");
		int levelNum = 1;
		int lastLevelNum = levelNum;
		for (int i = 0; i < val.length; i = i + lastLevelNum) {
			int nullNum = 0;
			lastLevelNum = levelNum;
			for (int j = i; j < i + levelNum; j++) {
				if (val[j].equals("#"))
					nullNum++;
				if (!val[j].equals(val[2 * i + levelNum - 1 - j]))
					return false;
			}
			levelNum = 2 * (levelNum - nullNum);
		}
		return true;
	}

	static String levelPrint(TreeNode root) {
		String result = "";
		if (root == null)
			return result;
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		q.add(root);
		while (!q.isEmpty()) {
			TreeNode temp = q.poll();
			if (temp.val == Integer.MIN_VALUE) {
				result += "#,";
			} else {
				result += (temp.val + ",");
				if (temp.left != null) {
					q.add(temp.left);
				} else {
					q.add(new TreeNode(Integer.MIN_VALUE));
				}
				if (temp.right != null) {
					q.add(temp.right);
				} else {
					q.add(new TreeNode(Integer.MIN_VALUE));
				}
			}
		}
		return result;
	}
	
	/**
	 * My method is a little stupid
	 * others are following
	 */
//	Recursive:
//	public boolean isSymmetric(TreeNode root) {
//		if (root == null)
//			return true;
//		return isSymmetric(root.left, root.right);
//	}
//
//	private boolean isSymmetric(TreeNode root1, TreeNode root2) {
//		if (root1 == null && root2 == null)
//			return true;
//		if (root1 == null || root2 == null)
//			return false;
//		if (root1.val != root2.val)
//			return false;
//		return isSymmetric(root1.left, root2.right) && isSymmetric(root1.right, root2.left);
//	}
	
//	Iterative
//	public boolean isSymmetric(TreeNode root) {
//	    if(root==null) return true;
//	    Queue<TreeNode> q1=new LinkedList<>(), q2=new LinkedList<>();
//	    q1.add(root.left); 
//	    q2.add(root.right);
//	    while(!q1.isEmpty() && !q2.isEmpty()) {
//	        int size1=q1.size(), size2=q2.size();
//	        if(size1!=size2) return false;
//	        for(int i=0; i<size1; i++) {
//	            TreeNode current1=q1.remove(), current2=q2.remove();
//	            if(current1==null && current2==null) continue;
//	            if(current1==null || current2==null) return false; 
//	            if(current1.val!=current2.val) return false;
//	            q1.add(current1.left);
//	            q1.add(current1.right);
//	            q2.add(current2.right);
//	            q2.add(current2.left);
//	        }
//	    }
//	    return q1.isEmpty() && q2.isEmpty();
//	}
}
