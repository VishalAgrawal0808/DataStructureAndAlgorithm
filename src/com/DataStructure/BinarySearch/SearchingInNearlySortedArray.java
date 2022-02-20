package com.DataStructure.BinarySearch;

public class SearchingInNearlySortedArray {
    public static void main(String[] args) {
        int[] a = {5, 10, 30, 20, 40};
        int ele = 5;
        System.out.println(SearchingInNearlySortedArrayCode(a, ele));
    }

    static int SearchingInNearlySortedArrayCode(int[] a, int ele){
        int start = 0, end = a.length;
        while(start<=end){
            int mid = (start+end)/2;

            if(a[mid]==ele){
                return mid;
            }
            else if(mid-1>=0 && a[mid-1]==ele){
                return mid-1;
            }
            else if(mid+1<=a.length-1 && a[mid+1]==ele){
                return mid+1;
            }
            else if(mid-2>=0 && ele<a[mid]){
                end = mid-2;
            }
            else if(mid+2<=a.length-1 && ele>a[mid]){
                start = mid+2;
            }
            else{
                break;
            }
        }
        return -1;

    }
}
