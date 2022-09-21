class Solution {
    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        int sum = 0;
        for(int i: nums){
            if(i%2 == 0) sum+=i;
        }
        int[] res = new int[queries.length];
        int t = 0;
        for(int[] a: queries){
            int idx = a[1];
            int val = a[0];
            if(nums[idx] % 2 == 0){
                sum -= nums[idx];
            }
            nums[idx] = nums[idx]+val;
            if(nums[idx] % 2 == 0){
                sum += nums[idx];
            }
            res[t++] = sum;
        }
        return res;
    }
}