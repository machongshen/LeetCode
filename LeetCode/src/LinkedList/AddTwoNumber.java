package LinkedList;

import java.util.HashMap;
import java.util.Map;

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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode (0);
        ListNode p = l1; 
        ListNode q = l2;
        ListNode curr = dummyHead;
        int carry = 0;
        while ( p != null || q != null){
            int x = (p != null) ? p.val : 0;
            int y = (q != null) ? q.val : 0;
            int k = x + y + carry;
            carry = k / 10;
            curr.next = new ListNode(k % 10);
            if (p != null) p = p.next;
            if (q != null) q = q.next;
            curr = curr.next;
        }
        if (carry != 0) 
        	
        curr.next = new ListNode (carry);
        return dummyHead.next;
       
    }
}