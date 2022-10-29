class Solution 
{
    public int earliestFullBloom(int[] plantTime, int[] growTime) 
    {
        int n = plantTime.length;
        int[][] pairs = new int[n][2];
        
        for (int i = 0; i < n; i++) 
        {
            pairs[i][0] = plantTime[i];
            pairs[i][1] = growTime[i];
        }
        
        Arrays.sort(pairs, (a, b) -> b[1] - a[1]);
        
        int t = 0, c = 0;
        
        for (int[] pair : pairs) 
        {
            c += pair[0];
            t = Math.max(t, c + pair[1]);
        }
        
        return t;
    }
}