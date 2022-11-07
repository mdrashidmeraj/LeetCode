class Solution {
    public int maximum69Number (int num) {
        String n = String.valueOf(num);
        for(int i = 0;i<n.length();i++){
            if(n.charAt(i) == '6') {
                n = n.substring(0,i)+'9'+n.substring(i+1);
                break;
            }
        }
        return Integer.parseInt(n);
    }
}