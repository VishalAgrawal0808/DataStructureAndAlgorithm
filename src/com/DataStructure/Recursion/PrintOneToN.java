package com.DataStructure.Recursion;

public class PrintOneToN {
    public static void main(String[] args) {
        int n = 7;
        PrintOneToNCode(n);
    }

    private static void PrintOneToNCode(int n) {
        if(n==1){
            System.out.print(n+" -> ");
            return ;
        }
        PrintOneToNCode(n-1);
        System.out.print(n+" -> ");
//        return 0;
    }

}
