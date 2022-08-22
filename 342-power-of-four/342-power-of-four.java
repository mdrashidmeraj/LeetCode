class Solution {
    public boolean isPowerOfFour(int n) {
        if(n == 1) return true;
        if(n == 0) return false;
        long nn = 0;
        if(n<0)
            nn = -1*n;
        else
            nn = n;
        
        while(n != 1)
        {
            if(n % 4 != 0)
            return false;
            n = n / 4;    
        }
        return true;
    }
}