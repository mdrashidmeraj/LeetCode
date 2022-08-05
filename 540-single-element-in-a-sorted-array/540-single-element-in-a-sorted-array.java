class Solution {
    public int singleNonDuplicate(int[] nums) {
        int lo = 0;
        int hi = nums.length-1;
        while(lo<=hi){
            int mid =  lo +(hi-lo)/2;
            if( mid == 0 || mid == nums.length-1) return nums[mid];
            
            if(mid%2 == 0){
                if(nums[mid-1] == nums[mid]) hi = mid-1;
                else if(nums[mid+1] == nums[mid]) lo = mid+1;
                else return nums[mid];
            }else{
                if(nums[mid+1] == nums[mid]) hi = mid-1;
                else if(nums[mid-1] == nums[mid]) lo = mid+1;
                else return nums[mid];
            }
            
            
            
        }
        return -1;
    }
}