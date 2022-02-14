/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public int lPalin(ListNode a) {
        if(a == null || a.next == null) return 1;
        ListNode slow = a;
        ListNode fast = a;
        while(fast.next != null && fast.next.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        slow.next = reverse(slow.next);
        fast = a;
        slow = slow.next;
        // if(slow == null) return 0;
        while(slow!= null){
            if(fast.val != slow.val) return 0;
            fast = fast.next;
            slow = slow.next;
        }
        return 1;
    }
    ListNode reverse(ListNode root){
        if(root == null) return root;
        ListNode temp = null;
        while(root != null){
            ListNode next = root.next;
            root.next = temp;
            temp = root;
            root = next;
        }
        return temp;
    }
}
