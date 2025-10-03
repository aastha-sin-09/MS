240. Search a 2D Matrix II

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0){
            return false;
        }

        int rows = matrix.length;
        int cols = matrix[0].length;

        //top-right corner
        int row = 0;
        int col = cols - 1;

        while(row < rows && col >=0){
            int currVal = matrix[row][col];
            if(currVal == target) return true;
            else if(currVal > target) col--;
            else row++;
        }

        return false;
    }
}