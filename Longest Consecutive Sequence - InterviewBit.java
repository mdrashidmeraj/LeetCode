public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int longestConsecutive(final List<Integer> A) {
        HashSet<Integer> set = new HashSet<>();
        int max = 0; 
        for(int i: A){
            set.add(i);
        }
        for(int i = 0;i<A.size();i++){
            int num = A.get(i);
            int len = 1;
            if(!set.contains(num-1)){
                while(set.contains(num+1)){
                    len++;
                    num++;
                }
            }
            max = Math.max(len,max);
        }
        return max;
    }
}
