class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        boolean[][] vis = new boolean[image.length][image[0].length]; 
        helper(image, image[sr][sc], sr, sc, color, vis);    
        return image;
    }
    public void helper(int[][] image, int old, int sr, int sc, int color, boolean[][] vis){
        if(sr<0 || sr>=image.length || sc<0 || sc>=image[0].length){
            return;
        }
        if(vis[sr][sc] ||  image[sr][sc] != old) return;
        vis[sr][sc] = true;
        image[sr][sc] = color;
        helper(image, old, sr+1, sc, color, vis);
        helper(image, old, sr-1, sc, color, vis); 
        helper(image, old, sr, sc+1, color, vis); 
        helper(image, old, sr, sc-1, color, vis); 

    } 
    
}