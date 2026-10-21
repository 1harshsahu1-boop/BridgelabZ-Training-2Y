package Recursion;

import java.util.Scanner;

public class StringEquals {
    public static boolean areEqual(String s1, String s2) {
        if (s1.equals("") && s2.equals("")) {
            return true;
        }
        if (s1.equals("") || s2.equals("")) {
            return false;
        }
        if (s1.charAt(0) != s2.charAt(0)) {
            return false;
        }
        return areEqual(s1.substring(1), s2.substring(1));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        System.out.println(areEqual(s1, s2));
    }
}