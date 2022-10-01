class Solution {
    public int numDecodings(String s) {
        if(s.charAt(0) == '0') return 0;
        int[] dp = new int[s.length()+1];
        Arrays.fill(dp ,-1);
        int count = helper(s, 0, s.length(), dp);
        return count;
    }
    int helper(String s, int i, int n, int[] dp){
        if(i == n){
            return 1;
        }
        int ans = 0;
        if(dp[i+1] != -1) return dp[i+1];
        if(s.charAt(i) != '0'){
            ans += helper(s, i+1, n, dp);
            if(i+2<=n && Integer.parseInt(s.substring(i,i+2)) <=26)
                ans+=helper(s, i+2, n, dp);
        }
        return dp[i+1] = ans;
    }
}