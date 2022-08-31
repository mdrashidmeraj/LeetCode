class Solution {
    
    public List<String> topKFrequent(String[] words, int k) {
        List<String> ans = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();
        for(String s: words){
            if(map.containsKey(s)) map.put(s, map.get(s)+1);
            else map.put(s, 1);
        }
        PriorityQueue<Map.Entry<String, Integer>> pq = new PriorityQueue<>(
                 (a,b) -> a.getValue()==b.getValue() ? b.getKey().compareTo(a.getKey()) : a.getValue()-b.getValue()
        );
        for(Map.Entry<String, Integer> e: map.entrySet()) pq.add(e);
        while(pq.size()>k) pq.remove();
        while(pq.size()>0){
            ans.add(0,pq.remove().getKey());
        }
        return ans;
    }
}