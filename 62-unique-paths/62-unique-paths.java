class Solution {
    static int[][] dp;
    public int uniquePaths(int m, int n) {
        dp = new int[m+1][n+1];
        for(int[] row: dp){
            Arrays.fill(row,-1);
        }
        return helper(1,1,m,n);
    }
    public int helper(int i, int j, int m, int n){
        if(i == m && j == n) return 1;
        if(i>m || j>n || i<1 || j<1) return 0;
        if(dp[i][j] != -1) return dp[i][j];
        int td = helper(i+1, j, m,n);
        int tl = helper(i, j+1, m, n);
        dp[i][j] =  td+tl;
        return dp[i][j];
    }
}