/*        For e.g. in case of the array [23,2,6,4,7] the running sum is [23,25,31,35,42] and the remainders are [5,1,1,5,0]. We got remainder 5 at index 0 and at index 3. That means, in between these two indexes we must have added a number which is multiple of the k. Hope this clarifies your doubt :) */

class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        if(nums.length<2) return false;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,-1);
        int tSum = 0;
        for(int i =0; i<nums.length; i++){
            tSum+=nums[i];
            tSum = tSum%k;
            if(map.containsKey(tSum)){
                if(i - map.get(tSum) > 1) return true;
            }
            else map.put(tSum, i);
        }       
        return false;
    }
}