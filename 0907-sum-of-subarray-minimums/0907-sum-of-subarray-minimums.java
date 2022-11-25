class Solution {
    public int sumSubarrayMins(int[] arr) {
        int n = arr.length;
        long mod = 1000000007;
        int[] leftMin = new int[n];
        Arrays.fill(leftMin,-1);
        int[] rightMin = new int[n];
        Arrays.fill(rightMin,n);
        Stack<Integer> s = new Stack<>();
        for(int i = 0;i<n;i++){
            while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                int index= s.pop();
                rightMin[index] = i;
            }
            s.push(i);
        }
        s.clear();
        for (int i = n-1; i >= 0; i--) {
            while (!s.isEmpty() && arr[s.peek()] > arr[i]) {
                int index= s.pop();
                leftMin[index] = i;
            }
            s.push(i);
        }
        s.clear();
        long res= 0;
        for(int i = 0; i < n; i++) {
            int leftLen= i-leftMin[i];
            int rightLen=rightMin[i]-i;
            res=(res+((long)arr[i]*leftLen*rightLen)%mod)%mod;
        }
        return (int)res;
    }
}