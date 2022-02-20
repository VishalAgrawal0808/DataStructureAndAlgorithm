package com.DataStructure.BinarySearch;

public class FindFloorOfAnElement {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 8, 10, 10, 12, 19};
        int ele = 8;
        System.out.println(FindFloorOfAnElementCode(a, ele));
    }

    static int FindFloorOfAnElementCode(int[] a, int ele){
        int start = 0, end = a.length;
        int result = Integer.MIN_VALUE;
        while(start<=end){
            int mid = (start+end)/2;
            if(a[mid]==ele){
                return a[mid];
            }
            else if(a[mid]>ele){
                end = mid-1;
            }
            else if(a[mid]<ele){
                result = Math.max(result, a[mid]);
                start = mid+1;
            }
        }
        return result;
    }
}
