class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int lo = 0;
        int hi = n-1;
        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            if(nums[mid] ==  target) return mid;
            int next = (mid+1)%n;
            int prev = (mid-1+n)%n;
            if(nums[mid]<nums[next] && nums[mid]<nums[prev]){
                int leftFound = binarySearch(nums, 0, mid-1, target);
                int rightFound = binarySearch(nums, mid, n-1, target);
                if(leftFound != -1) return leftFound;
                else if(rightFound != -1) return rightFound;
                else return -1;
            }
            if(nums[mid]<nums[0]){
                hi = mid-1;
            }else if(nums[mid]>nums[n-1]){
                lo = mid+1;
            }
            else{
                if(nums[mid]> target) hi = mid-1;
                else lo = mid+1;
            }
        }
        return -1;
    }
    int binarySearch(int[] nums, int lo, int hi, int t){
        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            if(nums[mid] ==  t) return mid;
            else if(nums[mid]> t) hi = mid-1;
            else lo = mid+1;
        }
        return -1;
    }
}