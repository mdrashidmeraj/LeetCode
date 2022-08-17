class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        Set<String> set = new HashSet<>();
        for(int i =0;i<words.length;i++){
            set.add(morseFinder(words[i], morse));
        }
        return set.size();
    }
    String morseFinder(String word, String[] morse){
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i<word.length();i++){
            sb.append(morse[(int)(word.charAt(i)) - 97]);
        }
        return sb.toString(); 
    }
}