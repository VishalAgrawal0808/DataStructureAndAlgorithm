package com.DataStructure.MathsForDSA;

public class SetTheIthBit {
    public static void main(String[] args) {
        int a = 42;
        int ithBit = 1;
        System.out.println(newResult(a, ithBit));
    }

    private static int newResult(int a, int ithBit) {
        return a|(1<<ithBit-1);
    }
}
