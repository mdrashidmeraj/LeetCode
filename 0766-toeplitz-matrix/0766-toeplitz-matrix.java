class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;
        int[] arr = new int[r+c-1];
        Arrays.fill(arr, -1);
        for(int i =0; i<r;i++){
            for(int j= 0; j<c;j++){
                if(arr[i-j+c-1] == -1) arr[i-j+c-1] = matrix[i][j];
                else if(arr[i-j+c-1] != matrix[i][j]) return false;
            }
        }
        return true;
    }
}