public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int majorityElement(final List<Integer> A) {
        int n = -1;
        int count =0;
        for(int i :A){
            if(count == 0){
                n=i;
                count++;
            }else if(i==n){
                count++;
            }else count--;
        }
        return n;
    }
}
