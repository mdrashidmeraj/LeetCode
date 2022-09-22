class Solution {
    class Pair{
        int i,j;
        Pair(int i, int j){
            this.i = i;
            this.j = j;
        }
    }
    public int orangesRotting(int[][] grid) {
        Queue<Pair> q = new LinkedList<>();
        int c1 = 0, c2 = 0;
        for(int i= 0;i<grid.length;i++){
            for(int j = 0;j<grid[i].length;j++){
                if(grid[i][j] == 1) c1++;
                if(grid[i][j] == 2){
                    c2++;
                    q.add(new Pair(i,j));
                }
            }
        }
        if(c1 == 0) return 0;
        return helperBFS(grid, q, c1);
    }
    
    int helperBFS(int[][] grid, Queue<Pair> q, int c1){
        int c = 0;
        int ans = -1;
        while(q.size()>0){
            int s = q.size();
            ans+=1;
            while(s-- != 0){
                Pair p = q.remove();
                if( p.i+1 <grid.length && grid[p.i+1][p.j] == 1 ){
                    c++;
                    grid[p.i+1][p.j] = 2;
                    q.add(new Pair(p.i+1, p.j));
                } 
                if(p.i-1>=0 && grid[p.i-1][p.j] == 1 ){
                    c++;
                    grid[p.i-1][p.j] = 2;
                    q.add(new Pair(p.i-1, p.j));
                } 
                if(p.j+1<grid[0].length && grid[p.i][p.j+1] == 1 ){
                    c++;
                    grid[p.i][p.j+1] = 2;
                    q.add(new Pair(p.i, p.j+1));
                } 
                if(p.j-1>=0 && grid[p.i][p.j-1] == 1 ){
                    c++;
                    grid[p.i][p.j-1] = 2;
                    q.add(new Pair(p.i, p.j-1));
                } 
            }
        }
        
        if(c1> c) return -1;
        return ans;
    }
}