public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public ArrayList<Integer> repeatedNumber(final List<Integer> A) {
        int n = A.size();
        ArrayList<Integer> arr = new ArrayList<>();
        int xor = 0;
        for(int i : A){
            xor = xor^i;
        }
        for(int i =1;i<=n;i++){
            xor = xor^i;
        }
        int right_most_set_bit = xor&~(xor-1);
        int a =0,b=0;
        for(int i: A){
            if((i & right_most_set_bit) != 0){
                a = a^i;
            }else b = b^i;
        }
        for(int i =1;i<=n;i++){
            if((i & right_most_set_bit) != 0){
                a = a^i;
            }else b = b^i;    
        }

        for(int i: A){
            if(i == a){
                arr.add(a);
                break;
            } 
        }
        if(arr.size() == 0){
            arr.add(b);
            arr.add(a);
        }else{
            arr.add(b);
        }
        return arr;
    }
}
