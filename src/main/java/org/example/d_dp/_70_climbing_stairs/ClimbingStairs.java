package org.example.d_dp._70_climbing_stairs;

public class ClimbingStairs {

    public int climbStairs(int n) {
        int previous;
        int current = 1;
        int next = 1;

        while (n > 0) {
            previous = current;
            current = next;
            next = previous + current;
            n--;
        }

        return current;
    }
}
