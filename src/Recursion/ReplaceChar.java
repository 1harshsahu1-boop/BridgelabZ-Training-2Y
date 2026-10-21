package Recursion;

import java.util.Scanner;

public class ReplaceChar {
    public static String replaceA(String str) {
        if (str == null || str.equals("")) {
            return "";
        }
        char ch = str.charAt(0);
        if (ch == 'a') {
            return 'b' + replaceA(str.substring(1));
        } else {
            return ch + replaceA(str.substring(1));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(replaceA(s));
    }
}
