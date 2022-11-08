class Solution {
    public String makeGood(String s) {
        Stack<Character> st = new Stack<>();
        for(char c: s.toCharArray()){
            if(st.size() == 0) st.push(c);
            else{
                char ch = st.peek();
                if(c>='A' && c<='Z' && ch>='a' && ch<='z'){
                    if((ch+"").equals((c+"").toLowerCase())){
                        st.pop();
                        continue;
                    }
                }else if(c>='a' && c<='z' && ch>='A' && ch<='Z'){
                    if((c+"").equals((ch+"").toLowerCase())){
                        st.pop();
                        continue;
                    }
                    
                }
                st.push(c);
            }
        }
        StringBuilder sb = new StringBuilder();
        while(st.size()>0){
            sb.insert(0,st.pop());
        }
        return sb.toString();
    }
}

