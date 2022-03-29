package com.DataStructure.Stacks;

import java.util.Stack;

public class MinimumElementInStackUsingExtraSpace {
    public static Stack<Integer> stack1 = new Stack<>();
    public static Stack<Integer> stack2 = new Stack<>();

    int[] a = new int[6];

    public static void main(String[] args) {
        push(18);
        push(19);
        push(29);
        System.out.println(MinimumElementInStackUsingExtraSpaceCode());
        System.out.println(pop());
        push(15);
        push(16);
        System.out.println(pop());
        System.out.println(MinimumElementInStackUsingExtraSpaceCode());
    }

    private static void push(int ele){
        if(stack2.isEmpty() || ele<stack2.peek()){
            stack2.push(ele);
        }
        stack1.push(ele);
    }

    private static int pop(){
        int ele = 0;
        if(stack1.isEmpty()){
            ele =  -1;
        }
        else if(stack1.peek() == stack2.peek()){
            stack1.pop();
            ele =  stack2.pop();
        }
        else{
            ele =  stack1.pop();
        }
        return ele;
    }

    private static int MinimumElementInStackUsingExtraSpaceCode() {

        if(stack2.isEmpty()){
            return -1;
        }
        return stack2.peek();
    }
}

