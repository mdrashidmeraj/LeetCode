class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        Deque<Integer> dq = new ArrayDeque<>();
        int i = 0, j = 0;
        int[] res = new int[n-k+1];
        while(i<nums.length){
            while(dq.size()>0 && (nums[dq.peekFirst()]<nums[i] || dq.peekFirst()<j)){
                dq.removeFirst();
            }
            while(dq.size()>0 && nums[dq.peekLast()]<nums[i]){
                dq.removeLast();
            }
            
            dq.addLast(i);
            // System.out.println(dq.toString());
            if(i-j+1 == k){
                res[j] = nums[dq.peekFirst()];
                j++;
            }
            i++;
        }
        return res;
    }
}