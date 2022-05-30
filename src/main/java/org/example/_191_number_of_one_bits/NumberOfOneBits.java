package org.example._191_number_of_one_bits;

public class NumberOfOneBits {
    public int hammingWeight(int n) {
        int count = 32;
        int result = 0;

        while (count > 0) {
            int last = n & 1;
            if (last == 1) {
                result++;
            }
            n = n >> 1;
            count--;
        }
        return result;
    }
}
