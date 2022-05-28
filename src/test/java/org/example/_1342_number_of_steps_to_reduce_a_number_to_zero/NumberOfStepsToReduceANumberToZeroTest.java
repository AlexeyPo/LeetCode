package org.example._1342_number_of_steps_to_reduce_a_number_to_zero;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberOfStepsToReduceANumberToZeroTest {

    NumberOfStepsToReduceANumberToZero numberOfStepsToReduceANumberToZero;

    @BeforeEach
    void init() {
        numberOfStepsToReduceANumberToZero = new NumberOfStepsToReduceANumberToZero();
    }

    @AfterEach
    void destroy() {
        numberOfStepsToReduceANumberToZero = null;
    }

    @Test
    void numberOfStepsShouldReturnSix() {
        int num = 14;
        int expected = 6;
        int actual = numberOfStepsToReduceANumberToZero.numberOfSteps(num);
        assertEquals(expected, actual);
    }

    @Test
    void numberOfStepsShouldReturnFour() {
        int num = 8;
        int expected = 4;
        int actual = numberOfStepsToReduceANumberToZero.numberOfSteps(num);
        assertEquals(expected, actual);
    }

    @Test
    void numberOfStepsShouldReturnTwelve() {
        int num = 123;
        int expected = 12;
        int actual = numberOfStepsToReduceANumberToZero.numberOfSteps(num);
        assertEquals(expected, actual);
    }
}