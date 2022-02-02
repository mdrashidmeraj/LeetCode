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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        int n = inorder.length;
        return helper(inorder, 0, n-1, postorder,0,n-1);
    }
    TreeNode helper(int[] in, int isi, int iei, int[] post, int psi, int pei){
        if(isi>iei || psi>pei) return null;
        TreeNode root = new TreeNode(post[pei]);
        int i = isi;
        for(;i<in.length;i++) if(in[i] == post[pei]) break;
        int count = i - isi;
        root.left = helper(in,isi,i-1,post,psi,psi+count-1);
        root.right = helper(in,i+1,iei,post,psi+count,pei-1);
        return root;
    }
}