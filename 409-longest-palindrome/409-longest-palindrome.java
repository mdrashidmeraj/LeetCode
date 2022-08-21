class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0;i<s.length();i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
        }
        int len = 0;
        boolean odd = false;
        for(Map.Entry<Character, Integer> e: map.entrySet()){
            if(e.getValue()%2 == 0) len+=e.getValue();
            else{
                if(!odd){
                    len+=e.getValue();
                    odd = true;
                }else{
                    len=len+e.getValue()-1;
                }
            }
        }
        return len;
    }
}