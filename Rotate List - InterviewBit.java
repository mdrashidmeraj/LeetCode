/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode rotateRight(ListNode A, int k) {
        ListNode temp = A;
        int n =1;
        while(temp.next != null){
            temp = temp.next;
            n++;
        }
        temp.next = A;
        k = k%n;
        k = n-k;
        temp = A;
        while(k-- != 1){
            temp = temp.next;
        }
        ListNode res = temp.next;
        temp.next = null;
        return res;
    }
}
