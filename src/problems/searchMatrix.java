package problems;

public class searchMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        int matrixLen = matrix.length;
        int matrixColLen = matrix[0].length;
        if(matrixLen == 1) {
            for(int i = 0; i < matrix[0].length; i++) {
                if(matrix[0][i] == target) {
                    return true;
                }
            }
            return false;
        }
        for (int i = 0; i < matrixLen; i++) {
            if (matrix[i][0] > target) {
                return false;
            }
            for (int j = 0; j < matrixColLen; j++) {
                if(matrix[i][j] == target) {
                    return true;
                } else if(matrix[i][j] > target) {
                    break;
                }
            }
        }
        return false;
    }
}
