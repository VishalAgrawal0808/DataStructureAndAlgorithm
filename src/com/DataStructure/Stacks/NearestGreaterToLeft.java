package com.DataStructure.Stacks;

import java.util.Arrays;
import java.util.Stack;

public class NearestGreaterToLeft {
    public static void main(String[] args) {
//        int[] a = {1, 3, 2, 4};
        int[] a = {1, 3, 0, 0, 1, 2, 4};
//        System.out.println(Arrays.toString(NearestGreaterToLeftBrute(a)));
        System.out.println(Arrays.toString(NearestGreaterToLeftStack(a)));
    }

    static int[] NearestGreaterToLeftBrute(int[] a){
        int[] b = new int[a.length];
        for(int i=0;i<a.length;i++){
            int flag = 0;
            for(int j=i+1;j<a.length;j++){
                if(a[j]>a[i]){
                    b[i] = a[j];
                    flag = 1;
                    break;
                }
            }
            if(flag==0){
                b[i] = -1;
            }
        }
        return b;
    }

    static int[] NearestGreaterToLeftStack(int[] a){
        Stack<Integer> stack = new Stack<>();
        int[] b = new int[a.length];
        for(int i = 0;i<a.length;i++){
            if(stack.isEmpty()){
                b[i] = -1;
            }
            else if(!stack.isEmpty() && stack.peek()>a[i]){
                b[i] = stack.peek();
            }
            else if(!stack.isEmpty() && stack.peek()<=a[i]){
                while(!stack.isEmpty() && stack.peek()<=a[i]){
                    stack.pop();
                }
                if(stack.isEmpty()){
                    b[i] = -1;
                }
                else{
                    b[i] = stack.peek();
                }
            }
            stack.push(a[i]);
        }
        return b;
    }
}
