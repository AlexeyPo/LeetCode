package org.example._1491_average_salary_excluding_the_minimum_and_maximum_salary;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AverageSalaryExcludingMinimumAndMaximumSalaryTest {

    AverageSalaryExcludingMinimumAndMaximumSalary averageSalaryExcludingMinimumAndMaximumSalary;

    @BeforeEach
    void init() {
        averageSalaryExcludingMinimumAndMaximumSalary = new AverageSalaryExcludingMinimumAndMaximumSalary();
    }

    @AfterEach
    void destroy() {
        averageSalaryExcludingMinimumAndMaximumSalary = null;
    }

    @Test
    void averageFirstTest() {
        int[] salary = {4000,3000,1000,2000};
        double expected = 2500.00000;
        double actual = averageSalaryExcludingMinimumAndMaximumSalary.average(salary);
        double delta = 1e-5;
        assertEquals(expected, actual, delta);
    }

    @Test
    void averageSecondTest() {
        int[] salary = {1000,2000,3000};
        double expected = 2000.00000;
        double actual = averageSalaryExcludingMinimumAndMaximumSalary.average(salary);
        double delta = 1e-5;
        assertEquals(expected, actual, delta);
    }

    @Test
    void averageThirdTest() {
        int[] salary = {48000,59000,99000,13000,78000,45000,31000,17000,39000,37000,93000,77000,33000,28000,4000,54000,67000,6000,1000,11000};
        double expected = 41111.11111;
        double actual = averageSalaryExcludingMinimumAndMaximumSalary.average(salary);
        double delta = 1e-5;
        assertEquals(expected, actual, delta);
    }

}