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
	 * 
	 * @param data
	 *            LeetCode中二叉树数据, 使用层序遍历构建 example:
	 *            "[1,2,2,3,3,3,3,4,4,4,4,4,4,null,null,5,5]"
	 * @return 返回的TreeCode
	 */

	public static TreeNode init(String data) {
		String s = data.substring(1, data.length() - 1);
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
	 * 
	 * @param root树根节点
	 *            层序遍历二叉树
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
}
