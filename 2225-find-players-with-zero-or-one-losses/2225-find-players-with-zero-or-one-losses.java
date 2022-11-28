class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        int[] losers = new int[100001];
        boolean[] played = new boolean[100001];
        int n = 0;
        for(int[] m: matches){
            losers[m[1]]+=1;
            played[m[0]] = true;
            played[m[1]] = true;
            n = Math.max(n, Math.max(m[0], m[1]));
        }
        List<Integer> zero = new ArrayList<>();
        List<Integer> one = new ArrayList<>();
        for(int i = 1;i<=n;i++){
            if(losers[i] == 0 && played[i]){
                zero.add(i);
            }else if(losers[i] == 1){
                one.add(i);
            }
        }
        List<List<Integer>> arr = new ArrayList<>();
        arr.add(zero);
        arr.add(one);
        return arr;
    }
}