class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        int count = 0;
        int max = 0;
        HashSet<Integer> set = new HashSet<>();
        for(int i: nums) set.add(i);
        for(int i =0;i<nums.length;i++){
            if(set.contains(nums[i]+1)) continue;
            count = 1;
            int num = nums[i];
            while(set.contains(num-1)){
                count++;
                num-=1;
            }
            if(count>max) max = count;
        }
        return max;
    }
}