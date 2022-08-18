class Solution {
    public boolean isSubsequence(String s, String t) {
        int n = s.length();
        int m = t.length();
        //         DP APPROACH
        // int[][] dp = new int[n+1][m+1];
        // for(int i=0;i<=n;i++){
        //     for(int j =0;j<=m;j++){
        //         if(i==0 || j==0) dp[i][j] = 0;
        //         else{
        //             if(s.charAt(i-1) == t.charAt(j-1)) dp[i][j] = 1+dp[i-1][j-1];
        //             else dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
        //         }
        //     }
        // }
        // return dp[n][m] == n;
//         
        if(n == 0) return true;
        if(n == 0 && m == 0) return true;
        int i = 0;
        int j= 0;
        while(j<m){
            if(s.charAt(i) == t.charAt(j)){
                i++;
            }
            if(i == s.length()) return true;
            j++;
        }
        return false;
    }
}