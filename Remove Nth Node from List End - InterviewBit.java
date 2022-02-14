/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode removeNthFromEnd(ListNode A, int B) {
        // if(B==1) return A.next;
        int k = 0;
        ListNode temp = A;
        ListNode Nth = new ListNode(-1);
        Nth.next = A;
        ListNode node = Nth;
        while(temp != null){
            temp = temp.next;
            k++;
            if(k>B){
                node = node.next;
            }
        }
        ListNode right = node.next.next;
        node.next = right;
        return Nth.next;
    }
}
