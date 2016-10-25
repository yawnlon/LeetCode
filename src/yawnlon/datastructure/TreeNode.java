package yawnlon.datastructure;

import java.util.LinkedList;
import java.util.Queue;

public class TreeNode {
	public int val;
	public TreeNode left;
	public TreeNode right;

	public TreeNode(int x) {
		val = x;
	}

	/**
	 * 层序遍历二叉树
	 */
	@SuppressWarnings("unused")
	public String toStirng() {
		TreeNode root = this;
		String result = "";
		if (root == null)
			return result;
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		q.add(root);
		while (!q.isEmpty()) {
			TreeNode temp = q.poll();
			result += (temp.val + " ");
			if (temp.left != null)
				q.add(temp.left);
			if (temp.right != null)
				q.add(temp.right);
		}
		return result;
	}

	/**
	 * TODO: 有bug
	 * 
	 * @param data
	 *            LeetCode中二叉树数据, 使用层序遍历构建 example:
	 *            "1,2,2,3,3,3,3,4,4,4,4,4,4,null(或#),null(或#),5,5"
	 * @return 返回的TreeCode
	 */

	public static TreeNode levelInit(String data) {
		String s = data;
		if (s == null || s.equals(""))
			return null;
		String[] split = s.split(",");
		TreeNode root = new TreeNode(Integer.parseInt(split[0]));
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		q.add(root);
		boolean flag = false;
		for (int i = 1; i < split.length; i++) {
			TreeNode temp = q.peek();
			if (!split[i].equals("null") && !split[i].equals("#")) {
				TreeNode t = new TreeNode(Integer.parseInt(split[i]));
				q.add(t);
				if (temp.left != null) {
					temp.right = t;
					q.poll();
				} else {
					temp.left = t;
				}
			} else {
				if (temp.left == null && !flag) {
					flag = true;
				} else {
					q.poll();
					flag = false;
				}
			}
		}
		return root;
	}

	/**
	 * TODO: 不太会写了
	 * 
	 * @return levelInit的逆过程
	 */

	public static String levelPrint(TreeNode root) {
		String result = "";
		if (root == null)
			return result;
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		q.add(root);
		while (!q.isEmpty()) {
			TreeNode temp = q.poll();
			result += (temp.val + ",");
			if (temp.left != null)
				q.add(temp.left);
			if (temp.right != null)
				q.add(temp.right);
		}
		return result;
	}

	/**
	 * 先序遍历
	 * 
	 * 这三种不同的遍历结构都是一样的，只是先后顺序不一样而已
	 * 
	 * @param node
	 *            遍历的节点
	 */
	public static void preOrderTraverse(TreeNode node) {
		if (node == null)
			return;
		System.out.print(node.val + " ");
		preOrderTraverse(node.left);
		preOrderTraverse(node.right);
	}

	/**
	 * 中序遍历
	 * 
	 * 这三种不同的遍历结构都是一样的，只是先后顺序不一样而已
	 * 
	 * @param node
	 *            遍历的节点
	 */
	public static void inOrderTraverse(TreeNode node) {
		if (node == null)
			return;
		inOrderTraverse(node.left);
		System.out.print(node.val + " ");
		inOrderTraverse(node.right);
	}

	/**
	 * 后序遍历
	 * 
	 * 这三种不同的遍历结构都是一样的，只是先后顺序不一样而已
	 * 
	 * @param node
	 *            遍历的节点
	 */
	public static void postOrderTraverse(TreeNode node) {
		if (node == null)
			return;
		postOrderTraverse(node.left);
		postOrderTraverse(node.right);
		System.out.print(node.val + " ");
	}
}
