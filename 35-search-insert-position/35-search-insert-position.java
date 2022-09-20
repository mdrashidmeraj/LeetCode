class Solution {
    public int searchInsert(int[] nums, int target) {
        int n = nums.length;
        int ans = n;
        for(int i = 0;i<n;i++){
            if(nums[i]>=target) {ans = i; break;}
        }
        return ans;
    }
}