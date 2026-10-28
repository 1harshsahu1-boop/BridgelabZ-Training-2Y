package Arrays;

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int count;
        for(count = 0; n > 0; n /= 10) {
            ++count;
        }

        System.out.print(count);
    }
}
