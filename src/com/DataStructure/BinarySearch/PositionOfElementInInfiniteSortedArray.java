package com.DataStructure.BinarySearch;

public class PositionOfElementInInfiniteSortedArray {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 17, 18, 19, 20, 21};
        int ele = 11;
        System.out.println(PositionOfElementInInfiniteSortedArrayCode(a, ele));
    }

    static int PositionOfElementInInfiniteSortedArrayCode(int[] a, int ele) {
        int start = 0, end=1;
        while(ele>a[end]){
            start = end;
            end = end*2;
        }
        return BinarySearch(a, start, end, ele);

    }

    static int BinarySearch(int[] a, int start, int end, int ele){
        while(start<=end){
            int mid = (start+end)/2;
            if(a[mid]==ele){
                return mid;
            }
            else if(ele>a[mid]){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return -1;
    }


}
