class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;
        int lo = 0;
        int hi = n-1;
        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            int nxt = (mid+1)%n;
            int prev = (mid-1+n)%n;
            if(nums[mid]<=nums[prev] && nums[mid]<=nums[nxt]) return nums[mid];
            if(nums[mid]>nums[n-1]){
                lo = mid+1;
            }else hi = mid-1;
        }
        return -1;
    }
}