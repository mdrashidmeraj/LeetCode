class Solution {
    public String frequencySort(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0;i<s.length();i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
        }
        PriorityQueue<Map.Entry<Character, Integer>> pq = new PriorityQueue<>((a,b) -> b.getValue()-a.getValue());
        for(Map.Entry<Character, Integer> e: map.entrySet()){
            pq.add(e);
        }
        StringBuilder sb = new StringBuilder();
        while(pq.size()>0){
            int n = pq.peek().getValue();
            char ch = pq.remove().getKey();
            for(int i = 0;i<n;i++){
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}