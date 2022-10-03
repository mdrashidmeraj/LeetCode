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
    
    TreeNode helper(int[] preorder, int sp, int ep, int[] inorder, int si, int ei){
        if(sp>ep || si>ei) return null;
        int i = 0;
        for(;i<inorder.length;i++){
            if(inorder[i] == preorder[sp]) break;
        }
        
        TreeNode root = new TreeNode(preorder[sp]);
        root.left = helper(preorder,sp+1 ,sp+i-si, inorder, si, i-1);
        root.right = helper(preorder,sp+i-si+1 , ep , inorder, i+1, ei);
        return root;
    }
}