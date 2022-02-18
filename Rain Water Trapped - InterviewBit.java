public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int trap(final List<Integer> A) {
        int[] ngr = new int[A.size()];
        int[] ngl = new int[A.size()];
        ngr[A.size()-1] = A.get(A.size()-1);
        ngl[0] = A.get(0);
        for(int i =A.size()-2;i>=0;i--){
            ngr[i] = Math.max(A.get(i),ngr[i+1]);
        }
        for(int i = 1;i<A.size();i++){
            ngl[i] = Math.max(A.get(i),ngl[i-1]);
        }
        int ans = 0;
        for(int i= 0;i<A.size();i++){
            ans += Math.min(ngr[i],ngl[i])-A.get(i);
        }
        return ans;
    }
}
