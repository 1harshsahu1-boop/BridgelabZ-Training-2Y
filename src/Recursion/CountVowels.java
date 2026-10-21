package Recursion;

import java.util.Scanner;

public class CountVowels {
    public static int countVowels(String str) {
        if (str == null || str.equals("")) {
            return 0;
        }
        char ch = Character.toLowerCase(str.charAt(0));
        int isVowel = (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') ? 1 : 0;
        return isVowel + countVowels(str.substring(1));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(countVowels(s));
    }
}