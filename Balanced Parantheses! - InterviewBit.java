public class Solution {
    public int solve(String A) {
        Stack<Character> st = new Stack<>();
        for(int i = 0;i<A.length(); i++){
            char ch = A.charAt(i);
            if(ch=='(' || ch == '{' || ch == '[') st.push(ch);
            else{
                if(st.size() == 0) return 0;
                if(ch == ')'){
                    if(st.peek() == '(') st.pop();
                    else return 0;
                }else if(ch == '}'){
                    if(st.peek() == '{') st.pop();
                    else return 0;
                }else if(ch == ']'){
                    if(st.peek() == '[') st.pop();
                    else return 0;
                }
            }
        }
        if(st.size()>0) return 0;
        return 1;
    }
}
