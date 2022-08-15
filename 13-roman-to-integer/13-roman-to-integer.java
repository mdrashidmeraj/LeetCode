class Solution {
    public int romanToInt(String s) {
        int res = 0;
        for(int i =0;i<s.length();i++){
            char ch = s.charAt(i);
            int s1 = value(ch);
            if(i+1 < s.length()){
                int s2 = value(s.charAt(i+1));
                if(s2<=s1){
                    res = res+s1;
                }else{
                    res += s2-s1;
                    i++;
                }
            }else{
                res += s1;
            }
        }
        return res;
    }
    int value(char r){
        if (r == 'I')
            return 1;
        if (r == 'V')
            return 5;
        if (r == 'X')
            return 10;
        if (r == 'L')
            return 50;
        if (r == 'C')
            return 100;
        if (r == 'D')
            return 500;
        if (r == 'M')
            return 1000;
        return -1;
    }
}