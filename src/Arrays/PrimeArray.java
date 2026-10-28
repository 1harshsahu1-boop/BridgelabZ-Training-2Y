package Arrays;

import java.util.Scanner;

public class PrimeArray {
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        } else {
            for(int i = 2; (double)i <= Math.sqrt((double)n); ++i) {
                if (n % i == 0) {
                    return false;
                }
            }

            return true;
        }
    }

    public static void printPrimeNumbers(int[] arr) {
        for(int i = 0; i < arr.length; ++i) {
            if (isPrime(arr[i])) {
                System.out.print(arr[i] + " ");
            }
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; ++i) {
            arr[i] = sc.nextInt();
        }

        printPrimeNumbers(arr);
    }
}
