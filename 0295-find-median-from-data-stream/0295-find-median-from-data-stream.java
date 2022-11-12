class MedianFinder {
    PriorityQueue<Integer> minpq;
    PriorityQueue<Integer> maxpq;
    public MedianFinder() {
        minpq = new PriorityQueue<>();
        maxpq = new PriorityQueue<>((a,b)-> b-a);
    } 
    public void addNum(int num) {
        maxpq.add(num);
        if(minpq.size() > 0 && maxpq.size() > 0 && minpq.peek()<maxpq.peek()){
            minpq.add(maxpq.remove());
        }
        
        if(minpq.size() > maxpq.size() + 1){
            maxpq.add(minpq.remove());
        }
        
        if(minpq.size() + 1 < maxpq.size() ){
            minpq.add(maxpq.remove());
        }
        
    }
    public double findMedian() {
        int n1 = minpq.size();
        int n2 = maxpq.size();
        // /System.out.println(minpq.toString() + "m");
        // System.out.println(maxpq.toString());        
        if(n1>n2) return (double)minpq.peek();
        if(n2>n1) return (double)maxpq.peek();
        int sum = minpq.peek()+maxpq.peek();
        return (double)sum/2.0;
        
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */