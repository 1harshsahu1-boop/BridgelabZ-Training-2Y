package Arrays;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int rev;
        for(rev = 0; n > 0; n /= 10) {
            int rem = n % 10;
            rev = rev * 10 + rem;
        }

        System.out.println(rev);
    }
}