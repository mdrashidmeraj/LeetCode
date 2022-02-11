public class Solution {
    public int lengthOfLongestSubstring(String A) {
        int i =0,j=0;
        int max = 0;
        HashSet<Character> set = new HashSet<>();
        while(j<A.length()){
            char ch = A.charAt(j);
            if(!set.contains(ch)){
                max = Math.max(j-i+1,max);
                set.add(ch);
            }
            else{
                while(i< j && set.contains(ch)){
                    set.remove(A.charAt(i));
                    i++;
                }
                set.add(ch); 
            }
            j++;
        }
        return max;
    }
}
