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
    static int ans;
    public int pseudoPalindromicPaths (TreeNode root) {
        HashSet<Integer> set = new HashSet<>();
        ans = 0;
        helper(root, set);
        return ans;
    }
    void helper(TreeNode root, HashSet<Integer> set){
        if(root == null) return;
        if(set.contains(root.val)) set.remove(root.val);
        else set.add(root.val);
        if(root.left == null && root.right == null) {
            if(set.size()<=1) ans+=1;
           // set.clear();
         //   return;
        }
        helper(root.left, set);
        helper(root.right, set);
        if(set.contains(root.val)) set.remove(root.val);
        else set.add(root.val);
    }
}