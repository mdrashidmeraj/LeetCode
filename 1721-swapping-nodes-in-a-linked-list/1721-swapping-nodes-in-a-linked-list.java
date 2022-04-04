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
    public ListNode swapNodes(ListNode head, int k) {
        int len = 0;
        ListNode temp = head;
        while(temp != null){
            temp = temp.next;
            len++;
        }
        temp = head;
        int t = k-1;
        while(temp != null && t != 0){
            temp = temp.next;
            t--;
        }
        ListNode temp2 = head;
        t = len-k;
        while(temp2 != null && t != 0){
            temp2 = temp2.next;
            t--;
        }
        
        int val = temp.val;
        temp.val = temp2.val;
        temp2.val = val;
        return head;
    }
}