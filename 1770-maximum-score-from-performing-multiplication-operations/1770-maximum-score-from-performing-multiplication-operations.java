class Solution {
    static int ans;
    public int maximumScore(int[] nums, int[] multipliers) {
        Integer dp[][]  = new Integer[nums.length+1][multipliers.length+1];
        return solve(nums,multipliers,0,0,dp);
    }
    
    int solve(int large[],int small[],int index,int start,Integer[][] dp) {
          
        if(index == small.length) {
            return 0;
        }
        
        if(dp[index][start] != null) return dp[index][start];
        
        int ans1 = small[index] * large[start] + solve(large,small,index+1,start+1,dp);
        int ans2 = small[index] * large[large.length-1-(index-start)] + solve(large,small,index+1,start,dp);
        
        
        
        return dp[index][start] = Math.max(ans1,ans2);
    }
}