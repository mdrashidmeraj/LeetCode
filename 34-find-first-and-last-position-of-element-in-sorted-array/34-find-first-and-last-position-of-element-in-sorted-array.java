class Solution {
    public int[] searchRange(int[] nums, int target) {
        int lo = 0;
        int hi = nums.length-1;
        int[] ans = new int[2];
        Arrays.fill(ans,-1);
        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            if(nums[mid] == target){
                ans[0] = first(nums,lo,mid,target);
                ans[1] = last(nums,mid,hi,target);
                break;
            }else if(nums[mid]>target){
                hi = mid-1;
            }else {
                lo = mid+1;
            }
        }
        return ans;
    }
    public int first(int[] nums, int lo, int hi, int target){
        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            if(nums[mid] >= target){
                hi = mid-1;
            }else {
                lo = mid+1;
            }
        }
        return lo;
    }
    
    public int last(int[] nums, int lo, int hi, int target){
        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            if(nums[mid] <= target){
                lo = mid+1;
            }else {
                hi = mid-1;
            }
        }
        return hi;
    }
}