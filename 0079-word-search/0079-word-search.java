class Solution {
    public boolean exist(char[][] board, String word) {
        boolean[][] vis = new boolean[board.length][board[0].length];
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[i].length; j++){
                if((word.charAt(0) == board[i][j]) && helper(board, word, i, j, vis, 0)){
                    return true;
                }
            }
        }
        return false;
    }
    
    public boolean helper(char[][] board, String word, int i, int j, boolean[][] vis, int idx){
        if(idx == word.length()) return true;
        if(i<0 || i>=board.length || j<0 || j>=board[0].length || vis[i][j] || board[i][j] != word.charAt(idx)){
            return false;
        }
              
        vis[i][j] = true;
        if(helper(board, word, i+1, j, vis, idx+1)) return true;
        if(helper(board, word, i, j+1, vis, idx+1)) return true;
        if(helper(board, word, i-1, j, vis, idx+1)) return true;
        if(helper(board, word, i, j-1, vis, idx+1)) return true;
        vis[i][j] = false;
        
        
        return false;
        
    }
}