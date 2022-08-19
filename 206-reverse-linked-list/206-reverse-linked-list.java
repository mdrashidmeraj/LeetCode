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
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode dummy = null;
        ListNode temp = head.next;
        while(temp!=null){
            head.next = dummy;
            dummy = head;
            head = temp;
            temp = head.next;
        }
        head.next = dummy;
        return head;
    }
}