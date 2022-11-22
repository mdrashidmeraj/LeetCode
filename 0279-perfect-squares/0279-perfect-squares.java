class Solution {
    public int numSquares(int n) {
        int[] dp = new int[n+1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        dp[1] = 1;
        
        for(int i =2; i<=n; i++){
            for(int j  =1; j*j <= i; j++){
                dp[i] = Math.min(1+dp[i - (j*j)], dp[i]);
            }
        }
        return dp[n];
    }
}