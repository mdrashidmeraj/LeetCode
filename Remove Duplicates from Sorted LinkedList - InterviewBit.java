/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode deleteDuplicates(ListNode A) {
        if(A == null || A.next == null) return A;
        ListNode temp = A;
        while(temp != null && temp.next != null){
            ListNode curr = temp;
            ListNode next = temp;
            while(next != null && curr.val == next.val){
                next = next.next;
            }
            curr.next = next;
            temp = next;
        }
        return A;
    }
}
