package Arrays;

import java.util.Scanner;

public class FibonacciExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t1 = 0;
        int t2 = 1;
        System.out.print(t1 + ", " + t2);

        for(int i = 3; i <= n; ++i) {
            int sum = t1 + t2;
            System.out.print(", " + sum);
            t1 = t2;
            t2 = sum;
        }

    }
}
