package Arrays;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rev = 0;

        int ori;
        for(ori = n; n > 0; n /= 10) {
            int rem = n % 10;
            rev = rev * 10 + rem;
        }

        if (rev == ori) {
            System.out.println("palindrome");
        } else {
            System.out.println("not palindrome");
        }

    }
}
