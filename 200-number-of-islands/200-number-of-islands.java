class Solution {
    public int numIslands(char[][] grid) {
        boolean[][] vis = new boolean[grid.length][grid[0].length];
        int count  = 0;
        for(int i = 0;i<grid.length;i++){
            for(int j = 0;j<grid[i].length;j++){
                if(grid[i][j] == '1' && vis[i][j] == false){
                    solution(grid,vis,i,j);
                    count++;
                }
            }
        }
        return count;
    }
    public void solution(char[][] grid, boolean[][] vis, int i,int j){
        if(i<0 || j<0 || i>=grid.length || j>=grid[0].length || grid[i][j] == '0' || vis[i][j] == true)
            return;
        
        vis[i][j] = true;
        solution(grid,vis,i+1,j);
        solution(grid,vis,i,j+1);
        solution(grid,vis,i-1,j);
        solution(grid,vis,i,j-1);
        
    }
}