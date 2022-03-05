package com.DataStructure.BinarySearch;

public class FindMaximumElementInBitonicArray {
    public static void main(String[] args) {
//        int[] a = {1, 12, 10, 9, 8, 7, 6, 5,  4, 3, 2, 1, 0};
//        int a[] = { 1, 3, 50, 10, 9, 7, 6 };
//        int a[] = {1,2,3,4,3,2,1};
        int[] a = {8,12,4,3,2,1,0};
        System.out.println(FindMaximumElementInBitonicArrayCode(a));
    }

    static int FindMaximumElementInBitonicArrayCode(int[] a) {
        int start = 0, end = a.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;

                if((end == start+1) && a[start]>a[end]){
                    return a[start];
                }
                if((end == start+1) && a[start]<a[end]){
                    return a[end];
                }
                if (a[mid] > a[mid - 1] && a[mid] > a[mid + 1]) {
                    return a[mid];
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
//        int l = 0, r = arr.length-1;
//        while (l <= r) {
//
//            int m = l + (r - l) / 2; // m = (l + r) / 2
//
//            /****Base Cases Starts*****/
//
//        /* If there are two elements and first is greater
//           then the first element is maximum */
//            if ((r == l + 1) && arr[l] >= arr[r])
//                return arr[l];
//
//        /* If there are two elements and second is greater
//           then the second element is maximum */
//
//            if ((r == l + 1) && arr[l] < arr[r])
//                return arr[r];
//
//        /* If we reach a point where arr[mid] is greater
//           than both of its adjacent elements arr[mid-1] and
//           arr[mid+1], then arr[mid] is the maximum
//           element*/
//            if (arr[m] > arr[m + 1] && arr[m] > arr[m - 1])
//                return arr[m];
//
//            /****Base Case ends *****/
//
//            // move to left with l and r=m-1
//            if (arr[m] > arr[m + 1] && arr[m] < arr[m - 1])
//                r = m - 1;
//
//            else
//                l = m + 1; // move to right with l=m+1 and r
//        }
//        // if we reach here, then element was
//        // not present
//        return -1;
//    }
}
