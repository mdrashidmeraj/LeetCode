/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode mergeTwoLists(ListNode A, ListNode B) {
        if(A == null) return B;
        if(B == null) return A;
        ListNode tempa = A;
        ListNode tempb = B;
        if(tempa.val>tempb.val) {
            tempa = B;
            tempb = A;
        }
        ListNode res = tempa;
        while(tempa != null && tempb != null){
            ListNode prev = null;
            while(tempa != null && tempa.val <= tempb.val){
                prev = tempa;
                tempa = tempa.next;
            }
            prev.next = tempb;
            ListNode temp = tempa;
            tempa = tempb;
            tempb = temp;
        }
        return res;
    }
}
