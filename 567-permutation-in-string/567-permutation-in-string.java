class Solution {
    public boolean checkInclusion(String s1, String s2) {
        HashMap<Character, Integer> map = new HashMap<>();
        int uni = 0;
        for(int i=0;i<s1.length();i++){
            char ch = s1.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch, map.get(ch)+1);
            }else{
                map.put(ch,1);
                uni++;
            }
        }
        int i =0;
        int j = i;
        while(j<s2.length()){
            char ch = s2.charAt(j);
            if(map.containsKey(ch)){
                map.put(ch, map.get(ch)-1);
                if(map.get(ch) == 0) uni--;
            }
            if(uni == 0){
                while(uni == 0 && i<=j){
                    if(j-i+1 == s1.length()) return true;
                    if(map.containsKey(s2.charAt(i))){
                        map.put(s2.charAt(i), map.get(s2.charAt(i))+1);
                        if(map.get(s2.charAt(i)) == 1) uni++;
                    }
                    i++;
                }
            }
            j++;
        }
        return false;
    }
}