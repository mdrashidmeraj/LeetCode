class Solution {
    public String getSmallestString(int n, int k) {
        char[] ans = new char[n];
        for(int i = 0;i<n;i++){
            ans[i] = 'a';
        }
        k = k-n;
        for(int i = n-1;i>=0;i--){
            if(k == 0) break;
            if(k<25){
                ans[i] = (char)('a' + k);
                k = 0;
            }else{
                ans[i] = 'z';
                k -=25;
            }
        }
        return new String(ans);
        
    }
}