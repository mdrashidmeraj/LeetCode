class Solution {
    public int findPeakElement(int[] arr) {
        int start = 0;
        int n = arr.length;
        if(n==1) return 0; 
        int end = n-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(mid<n-1 && mid>0){
                if(arr[mid]>arr[mid+1] && arr[mid]>arr[mid-1]){
                    return mid;
                }else{
                    if(arr[mid]>arr[mid+1]){
                        end = mid-1;
                    }else{
                        start = mid+1;
                    }
                }
            }else{
                if(mid == 0)
                    if(arr[mid]>arr[mid+1]) return mid;
                    else return 1;
                else if(mid == n-1)
                    if(arr[mid]>arr[mid-1]) return mid;
                    else return mid-1;
            }
        }
        return 0;
    }
}