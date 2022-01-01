class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> asf = new ArrayList<>();
        Arrays.sort(nums);
        solution(0,nums,nums.length,ans,asf);
        return new ArrayList<>(ans);
        
    }
    
    void solution(int idx, int[] nums,int n,List<List<Integer>> ans,ArrayList<Integer> asf){

        ans.add(new ArrayList<>(asf));
        
        for(int i = idx;i<n;i++){
            if(i != idx && nums[i] == nums[i-1]) continue;
            asf.add(nums[i]);
            solution(i+1,nums,n,ans,asf);
            asf.remove(asf.size()-1);
            
        }
        
        
    }
}