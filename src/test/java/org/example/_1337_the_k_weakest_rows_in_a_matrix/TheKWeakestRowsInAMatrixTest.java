package org.example._1337_the_k_weakest_rows_in_a_matrix;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TheKWeakestRowsInAMatrixTest {

    TheKWeakestRowsInAMatrix theKWeakestRowsInAMatrix;

    @BeforeEach
    void init() {
        theKWeakestRowsInAMatrix = new TheKWeakestRowsInAMatrix();
    }

    @AfterEach
    void destroy() {
        theKWeakestRowsInAMatrix = null;
    }


    @Test
    void kWeakestRowsFirstExample() {
        int[][] mat = {{1,1,0,0,0}, {1,1,1,1,0}, {1,0,0,0,0}, {1,1,0,0,0}, {1,1,1,1,1}};
        int k = 3;
        int[] expected = {2,0,3};
        int[] actual = theKWeakestRowsInAMatrix.kWeakestRows(mat, k);
        assertArrayEquals(expected, actual);
    }

    @Test
    void kWeakestRowsSecondExample() {
        int[][] mat = {{1,0,0,0},{1,1,1,1},{1,0,0,0},{1,0,0,0}};
        int k = 2;
        int[] expected = {0,2};
        int[] actual = theKWeakestRowsInAMatrix.kWeakestRows(mat, k);
        assertArrayEquals(expected, actual);
    }
}