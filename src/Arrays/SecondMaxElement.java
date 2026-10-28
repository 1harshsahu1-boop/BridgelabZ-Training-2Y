package Arrays;

import java.util.Scanner;

public class SecondMaxElement {
    public static int secondLargest(int[] arr) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; ++i) {
            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];
            } else if (arr[i] > secondMax && arr[i] != max) {
                secondMax = arr[i];
            }
        }

        return secondMax;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; ++i) {
            arr[i] = sc.nextInt();
        }

        int result = secondLargest(arr);
        if (result != Integer.MIN_VALUE) {
            System.out.println("Second largest element = " + result);
        }

    }
}
