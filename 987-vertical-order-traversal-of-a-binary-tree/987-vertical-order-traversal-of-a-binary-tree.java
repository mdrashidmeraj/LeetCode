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
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        TreeMap <Integer,TreeMap<Integer,PriorityQueue <Integer>>> map = new TreeMap <> ();
        traversal(root, 0,0, map);
        for (TreeMap <Integer,PriorityQueue <Integer>> ys: map.values()) {
            list.add(new ArrayList <> ());
            for (PriorityQueue <Integer> nodes: ys.values()) {
                while (!nodes.isEmpty()) {
                    list.get(list.size() - 1).add(nodes.poll());
                }
            }
        }
        return list;
        
    }
    void traversal(TreeNode root, int row,int col, TreeMap <Integer,TreeMap <Integer, PriorityQueue <Integer>>> map){
        
        if(root == null) return;
        map.putIfAbsent(col,new TreeMap<>());
        if(map.get(col).containsKey(row)){
            map.get(col).get(row).add(root.val);
            
        }else{
            PriorityQueue<Integer> pq = new PriorityQueue<>();
            pq.add(root.val);
            map.get(col).put(row,pq);
        }
        traversal(root.left,row+1,col-1,map);
        traversal(root.right,row+1,col+1,map);
        
    }
}