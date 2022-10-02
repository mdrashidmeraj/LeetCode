class Solution {
    public int numRollsToTarget(int n, int k, int target) {
        int[][] dp = new int[n+1][target+1];
        for(int[] row: dp){
            Arrays.fill(row, -1);
        }
        return helper(n,k,target,dp);     
    }
    
    int helper(int n, int k, int target, int[][] dp){
        if(target<0) return 0;
        if(n == 0 && target != 0) return 0;
        if(n!=0 && target == 0) return 0;
        if(n == 0 && target == 0) return 1;
        if(dp[n][target] != -1) return dp[n][target];
        int ans = 0;
        for(int i = 1;i<=k;i++){
            ans = (ans + helper(n-1, k, target-i, dp) % 1000000007) % 1000000007;
        }
        return dp[n][target] = ans%1000000007;
    }
}