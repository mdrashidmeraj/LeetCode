class Solution {
    public int findKthLargest(int[] nums, int k) {
        int n = nums.length;
        Arrays.sort(nums);
        return nums[n-k];
        // k = n-k+1;
        // PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->b-a);
        // for(int i: nums){
        //     pq.add(i);
        //     if(pq.size()>k)pq.poll();
        // }
        // return pq.peek();
    }
}