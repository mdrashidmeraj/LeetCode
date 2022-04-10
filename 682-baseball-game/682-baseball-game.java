class Solution {
    public int calPoints(String[] ops) {
        Stack<Integer> st = new Stack<>();
        int sum = 0;
        for(String s: ops){
            if(s.equals("C")){
                sum-=st.pop();
            }else if(s.equals("D")){
                int x = 2*st.peek();
                sum+=x;
                st.push(x);
            }else if(s.equals("+")){
                int x = st.pop();
                int y = st.peek();
                int z = x+y;
                sum+=z;
                st.push(x);
                st.push(z);
            }else{
                int x = Integer.parseInt(s);
                st.push(x);
                sum+=x;
            }
        }
        return sum;
    }
}