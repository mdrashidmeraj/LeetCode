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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ans = new ArrayList<>();
        helper(root, targetSum, 0, ans, new ArrayList<>());
        return ans;
    }
    void helper(TreeNode root, int ts, int s, List<List<Integer>> ans, List<Integer> asf){
        if(root == null) return;
        if(root.left == null && root.right == null){
            if(s+root.val == ts){
                asf.add(root.val);
                ans.add(new ArrayList<>(asf));
                asf.remove(asf.size()-1);

            }
            return;
        }
        asf.add(root.val);
        helper(root.left, ts, s+root.val, ans, asf);
        helper(root.right, ts, s+root.val, ans, asf);
        asf.remove(asf.size()-1);
                 
    }
}