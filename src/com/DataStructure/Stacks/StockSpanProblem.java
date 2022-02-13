package com.DataStructure.Stacks;

import java.util.Arrays;
import java.util.Stack;

public class StockSpanProblem {
    public static void main(String[] args) {
        int[] a = {100, 80, 60, 70, 60, 75, 85};
//        int[] a =  { 10, 4, 5, 90, 120, 80 };
        System.out.println(Arrays.toString(StockSpanProblemStack(a)));
    }

    static int[] StockSpanProblemStack(int[] a){
        Stack<Integer> stack = new Stack<>();
        int[] b = new int[a.length];
        for(int i=0;i<a.length;i++){
            if(stack.isEmpty()){
                b[i] = i+1;
            }
            else if(!stack.isEmpty() && a[stack.peek()]>a[i]){
                b[i] = Math.abs(i-stack.peek());
            }
            else if(!stack.isEmpty() && a[stack.peek()]<=a[i]){
                while(!stack.isEmpty() && a[stack.peek()]<=a[i]){
                    stack.pop();
                }
                if(stack.isEmpty()){
                    b[i] = i+1;
                }
                else{
                    b[i] = Math.abs(i-stack.peek());
                }
            }
            stack.push(i);
        }

        return b;
    }
}
