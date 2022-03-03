package com.DataStructure.BinarySearch;

public class MinimumDifferenceElementInASortedArray {
    public static void main(String[] args) {
        int[] a = {1, 3, 8, 10, 12, 15};
        int key = 13;
        System.out.println(MinimumDifferenceElementInASortedArrayCodeMethod1(a, key));
        System.out.println(MinimumDifferenceElementInASortedArrayCodeMethod2(a, key));

    }

    static int MinimumDifferenceElementInASortedArrayCodeMethod2(int[] a, int key) {
        int floor = FindFloorOfAnElementCode(a, key);
        int ceil = FindCeilOfAnElementCode(a, key);

        if(Math.abs(floor-key)<=Math.abs(ceil-key)){
            return floor;
        }
        else{
            return ceil;
        }


    }

    static int FindFloorOfAnElementCode(int[] a, int ele){
        int start = 0, end = a.length-1;
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

    static int FindCeilOfAnElementCode(int[] a, int ele){
        int start = 0, end = a.length-1;
        int result = Integer.MAX_VALUE;
        while(start<=end){
            int mid = (start+end)/2;
            if(a[mid] == ele){
                return ele;
            }
            else if(a[mid]<ele){
                start = mid+1;
            }
            else{
                result = Math.min(result, a[mid]);
                end = mid-1;
            }
        }
        return result;
    }

    static int MinimumDifferenceElementInASortedArrayCodeMethod1(int[] a, int key) {
        int start = 0, end = a.length-1;
        if(key>=a[end]){
            return a[end];
        }
        else if(key<=a[start]){
            return a[start];
        }
        while(start<=end){
            int mid = (start+end)/2;
            if(a[mid]==key){
                return key;
            }
            else if(a[mid]<key){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        if(Math.abs(a[start]-key)<Math.abs(a[end]-key)){
            return a[start];
        }
        else{
            return a[end];
        }
    }
}
