package com.DataStructure.BinarySearch;

public class PeakElement {
    public static void main(String[] args) {
        int[] a = {5, 10, 20, 15};
//        int[] a = {10, 20, 15, 2, 23, 90, 67};
        System.out.println(PeakElementCode(a));
    }

    static int PeakElementCode(int[] a) {
        int start = 0, end = a.length-1;
        while(start<=end){
            int mid =  start +((end-start)/2);
            if(mid>0 && mid<a.length-1){
                if(a[mid]>a[mid-1] && a[mid]>a[mid+1]){
                    return mid;

                }
                else if(a[mid-1]>a[mid]){
                    end =  mid-1;
                }
                else{
                    start = mid+1;
                }
            }
            else if(mid==0){
                if(a[0]>a[1]){
                    return 0;
                }
                else{
                    return 1;
                }
            }
            else if(mid==a.length-1){
                if(a[a.length-1]>a[a.length-2]){
                    return a.length-1;
                }
                else{
                    return a.length-2;
                }
            }
        }
        return -1;
    }
}
