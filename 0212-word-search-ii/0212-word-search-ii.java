class Solution {
   class TrieNode{
        TrieNode[] children = new TrieNode[26];
        String word;
        TrieNode(){}
    }
    private int[][] directions = {{1, 0},{-1, 0},{0, 1},{0, -1}};
    public List<String> findWords(char[][] board, String[] words) {
        List<String> res = new ArrayList<>();
        if(board == null || board.length == 0 || board[0].length == 0){
            return res;
        }
        int m = board.length, n = board[0].length;
        TrieNode root = buildTree(words);
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                int index = board[i][j] - 'a';
                if(root.children[index] == null){
                    continue;
                }
                TrieNode p = root;
                boolean[][] visited = new boolean[m][n];
                dfs(p, i, j, res, board, visited);
            }
        }
        return res;
    }
    private TrieNode buildTree(String[] words){
        TrieNode root = new TrieNode();
        for(String word : words){
            TrieNode p = root;
            for(char c : word.toCharArray()){
                int index = c - 'a';
                if(p.children[index] == null){
                    p.children[index] = new TrieNode();
                }
                p = p.children[index];
            }
            p.word = word;
        }
        return root;
    }
    private void dfs(TrieNode p, int i, int j, List<String> res, char[][] board, boolean[][] visited){
        if(i >= board.length || i < 0 || j >= board[0].length || j < 0 || visited[i][j]){
            return;
        }
        if(p.children[board[i][j] - 'a'] == null){
            return;
        }
        if(p.children[board[i][j] - 'a'].word != null){
            res.add(p.children[board[i][j] - 'a'].word);
            p.children[board[i][j] - 'a'].word = null;  
           //since we have visited this leaf node, then set "word" null , make sure we do not visit it once again.
        }
        visited[i][j] = true;
        for(int[] dir : directions){
            int newX = i + dir[0];
            int newY = j + dir[1];
            dfs(p.children[board[i][j] - 'a'], newX, newY, res, board, visited);
        }
        visited[i][j] = false;  //very important backtracking!
    }
}

