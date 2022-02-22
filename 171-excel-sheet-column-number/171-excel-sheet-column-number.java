class Solution {
    public int titleToNumber(String columnTitle) {
        int ans = 0;
        int n = columnTitle.length();
        for(int i = 0; i<n; i++){
            char ch = columnTitle.charAt(i);
            int a = (int)(ch - 64);
            ans *= 26;
            ans += a;
                        
        }
        return ans;
        
    }
}