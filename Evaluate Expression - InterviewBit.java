public class Solution {
    public int evalRPN(ArrayList<String> A) {
        Stack<String> st = new Stack<>();
        for(int i =0;i<A.size();i++){
            if(A.get(i).equals("+")){
                int second = Integer.parseInt(st.pop());
                int first = Integer.parseInt(st.pop());
                int sum = first+second;
                st.push(new String(sum+""));
            }
            else if(A.get(i).equals("-")){
                int second = Integer.parseInt(st.pop());
                int first = Integer.parseInt(st.pop());
                int sum = first-second;
                st.push(new String(sum+""));
            }
            else if(A.get(i).equals("*")){
                int second = Integer.parseInt(st.pop());
                int first = Integer.parseInt(st.pop());
                int sum = first*second;
                st.push(new String(sum+""));
            }
            else if(A.get(i).equals("/")){
                int second = Integer.parseInt(st.pop());
                int first = Integer.parseInt(st.pop());
                int sum = first/second;
                st.push(new String(sum+""));
            }
            else st.push(A.get(i));
        }
        return Integer.parseInt(st.pop());
    }
}
