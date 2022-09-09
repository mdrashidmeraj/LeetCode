class Solution {
    public int numberOfWeakCharacters(int[][] properties) {
        Arrays.sort(properties, (a,b)-> (a[0] == b[0])? a[1]-b[1]: b[0]-a[0]);
        int n = properties.length;
        int ans = 0;
        int max = Integer.MIN_VALUE;
        for(int i = 0;i<n; i++){
            if(properties[i][1]<max) ans++;
            max = Math.max(max, properties[i][1]);
        }
        return ans;
    }
}