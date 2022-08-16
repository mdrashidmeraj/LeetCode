class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character, ArrayList<Integer>> map = new HashMap<>();
        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(map.containsKey(ch)) {
                ArrayList<Integer> a = map.get(ch);
                a.add(i);
                map.put(ch, a);    
            }else{
                ArrayList<Integer> arr = new ArrayList<>();
                arr.add(i);
                map.put(ch, arr);   
            }
        }
        int ans = Integer.MAX_VALUE;
        for(char ch: map.keySet()){
            if(map.get(ch).size() == 1){
                ans = Math.min(ans, map.get(ch).get(0));
            } 
        }
        return ans == Integer.MAX_VALUE ?  -1:  ans;
    }
}