class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row=0;
        while(row<=matrix.length-1) {
            int col=0;
            while(col<=matrix[row].length-1){
                if(target==matrix[row][col]){
                    return true;
                }
                col++;
            }
            row++;
        } 
        return false;
    }
}