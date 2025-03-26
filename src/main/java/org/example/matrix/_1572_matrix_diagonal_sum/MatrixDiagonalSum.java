package org.example.matrix._1572_matrix_diagonal_sum;

public class MatrixDiagonalSum {
    public int diagonalSum(int[][] mat) {
        int result = 0;
        int len = mat.length;
        for (int i = 0; i < len; i++) {
            result += mat[i][i] + mat[i][len - 1 - i];
        }
        if (len % 2 == 1) {
            result -= mat[len / 2][len / 2];
        }
        return result;
    }

    public int diagonalSumVersionTwo(int[][] mat) {
        int result = 0;
        for (int i = 0, j = 0; i < mat.length / 2; i++, j++) {
            result += mat[i][j]
                    + mat[i][mat.length - 1 - j]
                    + mat[mat.length - 1 - i][j]
                    + mat[mat.length - 1 - i][mat.length - 1 - j];
        }
        if (mat.length % 2 == 1) {
            result += mat[mat.length / 2][mat.length / 2];
        }
        return result;
    }
}
