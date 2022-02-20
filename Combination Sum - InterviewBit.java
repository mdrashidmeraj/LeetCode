public class Solution {
    public ArrayList<ArrayList<Integer>> combinationSum(ArrayList<Integer> A, int B) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        Collections.sort(A);
        helper(0, B, A, new ArrayList<>(), ans);
        return ans;
    }
    void helper(int i, int t, ArrayList<Integer> a, ArrayList<Integer> asf, ArrayList<ArrayList<Integer>> ans){
        if(i == a.size()){
            if(t == 0 && !ans.contains(asf)){
                ans.add(new ArrayList<>(asf));
            }
            return;
        }
        if(a.get(i)<=t){
            asf.add(a.get(i));
            helper(i, t-a.get(i), a, asf, ans);
            asf.remove(asf.size()-1);
        }
        helper(++i,t, a, asf, ans);
    }
}
