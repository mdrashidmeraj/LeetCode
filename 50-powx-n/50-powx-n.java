class Solution {
    public double myPow(double x, int n) {
        double ans = 1;
        long nn = n;
        if(nn<0) nn = -1*nn;
        while(nn>=1){
            if(nn % 2 == 1){
                ans *= x;
                nn--;
            }else{
                x = x*x;
                nn = nn/2;
            }
        }
        if(n<0) return 1/ans;
        return ans;
    }
}