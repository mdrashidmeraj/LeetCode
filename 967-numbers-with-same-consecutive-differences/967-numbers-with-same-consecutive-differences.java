class Solution {
    public int[] numsSameConsecDiff(int n, int k) {
         List<Integer> cur = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        for(int i = 2;i<=n;i++){
            List<Integer> cur2 = new ArrayList<>();
            for(int x: cur){
                int no = x%10;
                if(no+k<=9) cur2.add(x*10 + no+k);
                if(k>0 && no-k>=0) cur2.add(x*10+no-k);
            }
            cur = cur2;
        }
        return cur.stream().mapToInt(j->j).toArray();
    }
}