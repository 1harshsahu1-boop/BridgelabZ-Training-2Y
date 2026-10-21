package Recursion;

import java.util.Scanner;

public class CountChar {
    public static int count(String str, char target) {
        if (str == null || str.equals("")) {
            return 0;
        }
        int match = (str.charAt(0) == target) ? 1 : 0;
        return match + count(str.substring(1), target);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char target = sc.next().charAt(0);
        System.out.println(count(s, target));
    }
}
