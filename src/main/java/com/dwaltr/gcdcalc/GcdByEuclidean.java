package com.dwaltr.gcdcalc;

public class GcdByEuclidean {
    public static int gcdByEuclidAlgorithm(int a, int b) {
        int gcd = b;
        while (a % b != 0) {
            int rest = a % b;
            a = b;
            b = rest;
            gcd = b;
        }
        return gcd;
    }
}
