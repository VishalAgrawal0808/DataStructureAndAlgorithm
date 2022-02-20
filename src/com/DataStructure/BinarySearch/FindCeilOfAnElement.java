package com.DataStructure.BinarySearch;

public class FindCeilOfAnElement {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 8, 10, 10, 12, 19};
        int ele = 5;
        System.out.println(FindCeilOfAnElementCode(a, ele));
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
}
