class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int[] nsr = new int[n];
        Stack<Integer> st = new Stack<>(); 
        for(int i = n-1;i>=0;i--){
            while(st.size()>0 && heights[st.peek()] >= heights[i]){
                st.pop();
            }
            if(st.size() == 0) nsr[i] = n;
            else nsr[i] = st.peek();
            st.push(i);
        }
        int[] nsl = new int[n];
        st = new Stack<>(); 
        for(int i = 0;i<n;i++){
            while(st.size()>0 && heights[st.peek()] >= heights[i]){
                st.pop();
            }
            if(st.size() == 0) nsl[i] = -1;
            else nsl[i] = st.peek();
            st.push(i);
        }
        int ans = 0;
        for(int i=0;i<n;i++){
            int width = nsr[i]-nsl[i]-1;
            int area = heights[i]*width;
            ans = Math.max(ans,area);
        }
        return ans;
    }
}