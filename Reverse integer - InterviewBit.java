public class Solution {
    public int reverse(int A) {
        if (A == Integer.MIN_VALUE) return 0;
        long ans = 0;
        boolean isNeg = false;
        if(A<0) {A = -1*A; isNeg = true;}
        StringBuilder sb = new StringBuilder(A+"");
        sb = sb.reverse();
        if(isNeg) ans =  -1 * Long.parseLong(sb.toString()); 
        else ans =  Long.parseLong(sb.toString());
        if(ans>Integer.MAX_VALUE || ans<Integer.MIN_VALUE) return 0;
        return (int)(ans);
    }
}
