class Solution {
    public int climbStairs(int n) {
        if(n<=0) return 0;
        if(n<=2) return n;
        int[] dp = new int[n+1];
        Arrays.fill(dp, -1);
        return helper(n, dp);
    }
    
    int helper(int n, int[] dp){
        if(n<=0) return 0;
        if(n<=2) return n;
        if(dp[n] != -1) return dp[n];
        int one = 0;
        if(dp[n-1] != -1) one = dp[n-1];
        else one = helper(n-1, dp);
        int two = 0;
        if(dp[n-2] != -1) two = dp[n-2];
        else two = helper(n-2, dp);
        return dp[n] = one + two;
    }
}