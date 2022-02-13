package com.DataStructure.BinarySearch;

public class BinarySearchAlgorithm {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int ele =  4;
        System.out.println(BinarySearchAlgorithmCode(arr, ele));
    }

    static boolean BinarySearchAlgorithmCode(int[] a, int element){
        int start = 0, end = a.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(element == a[mid])
                return true;
            else if(element>a[mid]){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return false;
    }
}
