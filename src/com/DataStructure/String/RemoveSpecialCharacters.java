package com.DataStructure.String;

import java.util.Scanner;

public class RemoveSpecialCharacters {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String string = sc.nextLine();
//        String newString = string.replaceAll("[^a-zA-Z0-9]", "");
//        System.out.println(newString);
        String s = "ABCD";
        char[] c = s.toCharArray();
//          char c = 'b';
//          if(
        for(int i=0;i<c.length;i++){
            if(c[i]>='A' && c[i]<='C'){
                System.out.println(c[i]);
            }
        }
    }
}
