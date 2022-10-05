/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */


class Solution {
    class Pair{
        TreeNode node;
        int d;
        Pair(TreeNode node, int d){
            this.node = node;
            this.d = d;
        }
    }
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        if(depth == 1){
            TreeNode node = new TreeNode(val);
            node.left = root;
            return node;
        }
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(root, 1));
        while(q.size() != 0){
            int s = q.size();
            if(q.peek().d >=depth) break;
            while(s-- != 0){
                TreeNode node = q.peek().node;
                int d = q.peek().d;
                q.remove();
                if(node.left != null) q.add(new Pair(node.left, d+1));
                if(node.right != null) q.add(new Pair(node.right, d+1));
                if(d == depth-1){
                    TreeNode left = node.left;
                    TreeNode right = node.right;
                    node.left = new TreeNode(val);
                    node.right = new TreeNode(val);
                    node.left.left = left;
                    node.right.right = right;
                }
                
            }
        }
        return root;
    }
}