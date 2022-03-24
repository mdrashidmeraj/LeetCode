class Solution {
    public int numRescueBoats(int[] people, int limit) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int ans = 0;
        for(int i: people)
            map.put(i, map.getOrDefault(i, 0)+1);
        for(int i = 0;i<people.length;i++){
            if(map.get(people[i])>0){
                map.put(people[i], map.get(people[i])-1);
                int t = limit-people[i];
                if(t > 0) {
                    while(t>0 && (map.get(t) == null || map.get(t) == 0)){
                        t--;
                    }
                    if(t != 0){
                        map.put(t, map.get(t)-1);
                    }
                }
                ans++;
            }
        }
        
        return ans;
    }
}