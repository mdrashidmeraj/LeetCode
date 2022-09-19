class Solution {
    public List<List<String>> findDuplicate(String[] paths) {
        List<List<String>> result = new ArrayList<List<String>>();
        int n = paths.length;
        if (n == 0) return result;
        Map<String, Set<String>> map = new HashMap<>();
        for(String path: paths){
            String[] p = path.split(" ");
            for(int i = 1;i<p.length;i++){
                int idx = p[i].indexOf("(");
                String content = p[i].substring(idx);
                String file = p[0] +"/" +p[i].substring(0, idx);
                Set<String> filename = map.getOrDefault(content, new HashSet<String>()); 
                filename.add(file);
                map.put(content, filename);
            }
        }
        for (String key : map.keySet()) {
            if (map.get(key).size() > 1) {
                result.add(new ArrayList<String>(map.get(key)));
            }
        }
        return result;
    }
}