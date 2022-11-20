class Solution {
    public int calculate(String s) {
        Stack<Integer> st = new Stack<>();
        int res = 0;
        int num = 0;
        int sign = 1;
        for(char ch : s.toCharArray()){
            if(Character.isDigit(ch)){
                num = num*10 + (int)(ch -'0');
            }else if(ch == '+'){
                res+= sign * num;
                num = 0;
                sign = 1;
            }else if(ch == '-'){
                res+= sign * num;
                num = 0;
                sign = -1;
            }else if(ch == '('){
                st.push(res);
                st.push(sign);
                sign = 1;   
                res = 0;
            }else if(ch == ')'){
                res += sign*num;
                num = 0;
                res *= st.pop();    
                res += st.pop();
            }
        }
        if(num != 0){
            res+= sign * num;
        }
        return res;
    }
}