package com.DataStructure.BinarySearch;

import java.util.Arrays;

public class FirstAndLastOccurenceOfElement {
    public static void main(String[] args) {
        int[] a = {2, 4, 10, 10, 10, 18, 20};
        int ele = 10;
        System.out.println(Arrays.toString(FirstAndLastOccurenceOfElementCode(a, ele)));
    }

    static int[] FirstAndLastOccurenceOfElementCode(int[] a, int ele){
        int start = 0, end = a.length-1;
        int first = -1, last = -1;

        while(start<=end){
            int mid = (start+end)/2;
            if(ele==a[mid]){

                first = FirstOccurencee(a, start, mid-1, ele);
                last = LastOccurencee(a, mid+1, end, ele);
//                System.out.println(first+"---"+last);

                break;
            }
            else if(ele<a[mid]){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return new int[]{first, last};
    }

    static int FirstOccurencee(int[] a, int start, int end, int ele){
        int res = end+1;
        while(start<=end){
            int mid = (start+end)/2;
            if(ele==a[mid]){
                res = mid;
                end = mid-1;
            }
            else if(ele<a[mid]){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return res;
    }

    static int LastOccurencee(int[] a, int start, int end, int ele){
        int res = start-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(ele==a[mid]){
                res = mid;
                start = mid+1;
            }
            else if(ele<a[mid]){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return res;
    }
}
