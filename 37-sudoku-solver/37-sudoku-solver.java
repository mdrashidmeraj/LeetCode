class Solution {
    public void solveSudoku(char[][] board) {
        solve(board);
    }
    boolean solve(char[][] board){
        for(int i = 0; i<9;i++){
            for(int j = 0; j<9;j++){
                if(board[i][j] == '.'){
                    for(char ch = '1'; ch<= '9'; ch++){
                        if(isValid(board, i, j, ch)){
                            board[i][j] = ch;
                            if(solve(board)) return true;
                            else
                                board[i][j] = '.';
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }


    boolean isValid(char[][] board, int i, int j, char ch){
        for(int k = 0;k<9;k++){
            if(board[i][k] == ch) return false;
            if(board[k][j] == ch) return false;
        }
        int r = 3 * (i/3);
        int c = 3 * (j/3);
        for(int k = 0; k<3; k++){
            for(int l = 0; l<3; l++){
                if(board[r+k][c+l] == ch) return false;
            }
        }
        return true;
    }
}