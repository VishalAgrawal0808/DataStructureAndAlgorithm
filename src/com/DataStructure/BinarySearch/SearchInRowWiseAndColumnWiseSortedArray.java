package com.DataStructure.BinarySearch;

import java.util.Arrays;

public class SearchInRowWiseAndColumnWiseSortedArray {
    public static void main(String[] args) {
        int[][] a =  {{10,  20, 30, 40},
                      {15, 25, 35, 45},
                      {27, 29, 37, 48},
                      {32, 33, 39, 50}
                     };
        int ele = 50;
        System.out.println(Arrays.toString(SearchInRowWiseAndColumnWiseSortedArrayCode(a, ele)));
    }

    static int[] SearchInRowWiseAndColumnWiseSortedArrayCode(int[][] a, int ele) {
        int  i=0, j=a[0].length-1;
//        for(i=0;i<a.length;i++){
//            for(j=a[0].length-1;j>=0;j--){
//                System.out.println(Arrays.toString(new int[]{a[i][j]}));
        while(i<a.length && j>=0){
                if(a[i][j]==ele){
                    return new int[]{i, j};
                }
                if(a[i][j]<ele){
                    i++;
                }
                else if(a[i][j]>ele){
                    j--;
                }

//            }
        }
        return new int[]{-1,  -1};
    }
}
