package org.example._1281_subtract_the_product_and_sum_of_digits_of_an_integer;

public class SubtractProductAndSumOfDigitsOfInteger {

    public int subtractProductAndSum(int n) {
        int product = 1;
        int sum = 0;
        String temp = Integer.toString(n);

        for (int i = 0; i < temp.length(); i++) {
            product *= temp.charAt(i) - '0';
            sum += temp.charAt(i) - '0';
        }

        return product - sum;
    }

    public int subtractProductAndSumSecondVariant(int n) {
        int product = 1;
        int sum = 0;
        while (n > 0) {
            int value = n % 10;
            product *= value;
            sum += value;
            n = n / 10;
        }
        return product - sum;
    }
}
