/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if(head == null) return null;
        Node temp = head;
        while(temp != null){
            Node tmp = new Node(temp.val);
            tmp.next = temp.next;
            temp.next = tmp;
            temp = tmp.next;
        }
        temp = head;
        while(temp != null){
            if(temp.random != null)
                temp.next.random = temp.random.next;
            temp = temp.next.next;
        }
        temp = head;
        Node dummy = new Node(0);
        Node copy = dummy;
        dummy = temp.next;
        
        while(temp != null){
            Node front = temp.next.next;
            copy.next = temp.next;
            temp.next = front;
            copy = copy.next;
            temp = temp.next;
        }
        return dummy;
    }
}