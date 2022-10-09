class TimeMap {
    HashMap<String, TreeMap<Integer, String>> map; 
    public TimeMap() {
        map = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        if(map.containsKey(key)){
            TreeMap<Integer, String> tm = map.get(key);
            tm.put(timestamp, value);
        }else{
            map.put(key, new TreeMap<Integer, String>());
            TreeMap<Integer, String> tm = map.get(key);
            tm.put(timestamp, value);
        }
    }
    
    public String get(String key, int timestamp) {
        if(map.containsKey(key)){
            TreeMap<Integer, String> tm = map.get(key);
            while(timestamp > 0){
                if(tm.containsKey(timestamp)){
                    return tm.get(timestamp);
                }
                timestamp--;
            }

        }
        return "";
    }
}

/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */