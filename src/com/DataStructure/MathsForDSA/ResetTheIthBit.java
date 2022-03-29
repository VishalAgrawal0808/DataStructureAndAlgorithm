package com.DataStructure.MathsForDSA;

public class ResetTheIthBit {
    public static void main(String[] args) {
        int a = 10;
        int ithBit = 2;
        System.out.println(newResult(a, ithBit));
    }

    private static int newResult(int a, int ithBit) {
        return (a&~(1<<(ithBit-1)));
    }
}
