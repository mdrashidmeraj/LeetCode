class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length <=2) return nums.length;
        int i =2;
        int j =i;
        while(j<nums.length){
		    if (nums[j] != nums[i - 2])
			    nums[i++] = nums[j];
            j++;
        }
			
	return i;
    }
}