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
    static List<String> li;
    public List<String> binaryTreePaths(TreeNode root) {
        li = new ArrayList<>();
        helper(root, "");
        return li;
    }
    void helper(TreeNode root, String asf){
        if(root == null) return;
        asf+=root.val + "->";
        if(root.left == null && root.right == null){
            asf = asf.substring(0, asf.length()-2);
            li.add(asf);
        }
        helper(root.left, asf);
        helper(root.right, asf);
    }
}