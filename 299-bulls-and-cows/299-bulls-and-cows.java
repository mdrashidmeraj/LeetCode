class Solution {
    public String getHint(String secret, String guess) {
        StringBuilder sb = new StringBuilder();
        Map<Character, Integer> map = new HashMap<>();
        int countBulls = 0, countCows = 0;
        for(int i = 0;i<secret.length();i++){
            char sch = secret.charAt(i);
            char gsh = guess.charAt(i);
            if(sch == gsh) countBulls++;
            map.put(sch, map.getOrDefault(sch, 0)+1);
        }
        for(int i = 0;i<guess.length();i++){
            char gch = guess.charAt(i);
            if(map.containsKey(gch)){
                if(map.get(gch)>0){
                    map.put(gch, map.get(gch)-1);
                    countCows+=1;
                } 
            }
        }

        countCows-=countBulls;   
        sb.append(countBulls).append("A").append(countCows).append("B");
        return sb.toString();
    }
}