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
    class NodeValue{
        int size;
        int min;
        int max;
        NodeValue(int size, int min, int max){
            this.size = size;
            this.min = min;
            this.max = max;
        }
    }
    int ans;
    public int maxSumBST(TreeNode root) {
        ans = 0;
        helper(root);
        return ans;
    }
    NodeValue helper(TreeNode root){
        if(root == null){
            NodeValue base = new NodeValue(0, Integer.MAX_VALUE, Integer.MIN_VALUE);
            return base;
        }
        NodeValue left = helper(root.left);
        NodeValue right = helper(root.right);
        if(root.val > left.max && root.val<right.min){
            ans = Math.max(left.size+right.size+root.val, ans);
            return new NodeValue(left.size+right.size+root.val,Math.min(root.val,left.min), Math.max(right.max, root.val));
        }
        return new NodeValue(Math.max(left.size, right.size), Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
}