package com.DataStructure.BinarySearch;

public class SearchAnElementInBitonicArray {
    public static void main(String[] args) {
        int[] a =  {1, 3, 50, 10, 9, 7, 6};
        int ele = 3;
        System.out.println(SearchAnElementInBitonicArrayCode(a, ele));
    }

    static int SearchAnElementInBitonicArrayCode(int[] a, int ele) {
        int pos = MaximumElementInBitonicArrayCode(a);
        int m = BinarySearchAlgorithmAscendingOrderCode(a, 0, pos-1, ele);
        int n = BinarySearchAlgorithmDescendingOrderCode(a, pos, a.length-1, ele);
        if(m==-1)
            return n;
        else
            return m;
    }

    static int MaximumElementInBitonicArrayCode(int[] a) {
        int start = 0, end = a.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;

            if((end == start+1) && a[start]>a[end]){
                return start;
            }
            if((end == start+1) && a[start]<a[end]){
                return end;
            }
            if (a[mid] > a[mid - 1] && a[mid] > a[mid + 1]) {
                return mid;
            }
            if (a[mid] > a[mid + 1] && a[mid] < a[mid - 1]) {
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return -1;
    }

    static int BinarySearchAlgorithmAscendingOrderCode(int[] a, int start, int end, int element) {
        while(start<=end){
            int mid = (start+end)/2;
            if(element == a[mid])
                return mid;
            else if(element>a[mid]){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return -1;
    }


    static int BinarySearchAlgorithmDescendingOrderCode(int[] a, int start, int end, int element) {
        while(start<=end){
            int mid = (start+end)/2;
            if(element == a[mid])
                return mid;
            else if(element>a[mid]){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return -1;
    }






}
