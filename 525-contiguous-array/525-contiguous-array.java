class Solution {
    public int findMaxLength(int[] nums) {
        int Sum = 0, max = 0;
   HashMap<Integer, Integer> map = new HashMap<>();
    for(int i=0; i<nums.length; i++) {
        Sum += nums[i]== 0 ? -1 : 1;
        if(Sum == 0) {
            max = i+1;
        } else if(map.containsKey(Sum)) {
            max = Math.max(max, i-map.get(Sum));
        } else {
            map.put(Sum, i);
        }
    }
    return max;

    }
}