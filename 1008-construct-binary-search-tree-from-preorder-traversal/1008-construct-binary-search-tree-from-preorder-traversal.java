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
    public TreeNode bstFromPreorder(int[] preorder) {
        return helper(preorder, 0, preorder.length-1);
    }
    TreeNode helper(int[] pre, int s, int e){
        if(s>e) return null;
        TreeNode root = new TreeNode(pre[s]);
        int i = s;
        for(;i<pre.length;i++){
            if(pre[i]>pre[s]) break;
        }
        root.left = helper(pre, s+1, i-1);
        root.right = helper(pre, i, e);
        return root;
    }
}