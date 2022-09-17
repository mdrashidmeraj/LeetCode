class Solution {
    public int maximalRectangle(char[][] matrix) {
        int ans = 0;
        int[] arr = new int[matrix[0].length];
        for(int j = 0; j<matrix[0].length; j++){
            arr[j] = matrix[0][j] - '0';
        }
        ans = Math.max(ans, maxArea(arr));
        for(int i = 1;i<matrix.length; i++){
            for(int j = 0;j<matrix[i].length; j++){
                if(matrix[i][j] == '0') arr[j] = 0;
                else arr[j] = arr[j] + (matrix[i][j] - '0');
            }
            ans = Math.max(ans, maxArea(arr));
        }
        return ans;
    }
    
    private int maxArea(int[] heights){
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