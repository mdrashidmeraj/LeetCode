/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public int solve(ListNode A, int B) {
        ListNode temp = A;
        int n = 0;
        while(temp != null){
            temp = temp.next;
            n++;
        }
        int mid = n/2+1;
        if(B>=mid) return -1;
        int k = mid-B;
        temp = A;
        while(k-- != 1){
            temp = temp.next;
        }
        return temp.val;
    }
}
