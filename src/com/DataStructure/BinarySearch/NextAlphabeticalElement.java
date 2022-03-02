package com.DataStructure.BinarySearch;

public class NextAlphabeticalElement {
    public static void main(String[] args) {
        char[] a = {'a', 'b', 'f', 'h'};
        char ele = 'a';
        System.out.println(NextAlphabeticalElementCode(a, ele));
    }

    static char NextAlphabeticalElementCode(char[] a, char ele) {
        int start = 0, end = a.length-1;
        int result = Integer.MAX_VALUE;
        while(start<=end){
            int mid = (start+end)/2;
            if((int)a[mid]==(int)ele){
                start = mid+1;
            }
            else if((int)a[mid]<(int)ele){
                start = mid+1;
            }
            else{
                result = Math.min(a[mid], result);
                end = mid-1;
            }
        }
        return (char)result;
    }


}
