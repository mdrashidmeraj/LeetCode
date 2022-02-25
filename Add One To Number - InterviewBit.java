public class Solution {
    public ArrayList<Integer> plusOne(ArrayList<Integer> A) {
        ArrayList<Integer> arr = new ArrayList<>();
        int carry = 0;
        for(int i = A.size()-1; i>=0; i--){
            int x = A.get(i);
            if(i == A.size()-1) x = x+1+carry;
            else x = x+carry;
            carry = x/10;
            x = x%10;
            arr.add(0,x);
        }
        arr.add(0,carry);
        int i = 0;
        while(i< arr.size() && arr.get(i) == 0){
            arr.remove(i);
        }
        return arr;
    }
}
