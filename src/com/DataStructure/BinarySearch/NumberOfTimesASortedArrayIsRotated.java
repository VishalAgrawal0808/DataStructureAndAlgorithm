package com.DataStructure.BinarySearch;

public class NumberOfTimesASortedArrayIsRotated {
    public static void main(String[] args) {
        int[] a = { 5, 6, 8, 11, 12, 15, 18, 2};
        System.out.println(NumberOfTimesASortedArrayIsRotatedCode(a));
    }

    static int NumberOfTimesASortedArrayIsRotatedCode(int[] a){
        int start = 0, end = a.length-1;
        int n = a.length;
        int minEle = -1;
        if(a[start]<=a[end]){
            return 0;
        }
        while(start<=end){
            int mid = (start+end)/2;
            int next = (mid+1)%n;
            int prev = (mid+n-1)%n;
            if(a[mid]<=a[next] && a[mid]<=a[prev]){
                minEle = mid;
                break;
            }
            else if(a[mid]>a[prev] && a[mid]>a[next]){
                minEle = mid+1;
                break;
            }
            else if(a[start]<=a[mid]){
                start = mid;
            }
            else if(a[mid]<=a[end]){
                end = mid;
            }
        }

        return (n-minEle);
    }

}
