class Solution {
    public int[][] transpose(int[][] matrix) {
        
        int ROWS = matrix.length; //row
        int COLS = matrix[0].length; //col
        int[][] res = new int[COLS][ROWS];

        for(int i = 0 ; i < ROWS ; i++){
            for(int j = 0 ; j < COLS; j++){

                res[j][i] = matrix[i][j];
                
            }
        }

        return res;

    }
}