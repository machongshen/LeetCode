package LinkedList;
public class AddTwoNumber {
	/**
	 * Recursively swap nodes Pairs
	 */
	public static ListNode reverse(ListNode head) {
		if (null == head || null == head.next) {
			return head;
		}
		ListNode reversedHead = reverse(head.next);
		head.next.next=head;
		head.next=null;
		return reversedHead;
	}

	/**
	 * Traversing method
	 * 
	 */
	public static ListNode reverse2(ListNode head) {
		if (null == head) {
			return head;
		}
		ListNode pre = head;
		ListNode cur = head.next;
		ListNode next;
		while (null != cur) {
			next = cur.next;
			cur.next=pre;
			pre = cur;
			cur = next;
		}
		
		head.next=null;
		head = pre;

		return head;
	}

	public static void main(String[] args) {
		ListNode head = new ListNode(0);
		ListNode tmp = null;
		ListNode cur = null;
		
		for (int i = 1; i < 10; i++) {
			tmp = new ListNode(i);
			if (1 == i) {
				head.next=tmp;
			} else {
				cur.next=tmp;
			}
			cur = tmp;
		}
		ListNode h = head;
		while (null != h) {
			System.out.print(h.val + " ");
			h = h.next;
		}
		head = reverse(head);
		System.out.println("\n**************************");

		while (null != head) {
			System.out.print(head.val + " ");
			head = head.next;
		}
	}
}