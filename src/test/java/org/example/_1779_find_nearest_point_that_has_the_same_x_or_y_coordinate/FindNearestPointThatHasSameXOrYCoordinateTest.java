package org.example._1779_find_nearest_point_that_has_the_same_x_or_y_coordinate;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindNearestPointThatHasSameXOrYCoordinateTest {

    FindNearestPointThatHasSameXOrYCoordinate findNearestPointThatHasSameXOrYCoordinate;

    @BeforeEach
    void init() {
        findNearestPointThatHasSameXOrYCoordinate = new FindNearestPointThatHasSameXOrYCoordinate();
    }

    @AfterEach
    void destroy() {
        findNearestPointThatHasSameXOrYCoordinate = null;
    }

    @Test
    void nearestValidPointShouldReturnTwo() {
        int x = 3, y = 4;
        int[][] points = {{1,2},{3,1},{2,4},{2,3},{4,4}};
        int expected = 2;
        int actual = findNearestPointThatHasSameXOrYCoordinate.nearestValidPoint(x, y, points);
        assertEquals(expected, actual);
    }

    @Test
    void nearestValidPointShouldReturnZero() {
        int x = 3, y = 4;
        int[][] points = {{3,4}};
        int expected = 0;
        int actual = findNearestPointThatHasSameXOrYCoordinate.nearestValidPoint(x, y, points);
        assertEquals(expected, actual);
    }

    @Test
    void nearestValidPointShouldReturnMinusOne() {
        int x = 3, y = 4;
        int[][] points = {{2,3}};
        int expected = -1;
        int actual = findNearestPointThatHasSameXOrYCoordinate.nearestValidPoint(x, y, points);
        assertEquals(expected, actual);
    }
}