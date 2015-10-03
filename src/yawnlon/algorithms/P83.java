package yawnlon.algorithms;

import yawnlon.datastructure.ListNode;

/**
 * Given a sorted linked list, delete all duplicates such that each element
 * appear only once.
 * 
 * For example, Given 1->1->2, return 1->2. Given 1->1->2->3->3, return 1->2->3
 */
public class P83 {
	public ListNode deleteDuplicates(ListNode head) {
		if (head == null)
			return null;
		ListNode current = head;
		ListNode last = null;
		while (current != null) {
			if (last != null && current.val == last.val) {
				last.next = current.next;
			} else {
				last = current;
			}
			current = current.next;
		}
		return head;
	}
}
