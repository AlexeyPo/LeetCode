package org.example._1029_two_city_scheduling;

import java.util.Arrays;
import java.util.Comparator;

public class TwoCityScheduling {

    public int twoCitySchedCost(int[][] costs) {
        Arrays.sort(costs, Comparator.comparingInt(cost -> (cost[0] - cost[1])));
        int cost = 0;

        for (int i = 0; i < costs.length / 2; i++) {
            cost += costs[i][0];
        }

        for (int i = costs.length / 2; i < costs.length; i++) {
            cost += costs[i][1];
        }

        return cost;
    }
}