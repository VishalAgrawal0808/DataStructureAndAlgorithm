package com.DataStructure.BinarySearch;

public class FindElementInRotatedArray {
    public static void main(String[] args) {
        int[] a = {5, 6, 8, 11, 12, 15, 18, 2};
        int ele = 18;
        System.out.println(FindElementInRotatedArrayCode(a,  ele));
    }
    static int FindElementInRotatedArrayCode(int[] a,int ele){
        int start = 0, end = a.length-1, n = a.length;
        int minEle;

        while(start<=end){
            int mid = (start+end)/2;
            if(a[start]<=a[end]){
                int left, right=-1;

                left = CheckBinarySearch(a, 0, mid-1, ele);
                if(mid+1!=n){
                    right = CheckBinarySearch(a, mid+1, n-1, ele);
                }
                if(left == -1 && right == -1){
                    return -1;
                }
                else if(left!=-1){
                    return left;
                }
                else{
                    return right;
                }
            }
            int next = (mid+1)%n;
            int prev = (mid+n-1)%n;
            if(a[mid]<=a[prev] && a[mid]<=a[next]){
                minEle = mid;
                if(a[minEle]==ele){
                    return minEle;
                }
                int left, right=-1;

                left = CheckBinarySearch(a, 0, mid-1, ele);
                if(mid+1!=n){
                    right = CheckBinarySearch(a, mid+1, n-1, ele);
                }
                if(left == -1 && right == -1){
                    return -1;
                }
                else if(left!=-1){
                    return left;
                }
                else{
                    return right;
                }

            }
            else if(a[mid]>a[prev] && a[mid]>a[next]){
                mid++;
                minEle = mid;
                System.out.println("minEle"+minEle);
                if(a[minEle]==ele){
                    return minEle;
                }
                int left, right=-1;

                left = CheckBinarySearch(a, 0, mid-1, ele);
                if(mid+1!=n){
                    right = CheckBinarySearch(a, mid+1, n-1, ele);
                }
                if(left == -1 && right == -1){
                    return -1;
                }
                else if(left!=-1){
                    return left;
                }
                else{
                    return right;
                }
            }
            else if(a[start]<=a[mid]){
                start = mid;
            }
            else if(a[mid]<=a[end]){
                end = mid;
            }
        }
        return -1;

    }
    static int CheckBinarySearch(int[] a, int start, int end, int ele){

        while(start<=end){
            int mid = (start+end)/2;
            if(a[mid]==ele){
                return mid;
            }
            else if(ele<a[mid]){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return -1;
    }
}
