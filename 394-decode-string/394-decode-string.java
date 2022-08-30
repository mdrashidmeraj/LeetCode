class Solution {
    public String decodeString(String s) {
        Stack<String> st = new Stack<>();
        for(int i = 0;i<s.length();i++){
            String ch = s.charAt(i)+"";
            if(!ch.equals("]")) st.push(ch);
            else{
                String res = "";
                while(!st.peek().equals("[")){
                    res = st.pop()+res;
                }
                st.pop();
                String k = "";
                while(st.size()>0 && Character.isDigit(st.peek().charAt(0))) k=st.pop()+k;
                int n = Integer.parseInt(k);
                while(n-- != 0){
                    st.push(res);
                }
            }
        }
        String ans = "";
        while(st.size()>0){
            ans=st.pop()+ans;
        }
        return ans;
    }
}