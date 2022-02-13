package com.DataStructure;

public class basics {
    public static void main(String[] args) {
        System.out.println("Hello World");
        int res = 0;
        String str = "ABC";
        for(int i=0;i<str.length();i++){
            res^=str.charAt(i);
            System.out.println("res "+i+" :"+res);
        }

        String str1 = "DCCC";
        for(int i=0;i<str1.length();i++){
            res^=str1.charAt(i);
            System.out.println("res "+i+" :"+res);
        }
        System.out.println((char)res);
    }
}
