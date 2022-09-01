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
    static int count = 0;
    public int goodNodes(TreeNode root) {
        count = 0;
        helper(root, root.val);
        return count;
    }
    void helper(TreeNode root, int val){
        if(root ==  null) return;
        if(root.val>=val) count+=1;
        helper(root.left, Math.max(root.val, val));
        helper(root.right, Math.max(root.val, val));
    }
}