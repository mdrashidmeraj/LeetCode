/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
	public ListNode detectCycle(ListNode a) {
        ListNode fast = a;
        ListNode slow = a;
        do{
            if(fast == null || fast.next == null) return null;
            fast = fast.next.next;
            slow = slow.next;
        }while(fast != slow);
        fast =a;
        while(fast != slow){
            fast=fast.next;
            slow=slow.next;
        }
        return fast;
	}
}
