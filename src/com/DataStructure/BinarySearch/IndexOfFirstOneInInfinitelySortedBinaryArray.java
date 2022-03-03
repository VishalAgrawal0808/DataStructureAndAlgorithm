package com.DataStructure.BinarySearch;

public class IndexOfFirstOneInInfinitelySortedBinaryArray {
    public static void main(String[] args) {
        int[] a = {0,0, 0, 0, 0, 0,0, 0, 0, 0, 0, 0,0, 0, 0, 0, 1,1,  1, 1, 1,  1, 1, 1, 1, 1, 1, 1, 1, 1, 1,1,1  ,1, 1, 1,  1};
        int ele = 1;
        System.out.println(IndexOfFirstOneInInfinitelySortedBinaryArrayCode(a, ele));
    }

    static int IndexOfFirstOneInInfinitelySortedBinaryArrayCode(int[] a, int ele) {
        int start = 0, end = 1;
        while(ele!=a[end]){
            start = end;
            end = end*2;
        }
        return FirstOccurenceOfElement(a, start, end, ele);
    }

    static int FirstOccurenceOfElement(int[] a, int start, int end, int ele) {
        int result = 0;
        while(start<=end){
            int mid = (start+end)/2;
            if(a[mid]==ele){
                result = mid;
                end = mid-1;
            }
            else if(a[mid]!=ele){
                start = mid+1;
            }
        }
        return result;
    }
}
