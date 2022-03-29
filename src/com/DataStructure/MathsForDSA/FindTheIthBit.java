package com.DataStructure.MathsForDSA;

public class FindTheIthBit {
    public static void main(String[] args) {
        int number = 54;
        int ithBit = 1;
        System.out.println(BitIs(number, ithBit));;
    }

    private static int BitIs(int number, int ithBit) {
//        System.out.println(1<<ithBit-1);
        return ((number&(1<<ithBit-1))>>ithBit-1);
    }
}
