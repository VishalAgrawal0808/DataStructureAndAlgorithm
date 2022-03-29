package com.DataStructure.BinarySearch;

import java.util.Arrays;

public class AllocateMinimumNumberOfPages {
    public static void main(String[] args) {
//        int[] a = {10, 20, 30, 40};
        int[] a = {12, 34, 67, 90};
        int student = 2;
        System.out.println(AllocateMinimumNumberOfPagesCode(a, student));
    }

    static int AllocateMinimumNumberOfPagesCode(int[] a, int student) {
        int start = Arrays.stream(a).max().getAsInt();
        int end = Arrays.stream(a).sum();
        int result = -1;
//        System.out.println("start"+start+" end"+end);
        if (a.length < student) {
            return -1;
        }
        while (start <= end) {
            int mid = (start + end) / 2;
//            System.out.println("mid"+mid);
            if (isValid(a, student, mid) == true) {
//                System.out.println(mid);
                result = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return result;
    }

    static boolean isValid(int[] a, int student, int mid) {
        int s = 1;
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
            if (sum > mid) {
                s++;
                sum = a[i];
            }
            if (s > student) {
                return false;
            }
        }
        return true;
    }
}
