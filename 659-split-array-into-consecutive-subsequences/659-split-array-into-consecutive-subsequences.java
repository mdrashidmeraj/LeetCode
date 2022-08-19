class Solution {
    public boolean isPossible(int[] nums) {
        int n = nums.length;
        if(n<3) return false;
        HashMap<Integer, Integer> fmap = new HashMap<>();
        HashMap<Integer, Integer> hmap = new HashMap<>();
        for(int i=0;i<n;i++){
            fmap.put(nums[i], fmap.getOrDefault(nums[i], 0)+1);
        }
        for(int i = 0;i<n;i++){
            if(fmap.get(nums[i])>=1){
                if(hmap.containsKey(nums[i]) && hmap.get(nums[i])>0){
                    hmap.put(nums[i], hmap.get(nums[i])-1);
                    hmap.put(nums[i]+1, hmap.getOrDefault(nums[i]+1, 0)+1);
                    fmap.put(nums[i], fmap.get(nums[i])-1);
                }else{
                    fmap.put(nums[i], fmap.get(nums[i])-1);
                    for(int j = nums[i]+1; j<=nums[i]+2; j++){
                        if(!fmap.containsKey(j) || fmap.get(j)<=0) return false;
                        else fmap.put(j, fmap.get(j)-1);
                    }
                    hmap.put(nums[i]+3, hmap.getOrDefault(nums[i]+3, 0)+1);
                }
            }
            
        }
        return true;
    }
}