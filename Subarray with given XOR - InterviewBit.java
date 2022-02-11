public class Solution {
    public int solve(ArrayList<Integer> A, int B) {
        int count = 0;
        int xor = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<A.size();i++){
            xor = xor^A.get(i);
            if(xor == B) count++;
            if(map.containsKey(B^xor)){
                count+=map.get(B^xor);
            }
            map.put(xor, map.getOrDefault(xor,0)+1);
        }
        return count;
    }
}
