/*
 * InverteString.java
 * Copyright 2024 Gui Victor <Gui Victor@DESKTOP-M15AELM>
 */

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma string: ");
        String inputString = sc.nextLine();

        String invertedString = reverseString(inputString);

        System.out.println("String invertida: " + invertedString);
    }

    public static String reverseString(String str) {
        char[] chars = str.toCharArray();
        int start = 0;
        int end = chars.length - 1;

        while (start < end) {
            char temp = chars[start];
            chars[start] = chars[end];
            chars[end] = temp;

            start++;
            end--;
        }

        return new String(chars);
    }
}

