class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i: stones){
            pq.add(i);
        }
        while(pq.size()>1){
            int a = pq.poll();
            int b = pq.poll();
            if(a != b) pq.add(Math.abs(a-b));
        }
        return pq.size() >0 ? pq.poll() : 0;
    }
}