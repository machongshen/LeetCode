package LinkedList;

public class DetectCycle {
	public boolean hasCycle(ListNode head) {
        ListNode p1= head;
        ListNode p2 =head;
        
        if (head ==null ){
            return false;
        }
        while (p2!=null&&p2.next!=null ) 
        	
       //先判断p2 再判断 p2.next
        {
            p1=p1.next;
            p2 = p2.next.next; 
            if (p2 == p1)
            {
                return true;
            }
            
        }
        return false;
        
    }
}
