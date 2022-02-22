public class Solution { 
    public int solve(ArrayList<ArrayList<Integer>> A) {
        int[] start=new int[A.size()];
        int[] end = new int[A.size()];
        for(int i = 0;i<A.size();i++){
            start[i] = A.get(i).get(0);
            end[i] = A.get(i).get(1);
        }
        Arrays.sort(start);
        Arrays.sort(end);
        int res = 0;
        int i =0;
        int j =0;
        while (i<A.size()) {
            if (start[i]<end[j])
                i++;
            else if (start[i]>end[j])
                j++;
            else {
                i++;
                j++;
            }
            res=Math.max(res,i-j);
        }
        return res;
    }
}
