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
        int idx;
        Pair( TreeNode node, int idx){
            this.node = node;
            this.idx = idx;
        }
    }
    public int widthOfBinaryTree(TreeNode root) {
        int ans = 1;
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(root, 0));
        while(q.size()>0){
            int len = q.size();
            int min = q.peek().idx;
            int first = 0, last = 0;
            for(int i = 0;i<len;i++){
                Pair p = q.poll();
                TreeNode node = p.node;
                int idx = p.idx - min;
                if(i == 0) first = idx;
                if(i == len-1) last = idx;
                if(node.left != null){
                    q.add(new Pair(node.left,idx*2+1));     
                }
                if(node.right != null){
                    q.add(new Pair(node.right,idx*2+2));
                }
            }
            ans = Math.max(ans, last-first+1);
        }
        return ans;
     }
}