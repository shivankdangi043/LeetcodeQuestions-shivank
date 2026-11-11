
class Solution {
    public void setZeroes(int[][] matrix) {

        int n = matrix.length;
        int m = matrix[0].length;

        boolean firstRow = false;
        boolean firstCol = false;

        // Step 1: Check first row
        for(int j = 0; j < m; j++) {
            if(matrix[0][j] == 0) {
                firstRow = true;
            }
        }

        // Step 2: Check first column
        for(int i = 0; i < n; i++) {
            if(matrix[i][0] == 0) {
                firstCol = true;
            }
        }

        // Step 3: Mark rows and columns
        for(int i = 1; i < n; i++) {
            for(int j = 1; j < m; j++) {
                if(matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        // Step 4: Set marked cells to zero
        for(int i = 1; i < n; i++) {
            for(int j = 1; j < m; j++) {
                if(matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }

        // Step 5: Handle first row
        if(firstRow) {
            for(int j = 0; j < m; j++) {
                matrix[0][j] = 0;
            }
        }

        // Step 6: Handle first column
        if(firstCol) {
            for(int i = 0; i < n; i++) {
                matrix[i][0] = 0;
            }
        }
    }
}
