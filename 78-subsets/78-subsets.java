class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        helper(nums, new ArrayList<>(), 0, ans);
        return ans;
    }
    void helper(int[] nums, ArrayList<Integer> arr, int i, List<List<Integer>> ans){
        if(i == nums.length){
            ans.add(new ArrayList<>(arr));
            return;
        }
        helper(nums,arr,i+1,ans);
        arr.add(nums[i]);
        helper(nums,arr, i+1, ans);
        arr.remove(arr.size()-1);
        return;
    }
}