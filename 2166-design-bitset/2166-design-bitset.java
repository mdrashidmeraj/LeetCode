class Bitset {
    private int[] arr;
    private boolean fl;
    private int count;
    public Bitset(int size) {
        arr = new int[size];
        fl = false;
        count =0;
    }
    public void fix(int idx) {
        if(!fl){
            if(arr[idx] == 0){
                arr[idx] = 1;
                count++;
            }
        }else{
            if(arr[idx] == 1){
                arr[idx] = 0;
                count++;
            }
        }
        
    }
    
    public void unfix(int idx) {
        if(!fl){
            if(arr[idx] == 1){
                arr[idx] = 0;
                count--;
            }
        }else{
            if(arr[idx] == 0){
                arr[idx] = 1;
                count--;
            }
        }
        
            
    }
    
    public void flip() {
        fl = !fl;
        count = arr.length-count;
    }
    
    public boolean all() {
        return count == arr.length;
    }
    
    public boolean one() {
        return count>=1;
    }
    
    public int count() {
        return count;
    }
    
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if(!fl){
            for(int i =0;i<arr.length;i++){
                if(arr[i] == 0) sb.append("0");
                else sb.append("1");
            }
        }else{
           for(int i =0;i<arr.length;i++){
                if(arr[i] == 0) sb.append("1");
                else sb.append("0");
            } 
        }
        return sb.toString();
    }
}

/**
 * Your Bitset object will be instantiated and called as such:
 * Bitset obj = new Bitset(size);
 * obj.fix(idx);
 * obj.unfix(idx);
 * obj.flip();
 * boolean param_4 = obj.all();
 * boolean param_5 = obj.one();
 * int param_6 = obj.count();
 * String param_7 = obj.toString();
 */