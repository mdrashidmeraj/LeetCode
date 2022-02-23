/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode swapPairs(ListNode A) {
        if(A == null || A.next == null) return A;
        ListNode head = A;
        ListNode curr, next, prev;
        prev = null;
        curr = A;
        next = curr.next;
        if(next != null)
            A = next;
        while (next != null)
        {
            curr.next = next.next;
            next.next = curr;
            if(prev != null)            
                prev.next = next;      //linking 1 to 4: 2->1 ~ 4->3
            prev = curr;
            curr = curr.next;
            if(curr != null)
                next = curr.next;
            else
                next = null;
        }
        return A;
    }
}
