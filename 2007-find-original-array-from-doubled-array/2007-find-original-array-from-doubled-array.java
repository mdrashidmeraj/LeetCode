class Solution {
    public int[] findOriginalArray(int[] changed) {
        int n = changed.length;
        if (n % 2 == 1) return new int[0];
        int[] ans = new int[n/2];
        Map<Integer, Integer> map = new TreeMap<>();
        for(int i: changed){
            map.put(i, map.getOrDefault(i, 0)+1);
        }
        int i = 0;
        for (int x : map.keySet()) {
            if (map.get(x) > map.getOrDefault(x + x, 0))
                return new int[0];
            for (int j = 0; j < map.get(x); ++j) {
                ans[i++] = x;
                map.put(x + x, map.get(x + x) - 1);
            }
        }
        return ans;
    }
}