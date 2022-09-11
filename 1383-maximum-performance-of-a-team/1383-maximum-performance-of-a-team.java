class Solution {
    class Pair{
        int s, e;
        Pair(int e, int s){
            this.s = s;
            this.e = e;
        }
    }
    public int maxPerformance(int n, int[] speed, int[] efficiency, int k) {
        PriorityQueue<Pair> maxEff = new PriorityQueue<>((a,b)-> b.e-a.e);
        PriorityQueue<Pair> minSpeed = new PriorityQueue<>((a,b)-> a.s-b.s);
        for(int i = 0;i<n;i++){
            maxEff.add(new Pair(efficiency[i], speed[i]));
        }
        long min = Long.MAX_VALUE;
        long speedSum = 0;
        long ans = Long.MIN_VALUE;
        for(int i = 0;i<n;i++){
            Pair p = maxEff.remove();
            if(minSpeed.size()<k){
                speedSum += p.s;
                min = Math.min(min, p.e);
                minSpeed.add(p);
                ans = Math.max(min*speedSum, ans);
            }else{
                speedSum += p.s;
                min = Math.min(min, p.e);
                Pair pr = minSpeed.remove();
                minSpeed.add(p);
                speedSum -= pr.s;
                ans = Math.max(min*speedSum, ans);
            }
        }
        int a = (int)(ans%1000000007);
        return a;
    }
}