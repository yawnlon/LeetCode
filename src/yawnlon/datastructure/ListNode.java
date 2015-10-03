package yawnlon.datastructure;

public class ListNode {
	public int val;
	public ListNode next;

	public ListNode(int x) {
		val = x;
	}

	public static ListNode init(int N) {
		ListNode[] list = new ListNode[N];
		for (int i = 0; i < N; i++) {
			list[i] = new ListNode(i);
		}
		for (int i = 0; i < N - 1; i++) {
			list[i].next = list[i + 1];
		}
		return list[0];
	}

	public static ListNode init(int[] data) {
		int N = data.length;
		ListNode[] list = new ListNode[N];
		for (int i = 0; i < N; i++) {
			list[i] = new ListNode(data[i]);
		}
		for (int i = 0; i < N - 1; i++) {
			list[i].next = list[i + 1];
		}
		return list[0];
	}

	public String toString() {
		ListNode current = this;
		String result = "";
		while (current != null) {
			result += (current.val + " ");
			current = current.next;
		}
		return result;
	}
}