package Arrays;

import java.util.Scanner;

public class MinElement {
    public static int MinElement(int[] arr) {
        int min = arr[0];

        for(int i = 1; i < arr.length; ++i) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        return min;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; ++i) {
            arr[i] = sc.nextInt();
        }

        int min = MinElement(arr);
        System.out.println("Minimum element = " + min);
    }
}
