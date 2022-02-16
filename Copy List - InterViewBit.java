/**
 * Definition for singly-linked list with a random pointer.
 * class RandomListNode {
 *     int label;
 *     RandomListNode next, random;
 *     RandomListNode(int x) { this.label = x; }
 * };
 */
public class Solution {
    public RandomListNode copyRandomList(RandomListNode head) {
        if(head == null) return null;
        RandomListNode temp = head;
        while(temp != null){
            RandomListNode node = new RandomListNode(temp.label);
            node.next = temp.next;
            temp.next = node;
            temp = node.next;
        }
        temp = head;
        while(temp != null){
            if(temp.random != null)
                temp.next.random = temp.random.next;
            temp = temp.next.next;
        }
        temp = head;
        RandomListNode dummy = temp.next;
        RandomListNode copy = new RandomListNode(0);
        
        while(temp != null){
            RandomListNode front = temp.next.next;
            copy.next = temp.next;
            temp.next = front;
            copy = copy.next;
            temp = temp.next;
        }
        return dummy;
    }
}
