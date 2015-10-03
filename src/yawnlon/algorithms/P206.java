package yawnlon.algorithms;

import yawnlon.datastructure.ListNode;

/**
 * Reverse a singly linked list.
 *
 */

public class P206 {

	public static void main(String[] args) {
		ListNode head = ListNode.init(5);
		System.out.println(head.toString());
		System.out.println(reverseList(head).toString());
	}

	static public ListNode reverseList(ListNode head) {
		if (head == null)
			return null;
		ListNode current = head;
		ListNode next = head.next;
		current.next = null;
		while (next != null) {
			ListNode temp = next.next;
			next.next = current;
			current = next;
			next = temp;
		}
		return current;
	}
}
