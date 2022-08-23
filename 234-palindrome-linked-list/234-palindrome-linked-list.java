/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null) return true;
        ListNode fast = head;
        ListNode slow = head;
        while(fast.next != null && fast.next.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        fast =  reverse(slow.next);
        slow = head;
        while(fast != null){
            if(fast.val != slow.val) return false;
            fast = fast.next;
            slow = slow.next;
        }
        return true;
    }
    public ListNode reverse(ListNode head){
        if(head == null || head.next == null) return head;
        ListNode dummy = null;
        ListNode temp = head.next;
        while(temp != null){
            head.next = dummy;
            dummy = head;
            head = temp;
            temp = head.next;
        }
        head.next = dummy;
        return head;
    }
}