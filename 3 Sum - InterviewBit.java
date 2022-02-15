public class Solution {
    public int threeSumClosest(ArrayList<Integer> A, int B) {
        Collections.sort(A);
        int sum = 0;
        int diff = Integer.MAX_VALUE;
        for(int i= 0; i<A.size(); i++){
            int s = Integer.MAX_VALUE;
            int j = i+1;
            int k = A.size()-1;
            while(j<k){
                s = A.get(i)+A.get(j)+A.get(k);
                if(Math.abs(s-B) < diff) {
                    sum = s;
                    diff = Math.abs(s-B);
                };
                if(s==B) {break;}
                if(s>B){
                    k--;
                }else{
                    j++;
                }          
            }
            if(s == B) break;  
        }
        return sum;
    }
}
