class Solution {
    public int reversePairs(int[] nums) {
        return merge(nums, 0, nums.length-1);
    }
    public int merge(int[] nums, int lo, int hi){
        int c = 0;
        if(lo<hi){
            int mid = lo+(hi-lo)/2;
            c+=merge(nums, lo, mid);
            c+=merge(nums, mid+1, hi);
            c+=mergeSort(nums, lo,mid,hi);
        }
        return c;
    }
    public int mergeSort(int[] arr, int lo, int mid, int hi){
        int[] left = Arrays.copyOfRange(arr, lo, mid+1);
        int[] right = Arrays.copyOfRange(arr, mid+1, hi+1);
        int i = 0,  j = mid+1,  k =lo,  count = 0;
        for(i = lo;i<=mid;i++){
            while(j<=hi && arr[i] > (2* (long)arr[j])) ++j;
            count += (j-(mid+1));
        }
        i = 0; j = 0; 
        while(i<left.length && j<right.length){
            if(left[i]<=right[j]) arr[k++] = left[i++];
            else arr[k++] = right[j++];
             
        }
        while(i<left.length){
            arr[k++] = left[i++];
        }
        while(j<right.length){
            arr[k++] = right[j++];
        }
        return count;
    }
}