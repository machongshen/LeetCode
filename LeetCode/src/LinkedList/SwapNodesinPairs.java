package LinkedList;

class ListNode {
	// Variable
	int val;
	// Point to next object
	ListNode next;
	ListNode(int x) {
		val = x;
		next = null;
	}
}


public class SwapNodesinPairs {
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
	 * 遍历，将当前节点的下一个节点缓存后更改当前节点指针
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
		// 将原链表的头节点的下一个节点置为null，再将反转后的头节点赋给head
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