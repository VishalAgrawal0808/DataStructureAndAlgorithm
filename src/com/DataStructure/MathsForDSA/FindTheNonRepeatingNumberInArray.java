package com.DataStructure.MathsForDSA;

public class FindTheNonRepeatingNumberInArray {
    public static void main(String[] args) {
        int[] a = {3, 2, 4, 1,  2, 1, 3, 6, 4};
        System.out.println(getNonRepeatingNumber(a));
     }

    private static int getNonRepeatingNumber(int[] a) {
        int unique = 0;
        for(int i:a){
            unique^=i;
        }
        return unique;
    }
}

