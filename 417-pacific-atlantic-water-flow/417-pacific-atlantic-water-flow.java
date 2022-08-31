class Solution {
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        List<List<Integer>> ans = new ArrayList<>();
        boolean[][] pacific = new boolean[heights.length][heights[0].length];
        boolean[][] atlantic = new boolean[heights.length][heights[0].length];
        for(int i = 0;i<heights.length;i++){
            for(int j = 0;j<heights[i].length;j++){
                boolean[][] vis = new boolean[heights.length][heights[0].length];
                if(helperP(heights,i,j,heights[i][j], vis)){
                    pacific[i][j] = true;
                }
            }
        }
        for(int i = 0;i<heights.length;i++){
            for(int j = 0;j<heights[i].length;j++){
                boolean[][] vis = new boolean[heights.length][heights[0].length];
                if(helpera(heights,i,j,heights[i][j], vis)){
                    atlantic[i][j] = true;
                }
            }
        }
        for(int i = 0;i<heights.length;i++){
            for(int j = 0;j<heights[i].length;j++){
                List<Integer> asf = new ArrayList<>();
                if(atlantic[i][j] && pacific[i][j]){
                    asf.add(i); asf.add(j);
                    ans.add(new ArrayList<>(asf));
                }
            }
        }
        return ans;
    }
    
    boolean helperP(int[][] heights, int i, int j, int h, boolean[][] vis){
        if(i<0 || j<0) return true;
        if(i>=heights.length || j>=heights[0].length || vis[i][j] == true || heights[i][j] > h) return false;
        vis[i][j] = true;
        if(helperP(heights, i-1, j, heights[i][j], vis)) return true;                                     if(helperP(heights, i, j-1, heights[i][j], vis)) return true;
        if(helperP(heights, i+1, j, heights[i][j], vis)) return true;
        if(helperP(heights, i, j+1, heights[i][j], vis)) return true;
        return false;
    }
    boolean helpera(int[][] heights, int i, int j, int h, boolean[][] vis){
        if( i>=heights.length || j>=heights[0].length) return true;
        if(i<0 || j<0 ||vis[i][j] == true || heights[i][j] > h) return false;
        vis[i][j] = true;
        if(helpera(heights, i+1, j, heights[i][j], vis)) return true;                                     if(helpera(heights, i, j+1, heights[i][j], vis)) return true;
        if(helpera(heights, i-1, j, heights[i][j], vis)) return true;                                     if(helpera(heights, i, j-1, heights[i][j], vis)) return true;
        return false;
    }
}