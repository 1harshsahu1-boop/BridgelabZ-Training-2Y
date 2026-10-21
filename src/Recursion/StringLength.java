package Recursion;

import java.util.Scanner;

public class StringLength {
    public static int getLength(String str) {
        if (str == null || str.equals("")) {
            return 0;
        }
        return 1 + getLength(str.substring(1));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(getLength(s));
    }
}
