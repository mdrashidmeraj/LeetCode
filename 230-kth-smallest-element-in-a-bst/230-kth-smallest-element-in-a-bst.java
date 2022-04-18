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
    public int kthSmallest(TreeNode root, int k) {
        if(root == null) return -1;
        int[] arr = new int[2];
        kthSmallest(root, arr, k);
        return arr[1];
    }
    
    public void kthSmallest(TreeNode root, int[] arr, int k){
        if(root == null) return;
        kthSmallest(root.left,arr,k);
        if(++arr[0] == k){
            arr[1] = root.val;
            return;
        }
        kthSmallest(root.right,arr,k);
    }
}