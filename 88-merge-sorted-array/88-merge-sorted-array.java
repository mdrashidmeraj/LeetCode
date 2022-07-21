class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0;
        int j = 0;
        while(i<m && j<n){
            if(nums1[i]>nums2[j]){
                int temp = nums1[i];
                nums1[i] = nums2[j];
                nums2[j] = temp;
                int k =1;
                for(;k<nums2.length;k++){
                    if(nums2[k]<=temp) nums2[k-1] = nums2[k];
                    else {break;}
                }
                nums2[k-1] = temp;
            }
            i++;
        }
        for(i = 0;i+m<nums1.length;i++){
            nums1[i+m] = nums2[i];
        }
    }
}