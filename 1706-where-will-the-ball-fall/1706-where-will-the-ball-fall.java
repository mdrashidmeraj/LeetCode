class Solution {
    public int[] findBall(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int[] ans = new int[m];
        for(int i = 0;i<m;i++){
            int r = 0;
            int c = i;
            while(r<n && c<m){
                if(c+1<m && grid[r][c] == 1 && grid[r][c+1] == 1){
                    r = r+1;
                    c = c+1;
                }else if(c-1>=0 && grid[r][c] == -1 && grid[r][c-1] == -1){
                    r = r+1;
                    c = c-1;
                }
                else {
                    ans[i] = -1;
                    break;
                }
            }
            if(ans[i] != -1) ans[i] = c;
        }
        return ans;
    }
}