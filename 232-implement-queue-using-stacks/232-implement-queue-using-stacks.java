class MyQueue {
    Stack<Integer> inp;
    Stack<Integer> out;
    public MyQueue() {
        inp = new Stack<>();
        out = new Stack<>();
    }
    
    public void push(int x) {
        inp.push(x);
    }
    
    public int pop() {
        if(out.size()>0) return out.pop();
        while(inp.size()!=0){
            out.push(inp.pop());
        }
        return out.pop();
    }
    
    public int peek() {
        if(out.size()>0) return out.peek();
        while(inp.size()!=0){
            out.push(inp.pop());
        }
        return out.peek();
    }
    
    public boolean empty() {
        if(inp.size() == out.size()){
            if(inp.size() == 0) return true;
        } 
        return false;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */