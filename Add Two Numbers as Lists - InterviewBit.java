/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode A, ListNode B) {
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;
        int carry = 0;
        ListNode tempa = A;
        ListNode tempb = B;
        while(tempa != null || tempb != null){
            int sum =0;
            if(tempa != null) {
                sum+=tempa.val;
                tempa = tempa.next;
            }
            if(tempb != null) {
                sum+=tempb.val;
                tempb = tempb.next;
            }
            sum+=carry;
            carry = sum/10; 
            sum = sum%10;
            // System.out.println(sum);
            // System.out.println(carry);
            temp.next = new ListNode(sum);
            temp = temp.next; 
        }
        if(carry>0) temp.next = new ListNode(carry);
        return dummy.next;
    }
}
