package org.example._1491_average_salary_excluding_the_minimum_and_maximum_salary;

import java.util.Arrays;

public class AverageSalaryExcludingMinimumAndMaximumSalary {

    public double average(int[] salary) {
        double num = salary.length - 2;
        double sum = 0;
        Arrays.sort(salary);
        for (int sal: salary) {
            sum += sal;
        }
        sum = sum - salary[0] - salary[salary.length-1];
        return sum / num;
    }
}
