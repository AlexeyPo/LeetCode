package org.example._1337_the_k_weakest_rows_in_a_matrix;

import java.util.Arrays;
import java.util.Comparator;

public class TheKWeakestRowsInAMatrix {

    public int[] kWeakestRows(int[][] mat, int k) {
        int[][] countedMatrix = getCountedMatrix(mat);
        Arrays.sort(countedMatrix, Comparator.comparingInt(num -> num[0]));
        return getCutMatrix(countedMatrix, k);
    }

    private int[][] getCountedMatrix(int[][] mat) {
        int countedSum = 0;
        int[][] result = new int[mat.length][2];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                countedSum += mat[i][j];
            }
            for (int k = 0; k < result[i].length - 1; k++) {
                result[i][k] = countedSum;
                result[i][k + 1] = i;
            }
            countedSum = 0;
        }
        return result;
    }

    private int[] getCutMatrix(int[][] countedMatrix, int key) {
        int[] result = new int[key];
        for (int i = 0; i < key; i++) {
            result[i] = countedMatrix[i][1];
        }
        return result;
    }
}
