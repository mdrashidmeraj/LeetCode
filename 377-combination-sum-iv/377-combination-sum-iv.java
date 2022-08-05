class Solution {
     int[][] dp;
    public int combinationSum4(int[] nums, int target) {
        Arrays.sort(nums);
        dp= new int[nums.length+1][target+1];
        for(int[] a: dp){
            Arrays.fill(a,-1);
        }
        return helper(nums, target, 0);
        
    }
    int helper(int[] a, int t, int i){
        if(t == 0){
            // System.out.println(asf);
            return 1;
        }
        
        if(i == a.length) return 0;
        if(dp[i+1][t] != -1) return dp[i+1][t];
        int c = 0;
        
        if(a[i]<=t){
            c += helper(a, t-a[i], 0);
        }
        
        c += helper(a, t, i+1);
        
        return dp[i+1][t] = c;
    }
}