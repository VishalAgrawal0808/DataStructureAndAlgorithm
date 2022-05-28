package com.DataStructure.Recursion;

public class FibonacciSeries {      //0 1 1 2 3 5 8 13 21........
    public static void main(String[] args) {
        int n = 5;
        System.out.println(FibonacciSeriesCode(n));
    }

    private static int FibonacciSeriesCode(int n) {
        if(n<=1) {
            return n;
        }
        return FibonacciSeriesCode(n-1)+FibonacciSeriesCode(n-2);
    }
}
