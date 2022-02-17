class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> asf = new ArrayList<>();
        helper(0,candidates,target,asf,ans);
        return ans;
    }
    void helper(int i,  int[] arr, int t, List<Integer> asf, List<List<Integer>> ans){
        
        if(i == arr.length || t == 0 ){
            if(t == 0)
                ans.add(new ArrayList<>(asf));
            return;
        }
        if(arr[i]<=t){
            asf.add(arr[i]);
            helper(i,arr,t-arr[i],asf,ans);
            asf.remove(asf.size()-1);
        }
        helper(++i, arr,t,asf,ans);
        
    }
}