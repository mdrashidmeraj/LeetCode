class Solution {
    class Pair{
        int k;
        int v;
        Pair(int k, int v){
            this.k = k;
            this.v = v;
        }
    }
    public int minSetSize(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i =0;i<arr.length;i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
        }
        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b)-> b.v-a.v);
        for(Map.Entry<Integer, Integer> m: map.entrySet()){
            pq.add(new Pair(m.getKey(), m.getValue()));
        }
        int sum = 0;
        for(int i = 0;i<pq.size();i++){
            sum+=pq.remove().v;
            if(sum>=arr.length/2) return i+1;
        }
        return -1;
    }
}