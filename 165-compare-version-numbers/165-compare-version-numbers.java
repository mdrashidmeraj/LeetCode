class Solution {
    public int compareVersion(String version1, String version2) {
        String[] arr1 = version1.split("\\.");
        String[] arr2 = version2.split("\\.");
        
        int maxLength = Math.max(arr1.length, arr2. length);
        
        for(int i = 0; i<maxLength; i++){
            int v1 = i<arr1.length ? Integer.parseInt(arr1[i]) : 0;
            int v2 = i<arr2.length ? Integer.parseInt(arr2[i]) : 0;
            
            if(v1>v2) return 1;
            else if(v1<v2) return -1;
        }
        
        return 0;
    }
}