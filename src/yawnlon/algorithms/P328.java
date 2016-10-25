package yawnlon.algorithms;

import yawnlon.datastructure.ListNode;

public class P328 {

	/**
	 * 
	 * Given a singly linked list, group all odd nodes together followed by the
	 * even nodes. Please note here we are talking about the node number and not
	 * the value in the nodes.
	 * 
	 * You should try to do it in place. The program should run in O(1) space
	 * complexity and O(nodes) time complexity.
	 * 
	 * 
	 */

	// public static void main(String[] args) {
	// ListNode head = ListNode.init(new int[] { 1, 2, 3, 4, 5 });
	// System.out.println(oddEvenList(head).toString());
	// }

	public static ListNode oddEvenList(ListNode head) {
		if (head == null)
			return null;
		ListNode firstEven = head.next;
		ListNode current = head;
		ListNode currentNext = head.next;
		int num = 0;
		while (currentNext != null && currentNext.next != null) {
			current.next = currentNext.next;
			current = currentNext;
			currentNext = currentNext.next;
			num++;
		}
		if (num % 2 != 0) {
		    if (currentNext != null)
			    currentNext.next = firstEven;
			current.next = null;
		} else {
			current.next = firstEven;
			if (currentNext != null)
			    currentNext.next = null;
		}
		return head;
	}

}
