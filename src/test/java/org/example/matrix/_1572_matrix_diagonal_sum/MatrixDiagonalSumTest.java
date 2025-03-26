package org.example.matrix._1572_matrix_diagonal_sum;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MatrixDiagonalSumTest {

    MatrixDiagonalSum diagonalSum;

    @BeforeEach
    void setUp() {
        diagonalSum = new MatrixDiagonalSum();
    }

    @AfterEach
    void tearDown() {
        diagonalSum = null;
    }

    @Test
    void diagonalSumShouldReturnTwentyFive() {
        int[][] mat = {{1,2,3}, {4,5,6}, {7,8,9}};
        int expected = 25;
        int actual = diagonalSum.diagonalSum(mat);
        assertEquals(expected, actual);
    }

    @Test
    void diagonalSumShouldReturnEight() {
        int[][] mat = {{1,1,1,1}, {1,1,1,1}, {1,1,1,1}, {1,1,1,1}};
        int expected = 8;
        int actual = diagonalSum.diagonalSum(mat);
        assertEquals(expected, actual);
    }

    @Test
    void diagonalSumShouldReturnFive() {
        int[][] mat = {{5}};
        int expected = 5;
        int actual = diagonalSum.diagonalSum(mat);
        assertEquals(expected, actual);
    }
}