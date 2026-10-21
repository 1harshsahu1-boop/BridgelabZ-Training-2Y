package Recursion;

import java.util.Scanner;

public class PrintChars {
    public static void printLines(String str) {
        if (str == null || str.equals("")) {
            return;
        }
        System.out.println(str.charAt(0));
        printLines(str.substring(1));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        printLines(s);
    }
}
