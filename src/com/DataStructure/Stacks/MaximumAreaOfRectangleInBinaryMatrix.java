package com.DataStructure.Stacks;

import java.util.Arrays;
import java.util.Stack;

public class MaximumAreaOfRectangleInBinaryMatrix {
    public static void main(String[] args) {
//        int[][] a = {{0, 1, 1, 0},
//                     {1, 1, 1, 1},
//                     {1, 1, 1, 1},
//                     {1, 1, 0, 0}};

        int[][] a = {{0, 1, 1},
                     {1, 1, 1},
                     {0, 1, 1}};
        System.out.println(MaximumAreaOfRectangleInBinaryMatrixStack(a));
    }

    static int MaximumAreaOfRectangleInBinaryMatrixStack(int[][] a){
        int maxArea = Integer.MIN_VALUE;
        int[] b = new int[a[0].length];
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                if(a[i][j]==0){
                    b[j]=0;
                }
                else{
                    b[j]+=a[i][j];
                }
            }
//            System.out.println(Arrays.toString(b));
            maxArea = Math.max(MaximumAreaOfHistogramStack(b), maxArea);
        }
        return maxArea;
    }

    static int MaximumAreaOfHistogramStack(int[] a){
        int maxArea = Integer.MIN_VALUE;
        int[] left = new int[a.length];
        int[] right = new int[a.length];


        left = NearestSmallerToLeft(a);
        right = NearestSmallerToRight(a);


        for(int i=0;i<a.length;i++) {
            int area = (right[i] - left[i] - 1) * a[i];
//            System.out.println("area"+area);
            maxArea = Math.max(area, maxArea);
        }

        return maxArea;
    }

    static int[] NearestSmallerToLeft(int[] a){
        Stack<Integer> stack = new Stack<>();
        int[] b = new int[a.length];

        for(int i=0;i<a.length;i++){
            if(stack.isEmpty()){
                b[i] = -1;
            }
            else if(!stack.isEmpty() && a[stack.peek()]<a[i]){
                b[i] = stack.peek();
            }
            else if(!stack.isEmpty() && a[stack.peek()]>=a[i]){
                while(!stack.isEmpty() && a[stack.peek()]>=a[i]){
                    stack.pop();
                }
                if(stack.isEmpty()){
                    b[i] = -1;
                }
                else{
                    b[i] = stack.peek();
                }
            }
            stack.push(i);
        }
        return b;
    }

    static int[] NearestSmallerToRight(int[] a){
        Stack<Integer> stack = new Stack<>();
        int[] b = new int[a.length];

        for(int i=a.length-1;i>=0;i--){
            if(stack.isEmpty()){
                b[i] = a.length;
            }
            else if(!stack.isEmpty() && a[stack.peek()]<a[i]){
                b[i] = stack.peek();
            }
            else if(!stack.isEmpty() && a[stack.peek()]>=a[i]){
                while(!stack.isEmpty() && a[stack.peek()]>=a[i]){
                    stack.pop();
                }
                if(stack.isEmpty()){
                    b[i] = a.length;
                }
                else{
                    b[i] = stack.peek();
                }
            }
            stack.push(i);
        }
        return b;
    }
}