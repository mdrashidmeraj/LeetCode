class Solution {
    public int largestOverlap(int[][] img1, int[][] img2) {
        int n = img1.length;
        List<int[]> l1 = new ArrayList<>();
        List<int[]> l2 = new ArrayList<>();
        for(int i = 0;i<n;i++){
            for(int j =0;j<n;j++){
                if(img1[i][j] == 1) l1.add(new int[]{i,j});
                if(img2[i][j] == 1) l2.add(new int[]{i,j});
            }
        }
        Map<String, Integer> map = new HashMap<>();
        for(int[] la: l1){
            for(int[] lb: l2){
                String s = (la[0] - lb[0]) + " " + (la[1]-lb[1]);
                map.put(s, map.getOrDefault(s, 0) + 1);
            }
        }
        int max = 0;
        for (int count : map.values())
            max = Math.max(max, count);
        return max;
    }
}