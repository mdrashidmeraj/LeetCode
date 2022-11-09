class StockSpanner {
    Stack<int[]> st;
    public StockSpanner() {
        st = new Stack<>();
    }
    
    public int next(int price) {
        int c = 1;
        while(st.size()>0 && st.peek()[0]<=price){
            c+=st.pop()[1];
        }
        st.push(new int[]{price, c});
        return st.peek()[1];
    }
    
    
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */