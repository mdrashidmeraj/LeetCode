class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st = new Stack<>();
        for(char c: s.toCharArray()){
            if(st.size()>0 && st.peek() == c){
                st.pop();
            }
            else st.push(c);
        }
        StringBuilder sb = new StringBuilder();
        while(st.size()>0){
            sb.insert(0, st.pop());
        }
        return sb.toString();
    }
}