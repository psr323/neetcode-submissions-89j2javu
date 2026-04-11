class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int l = 0, r = matrix.length * matrix[0].length - 1;

        while(l <= r){

            int mid = l + (r - l)/2;

            int i = mid / matrix[0].length;
            int j = mid % matrix[0].length;
            int midEle = matrix[i][j];

            if( midEle == target) return true;
            
            if( midEle < target){
                l = mid + 1;
            } else {
                r = mid - 1;
            }
            
        }

        return false;
    }
}
