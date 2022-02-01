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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return helper(preorder, 0, preorder.length-1, inorder, 0, inorder.length-1);
        
    }
    TreeNode helper(int[] pre, int sp, int ep, int[] in, int si, int ei){
        if(sp>ep || si>ei) return null;
        
        
        int i = si;
        for(;i<in.length;i++){
            if(in[i] == pre[sp]) break;
        }
        TreeNode root = new TreeNode(pre[sp]);
        int countOfLeftElement = i-si;
         root.left = helper(pre,sp+1,sp+countOfLeftElement, in, si, i-1); 
         root.right = helper(pre, sp+countOfLeftElement+1, ep, in, i+1, ei);
        return root;
        
    }
}