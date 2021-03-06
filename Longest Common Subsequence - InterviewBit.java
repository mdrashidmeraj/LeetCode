public class Solution {
    public int solve(String A, String B) {
        int[][] dp = new int[A.length()+1][B.length()+1];
        for(int i = 0; i<dp.length; i++){
            for(int j =0;j<dp[i].length;j++){
                if(i == 0 || j == 0) dp[i][j] = 0;
                else{
                    if(A.charAt(i-1) == B.charAt(j-1)) dp[i][j] = dp[i-1][j-1]+1;
                    else dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }
        return dp[A.length()][B.length()];
    }
}
