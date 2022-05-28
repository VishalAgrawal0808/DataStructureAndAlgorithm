package com.DataStructure.Recursion;

public class PrintNToOne {
    public static void main(String[] args) {
        int n = 7;
        PrintNToOneCode(n);
    }

    private static void PrintNToOneCode(int n) {
        if(n==1){
            System.out.print(n);
            return;
        }
        System.out.print(n+" -> ");
        PrintNToOneCode(n-1);
    }
}
