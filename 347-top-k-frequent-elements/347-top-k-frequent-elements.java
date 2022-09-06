class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i: nums){
            map.put(i, map.getOrDefault(i, 0)+1);
        }
        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>((a,b)-> a.getValue()-b.getValue());
        for(Map.Entry<Integer, Integer> e: map.entrySet()){
            pq.add(e);
            if(pq.size()>k) pq.remove();
        }
        int[] ans = new int[k];
        for(int i = k-1; i>=0; i--){
            ans[i] = pq.remove().getKey();
        }
        return ans;
    }
}