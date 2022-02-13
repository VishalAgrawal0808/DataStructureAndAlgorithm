package com.DataStructure.String;

import java.util.Scanner;

public class RemoveWhiteSpaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();

        String newString = string.replaceAll("\\s", "*");
        System.out.println(newString);
    }
}
