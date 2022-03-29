package com.DataStructure.MathsForDSA;

import java.util.Scanner;

public class CheckIfNumberIsOddOrEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(isOdd(a));
    }

    private static boolean isOdd(int a) {
        return ((a&1)==1);
    }

}
