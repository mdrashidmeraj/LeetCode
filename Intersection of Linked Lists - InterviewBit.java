/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
	public ListNode getIntersectionNode(ListNode a, ListNode b) {
        ListNode tempa = a;
        ListNode tempb = b;
        while(tempa != tempb){
            if(tempa == null){
                tempa = b;
            }else tempa = tempa.next;

            if(tempb == null){
                tempb = a;
            }else {
                tempb = tempb.next;
            }
        }
        return tempa;
	}
}
