/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode reverseBetween(ListNode A, int B, int C) {
        if(A==null || B==C) return A;        
        ListNode dummy = new ListNode(-1);
        dummy.next=A;
        int pos=1;
        ListNode left = dummy;
        while(pos<B){
            left = left.next;
            pos++;
        }
        //pos is at 1
        ListNode right = left;
        while(pos<=C){
            right = right.next;
            pos++;
        }
        //pos = 3;
        ListNode rightKaNext = right.next;
        right.next = null;
        ListNode root = reverseList(left.next);
        left.next = root;
        while(left.next != null){
            left = left.next;
        }
        left.next = rightKaNext;
        return dummy.next;
    }
    //nazar nahi marani tashu baby ne check kiya hai
    public ListNode reverseList(ListNode head) {
        ListNode temp = null;
        while(head != null){
            ListNode next = head.next;
            head.next = temp;
            temp = head;
            head = next;
            
        }
        return temp;
    }
}
