/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        Queue<Node> q = new LinkedList<>();
        List<List<Integer>> ans = new ArrayList<>();
        if(root == null) return ans;
        q.add(root);
        while(q.size()>0){
            int s = q.size();
            ArrayList<Integer> asf = new ArrayList<>(); 
            while(s-- != 0){
                Node node = q.remove();
                asf.add(node.val);
                if(node.children != null){
                    for(Node n:node.children) q.add(n);
                }
            }
            ans.add(asf);
        }
        return ans;
    }
}