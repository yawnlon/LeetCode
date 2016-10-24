package yawnlon.algorithms;

import yawnlon.datastructure.ListNode;

public class P021 {
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		if (l1 == null)
			return l2;
		if (l2 == null)
			return l1;
		ListNode head = l1.val < l2.val ? l1 : l2;
		ListNode current1 = l1.val < l2.val ? l1.next : l1;
		ListNode current2 = l1.val < l2.val ? l2 : l2.next;
		ListNode current = head;
		while (current1 != null || current2 != null) {
			int val1 = current1 == null ? Integer.MAX_VALUE : current1.val;
			int val2 = current2 == null ? Integer.MAX_VALUE : current2.val;
			if (val1 < val2) {
				current.next = current1;
				current1 = current1.next;
			} else {
				current.next = current2;
				current2 = current2.next;
			}
			current = current.next;
		}
		return head;
	}
}
