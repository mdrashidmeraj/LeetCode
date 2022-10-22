class Solution {
    public String minWindow(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0;i<t.length();i++){
            map.put(t.charAt(i), map.getOrDefault(t.charAt(i), 0) + 1);
        }
        int n = map.size();
        int i =0;
        int j =0;
        String ans = "";
        int min = Integer.MAX_VALUE;
        while(j<s.length()){
            char ch = s.charAt(j);
            if(map.get(ch) != null){
                map.put(ch, map.get(ch)-1);
                if(map.get(ch) == 0) n--;
            }
            while(n == 0){
                // System.out.println(i +" "+ j);
                if(j-i+1 <= min){
                    ans = s.substring(i, j+1);
                    min = j-i+1;
                }
                if(map.get(s.charAt(i)) != null){
                    map.put(s.charAt(i), map.get(s.charAt(i))+1);
                    if(map.get(s.charAt(i)) == 1) n++;
                }
                i++;
            }
            j++;
        }
        return ans;
    }
}