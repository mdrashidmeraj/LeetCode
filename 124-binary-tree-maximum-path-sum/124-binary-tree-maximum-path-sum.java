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
    int max = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        solution(root);
        return max;    
    }
    int solution(TreeNode root){
        if(root == null) return 0;
        int left = Math.max(0,solution(root.left));
        int right = Math.max(0,solution(root.right));
        max = Math.max(max, left+right+root.val);
        return root.val+Math.max(left,right);
    }
}