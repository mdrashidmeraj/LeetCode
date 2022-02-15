public class Solution {
	public int removeDuplicates(ArrayList<Integer> a) {
        int i = 0;
        int j = i+1;
        while(j<a.size()){
            int x = a.get(i);
            int y = a.get(j);
            if(x != a.get(j)){
                i+=1;
                a.set(i, a.get(j));
            }
            j++;
        }
        return i+1;
	}
}
    
