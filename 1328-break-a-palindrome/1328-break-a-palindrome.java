class Solution {
    public String breakPalindrome(String s) {
        if(s.length() == 1) return "";
        for(int i = 0;i<s.length()/2;i++){
            if(s.charAt(i) != 'a'){
                return s.substring(0,i)+'a'+s.substring(i+1);
            }
            
        }
        return s.substring(0,s.length()-1)+'b';
    }
}