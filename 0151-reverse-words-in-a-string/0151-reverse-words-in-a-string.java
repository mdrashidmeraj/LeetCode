class Solution {
    public String reverseWords(String s) {
        String[] str = s.trim().split("\\s+");
        int i = 0;
        int j = str.length-1;
        while(i<j){
            String temp = str[j];
            str[j] = str[i];
            str[i] = temp;
            i++;
            j--;
            
        }
        return String.join(" ", str);
    }
}