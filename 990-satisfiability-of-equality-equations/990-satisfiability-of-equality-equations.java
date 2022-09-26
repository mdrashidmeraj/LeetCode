class Solution {
    static int[] parent;
    static int[] rank;
    public boolean equationsPossible(String[] equations) {
        parent = new int[26];
        rank = new int[26];
        for(int i = 0;i<26;i++){
            parent[i] = i;
        }
        for(String s: equations){
            char ch1 = s.charAt(0);
            char ch2 = s.charAt(3);
            String eq = s.substring(1, 3);
            if(eq.equals("==")){
                int a = (int)(ch1-97);
                int b = (int)(ch2-97);
                union(a,b);
            }   
        }
        for(String s: equations){
            char ch1 = s.charAt(0);
            char ch2 = s.charAt(3);
            String eq = s.substring(1, 3);
            if(eq.equals("!=")){
                int a = (int)(ch1-97);
                int b = (int)(ch2-97);
                if(find(a) == find(b)){
                    return false;
                }
            }   
        }
        return true;
    }
    int find(int a){
        if(parent[a] != a) {
            parent[a] = find(parent[a]);
        }
        return parent[a];
    }
    void union(int a, int b){
        int x = find(a);
        int y = find(b);
        if(x == y) return;
        if(rank[x]<rank[y]){
            parent[x] = y;
        }else if(rank[x]>rank[y]){
            parent[y] = x;
        }else{
            parent[y] = x;
            rank[x] = rank[x]+1;
        }
    }
}