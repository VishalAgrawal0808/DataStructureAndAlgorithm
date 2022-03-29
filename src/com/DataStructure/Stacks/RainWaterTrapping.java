package com.DataStructure.Stacks;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Stack;

public class RainWaterTrapping {
    public static void main(String[] args) {
//        int[] a = {3, 0, 0, 2, 0, 4};
//        int[] a = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        int[] a = {3, 0, 2, 0, 4};

        System.out.println(RainWaterTrappingCode(a));
    }

    private static int RainWaterTrappingCode(int[] a) {
        int[] b = new int[a.length];
        int[] left;
        int[] right;
        
        left = MaximumToLeft(a);
        right = MaximumToRight(a);

        System.out.println(Arrays.toString(left));
        System.out.println(Arrays.toString(right));

        for(int i=0;i<a.length;i++){
            b[i] =  Math.abs(Math.min(left[i], right[i])-a[i]);
        }
        System.out.println(Arrays.toString(b));
        int sum = 0;
        for(int i=0;i<b.length;i++){
            sum+=b[i];
        }

        return sum;
    }

    private static int[] MaximumToRight(int[] a) {
        int maxToRight = Integer.MIN_VALUE;
        int[] b = new int[a.length];
        for(int i=a.length-1;i>=0;i--){
            if(b.length==0){
                b[i] = a[i];
                maxToRight = a[i];
            }
            else{
                b[i] = Math.max(maxToRight, a[i]);
                maxToRight = Math.max(maxToRight, a[i]);
            }
        }
        return b;



    }

    private static int[] MaximumToLeft(int[] a) {
       int maxToLeft = Integer.MIN_VALUE;
       int[] b = new int[a.length];
       for(int i=0;i<a.length;i++){
           if(b.length==0){
               b[i] = a[i];
               maxToLeft = a[i];
           }
           else{
               b[i] = Math.max(maxToLeft, a[i]);
               maxToLeft = Math.max(maxToLeft, a[i]);
           }
       }
       return b;

    }
}
