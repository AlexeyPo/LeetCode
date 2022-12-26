package org.example._69_sqrt;

public class Sqrt {

    public int mySqrt(int x) {
        double temp = 1;
        double squareRoot;
        for (;;) {
            squareRoot = (temp + x / temp) / 2;
            if (Math.abs (temp - squareRoot) < 1e-10)  break;
            temp = squareRoot;
        }
        return (int) squareRoot;
    }
}
