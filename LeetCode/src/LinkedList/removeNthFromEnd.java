package LinkedList;

public class removeNthFromEnd {
	 public ListNode removeNthFromEnd(ListNode head, int n) {
	        
		 	//Use the dummy head to do so.
		 	//If use the dummy head, return dummy.next rather than head
		 
		 	//declare variables
		 	ListNode start = new ListNode(0);
	        start.next = head;
	        ListNode pointer1= start;
	        ListNode pointer2= start;
	        int count=0;
	        //fast pointer go fast n position.
	        while ( count != n ){
	            pointer1=pointer1.next;
	            count++;
	        }
	        //when fast reached the end, remove the slow pointer.next 
	        while (pointer1.next!=null){
	            pointer1=pointer1.next;
	            pointer2=pointer2.next;
	        }
	        pointer2.next = pointer2.next.next;
	        return start.next;
	    }
}
