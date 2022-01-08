class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> asf = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        solution(nums,ans,asf,set,0,nums.length);
        return ans;
    }
    void solution(int[] nums, List<List<Integer>> ans, List<Integer> asf, Set<Integer> set, int idx, int n){
      if(set.size()==n){
          ans.add(new ArrayList<>(asf));
          return;
      }  
      for(int i=idx;i<n;i++){
          if(!set.contains(nums[i])){
            set.add(nums[i]);
              asf.add(nums[i]);
              solution(nums,ans,asf,set,idx,n);
              set.remove(nums[i]);
              asf.remove(asf.size()-1);
          }
      }  
    }
}