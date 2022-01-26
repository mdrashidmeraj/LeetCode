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
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root == null) return new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        List<List<Integer>> ans = new ArrayList<>();
        q.add(root);
        while(q.size()>0){
            ArrayList<Integer> arr = new ArrayList<>();
            int t = q.size();
            while(t-- != 0){
                TreeNode a = q.poll();
                arr.add(a.val);    
                if(a.left != null) q.add(a.left);
                if(a.right != null) q.add(a.right);
            }
            ans.add(arr);
            
        }
        return ans;
        
    }
}