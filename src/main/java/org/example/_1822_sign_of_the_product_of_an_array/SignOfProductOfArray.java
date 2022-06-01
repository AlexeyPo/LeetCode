package org.example._1822_sign_of_the_product_of_an_array;

public class SignOfProductOfArray {

    public int arraySign(int[] nums) {
        int product = 0;
        for (int num : nums) {
            if (num == 0)
                return 0;
            if (num < 0)
                product++;
        }
        return (product % 2 == 0) ? 1 : -1;
    }
}