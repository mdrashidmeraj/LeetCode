class Solution {
    public static boolean isVowel(char letter) {
        String vowels = "aeouiAEOUI";
        return vowels.indexOf(letter) != -1; 
    }
    public boolean halvesAreAlike(String s) {
        int n = s.length();
        int c1 = 0;
        int c2 = 0;
        for(int i = 0;i<n;i++){
            if(i<n/2 && isVowel(s.charAt(i))){
                c1++;
            }else if(i>=n/2 && isVowel(s.charAt(i))){
                c2++;
            }
        }
        return c1 == c2;
    }
}