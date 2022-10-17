class Solution {
    public boolean checkIfPangram(String s) {
        int[] arr = new int[26];
        for(int i = 0; i<s.length(); i++){
            int idx = (int)(s.charAt(i));
            arr[idx-97] = 1;
        }
        for(int i =0;i<26;i++){
            if(arr[i] == 0) return false;
        }
        return true;
    }
}