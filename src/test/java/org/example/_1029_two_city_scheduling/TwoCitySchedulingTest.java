package org.example._1029_two_city_scheduling;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoCitySchedulingTest {

    TwoCityScheduling twoCityScheduling;

    @BeforeEach
    void init() {
        twoCityScheduling = new TwoCityScheduling();
    }

    @AfterEach
    void destroy() {
        twoCityScheduling = null;
    }

    @Test
    void twoCitySchedCostFirst() {
        int[][] costs = {{259,770},{448,54},{926,667},{184,139},{840,118},{577,469}};
        int expected = 1859;
        int actual = twoCityScheduling.twoCitySchedCost(costs);
        assertEquals(expected, actual);
    }

    @Test
    void twoCitySchedCostSecond() {
        int[][] costs = {{515,563},{451,713},{537,709},{343,819},{855,779},{457,60},{650,359},{631,42}};
        int expected = 3086;
        int actual = twoCityScheduling.twoCitySchedCost(costs);
        assertEquals(expected, actual);
    }
}
