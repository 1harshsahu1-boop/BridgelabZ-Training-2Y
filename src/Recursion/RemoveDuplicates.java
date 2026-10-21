package Recursion;

import java.util.Scanner;

public class RemoveDuplicates {
    public static String removeDup(String str, String processed) {
        if (str == null || str.equals("")) {
            return "";
        }
        char ch = str.charAt(0);
        if (processed.indexOf(ch) != -1) {
            return removeDup(str.substring(1), processed);
        } else {
            return ch + removeDup(str.substring(1), processed + ch);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(removeDup(s, ""));
    }
}