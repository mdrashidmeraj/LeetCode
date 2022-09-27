class Solution {
    public String longestPalindrome(String s) {
        if(s.length()<=1) return s;
        int maxlen = 1, n = s.length();
        int st = 0;
        int end = 0;
        //odd len
        for(int i = 0;i<n;i++){
            int l = i, r = i;
            while(l>=0 && r<n){
                if(s.charAt(l) == s.charAt(r)){
                    l--;
                    r++;
                }else break;
            }
            int len = r-l+1;
            if(len>maxlen){
                maxlen = len;
                st = l+1;
                end = r;
            }
        }
        //even len
        for(int i = 0;i<n;i++){
            int l = i, r = i+1;
            while(l>=0 && r<n){
                if(s.charAt(l) == s.charAt(r)){
                    l--;
                    r++;
                }else break;
            }
            int len = r-l+1;
            if(len>maxlen){
                maxlen = len;
                st = l+1;
                end = r;
            }
        }
        return s.substring(st,end);
    }
}