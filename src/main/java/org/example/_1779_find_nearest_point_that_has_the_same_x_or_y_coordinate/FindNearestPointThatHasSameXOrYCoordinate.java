package org.example._1779_find_nearest_point_that_has_the_same_x_or_y_coordinate;

public class FindNearestPointThatHasSameXOrYCoordinate {
    public int nearestValidPoint(int x, int y, int[][] points) {
        int min = Integer.MAX_VALUE;
        int result = -1;
        for (int i = 0; i < points.length; i++) {
            if (points[i][0] == x || points[i][1] == y) {
                int distance = Math.abs(x - points[i][0]) + Math.abs(y - points[i][1]);
                if (min > distance) {
                    min = distance;
                    result = i;
                }
            }
        }
        return result;
    }
}
