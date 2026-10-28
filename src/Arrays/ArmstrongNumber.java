package Arrays;

import java.util.Scanner;

public class ArmstrongNumber {
    public static int count(int n) {
        int count;
        for(count = 0; n > 0; ++count) {
            n /= 10;
        }

        return count;
    }

    public static boolean isArmstrong(int n) {
        int original = n;
        int sum = 0;

        for(int d = count(n); n > 0; n /= 10) {
            int rem = n % 10;
            sum += (int)Math.pow((double)rem, (double)d);
        }

        return sum == original;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (isArmstrong(n)) {
            System.out.println("Armstrong number");
        } else {
            System.out.println("Not Armstrong number");
        }

    }
}
