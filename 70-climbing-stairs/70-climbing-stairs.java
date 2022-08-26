class Solution {
    public int climbStairs(int n) {
        if(n==1 || n==2) return n;
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        dp[1] = 1;
        dp[2] = 2;
        return helper(n, dp);
    }
    int helper(int n, int[] dp){
        if(n==1 || n==2) return n;
        if(dp[n-1] == -1) dp[n-1] = helper(n-1, dp);
        if(dp[n-2] == -1) dp[n-1] = helper(n-2, dp);
        return dp[n] = dp[n-1]+dp[n-2];
    }
}