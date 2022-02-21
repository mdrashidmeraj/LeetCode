class Solution {
    public int majorityElement(int[] nums) {
        int c = 0;
        int n = Integer.MIN_VALUE;
        for(int i: nums){
            if(c == 0){
                n = i;
            }
            if(i == n) c++;
            else c--;
        }
        return n;
    }
}