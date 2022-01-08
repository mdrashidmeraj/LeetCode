class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> asf = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        solution(nums,ans,asf,set,nums.length);
        return ans;
    }
    void solution(int[] nums, List<List<Integer>> ans, List<Integer> asf, Set<Integer> set, int n){
      if(set.size()==n){
          ans.add(new ArrayList<>(asf));
          return;
      }  
      for(int i=0;i<n;i++){
          if(!set.contains(nums[i])){
            set.add(nums[i]);
              asf.add(nums[i]);
              solution(nums,ans,asf,set,n);
              set.remove(nums[i]);
              asf.remove(asf.size()-1);
          }
      }  
    }
}